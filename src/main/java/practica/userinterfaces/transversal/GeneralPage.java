package practica.userinterfaces.transversal;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class GeneralPage {

    public static final Target RADIOBUTTON = Target.the("Abono a capital con reducción de tiempo")
            .locatedBy("//div[label[text()='Abono a capital con reducción de tiempo']]//preceding-sibling::div//input[@type='radio']");

    public static final Target RADIO_AbonoReduccionTiempo = Target.the("Radio button ")
            .locatedBy("//div[label[text()='Abono a capital con reducción de tiempo']]//preceding-sibling::div//input[@type='radio']");
    public static Target radioButtonOp(String radioButtonText) {
        return Target.the("Radio Button")
                .locatedBy(String.format("/div[label[text()='Abono a capital con reducción de tiempo']]//preceding-sibling::div//input[@type='radio']", radioButtonText));
    }


}
