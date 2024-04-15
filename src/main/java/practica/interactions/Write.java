package practica.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Write implements Interaction {
    private Target textField;
    private String text;
    private String nameField;
    private String type;

    public Write(Target textField){
        this.textField = textField;
        this.nameField = textField.getName();
    }

    @Override
    @Step("{0} escribe el texto #text en #nameField")
    public <T extends Actor> void performAs(T actor){
        switch (this.type){
            case "texto":
                actor.attemptsTo(
                        WaitUntil.the(textField, isVisible()).forNoMoreThan(20).seconds(),
                        Enter.theValue(text).into(textField)
                );
                break;

            case "monto":
                String myString = text;
                StringSelection stringSelection = new StringSelection(myString);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                WebDriver driver = as(actor).getDriver();
                actor.attemptsTo(
                        WaitUntil.the(textField, isVisible()).forNoMoreThan(20).seconds()
                );
                driver.findElement(By.xpath(textField.getCssOrXPathSelector())).sendKeys(Keys.chord(Keys.LEFT_CONTROL, "v"));
                break;
        }

    }

    public Write text(String text){
        this.text = text;
        this.type = "texto";
        return this;
    }

//    public Write amount(String amount){
//        this.text = amount;
//        this.type = "monto";
//        return this;
//    }

    public static Write in(Target textField){
        return Tasks.instrumented(Write.class, textField);
    }
}
