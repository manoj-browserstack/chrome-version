package practica.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Click implements Interaction {
    private Target element;
    private String elementName;

    public Click(Target element){
        this.element = element;
        this.elementName = element.getName();
    }

    @Override
    @Step("{0} presiona #element")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(element, isClickable()).forNoMoreThan(20).seconds(),
                net.serenitybdd.screenplay.actions.Click.on(element)
        );

        //elemento.resolveFor(actor).click();
    }

    public static Click on(Target element){
        return Tasks.instrumented(Click.class, element);
    }
}
