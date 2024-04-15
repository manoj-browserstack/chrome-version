package practica.questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import practica.userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Verify implements Question<String> {
    private static Target label;
    private static String message;

    @Step("verifica que se muestre el mensaje #message en #label")
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(label, isVisible()).forNoMoreThan(20).seconds()
        );

        // Obteniendo el WebDriver asociado con el actor
        WebDriver webDriver = BrowseTheWeb.as(actor).getDriver();

        // Localizando el elemento y obteniendo su texto
        WebElementFacade elementFacade = label.resolveFor(actor);
        String actualValue = elementFacade.getText();

        System.out.println("Valor obtenido de " + label + ": " + actualValue); // Diagnóstico

        return actualValue;
    }

    public Verify in(String lugar){
        switch (lugar){
            case "la pantalla de inicio":           this.label = HomePage.LABEL_HOMEPAGE.of(message); break;

        //dropdown transacciones programadas
        case "la pantalla de Consultar transacciones":            this.label = LoginPage.TEXT_VERIFICACIONTRANS; break;
        case "la pantalla de transacciones programadas":            this.label = LoginPage.TEXT_TRANSPROGRAM; break;

            //Extra


        }
        return this;
    }

    public Verify text(String message){
        this.message = message;
        return this;
    }

    public static Verify with(){
        return new Verify();
    }
}
