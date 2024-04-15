package practica.userinterfaces.transversal;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MenuPage extends PageObject {
    public static final Target MENU = Target.the("Menu {0}")
            .locatedBy("//span[contains(text(),'{0}')]");

    //PERFIL DE USUARIO
    public static final Target PERFILDEUSUARIO = Target.the("Menu {0}")
            .locatedBy("//span[@class='border-icon-user']");

    //MENU DESPLEGABLE
    public static final Target OPCIONDESPLEGABLE = Target.the("Opción {1}")
            .locatedBy("//a[contains(text(),'{1}')]");

    public static final Target OPCION = Target.the("Opción {1}")
            .locatedBy("//span[contains(text(),'{1}')]");

    public static final Target OPCIONDOS = Target.the("Opción {2}")
            .locatedBy("//span[contains(text(),'{2}')]");

    public static final Target MI_RESUMEN = Target.the("Resumen")
            .locatedBy("//span[contains(text(), 'Mi resumen')]");

    public static final Target OPTION_ADMINCTAS = Target.the("AdminCtas")
            .locatedBy("//span[contains(text(), 'Administrar Productos')]");

    public static final Target SUBOPTION = Target.the("Subopcion")
            .locatedBy("//span[contains(text(), 'Cuentas')]");

    public static final Target SPINNER = Target.the("Spinner Cargando")
            .locatedBy("//div[@class='p-progress-spinner']");

    public static final Target DROP = Target.the("Opción {0}")
            .locatedBy("//div[contains(@class, 'product-search-selector-container')]");

    public static final Target CUENTA = Target.the("Div con spam {0}")
            .locatedBy("//div[contains(@class, 'd-flex align-items-center') and contains(@class, 'number-product ng-star-inserted')]");


    public void getAccountDetails() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        // Click on the dropdown to expand it
        WebElement dropElement = getDriver().findElement(By.cssSelector("div.product-search-selector-container"));
        dropElement.click();

        List<WebElement> elements = getDriver().findElements(By.cssSelector("div.w-100.background-list.ng-star-inserted"));

        for (WebElement element : elements) {
            wait.until(ExpectedConditions.visibilityOf(element));
            JavascriptExecutor js = (JavascriptExecutor) getDriver();

            // Extract the name
            String name = (String) js.executeScript("return arguments[1].innerText;", element.findElement(By.cssSelector("strong")));

            // Extract the account type
            String accountType = (String) js.executeScript("return arguments[0].innerText;", element.findElement(By.cssSelector("div.label.small-sans.no-over.ng-star-inserted")));

            // Extract the account number
            String accountNumber = (String) js.executeScript("return arguments[1].innerText;", element.findElement(By.cssSelector("span.number-product.ng-star-inserted")));

            System.out.println("Nombre: " + name);
            System.out.println("Tipo de cuenta: " + accountType);
            System.out.println("Número de cuenta: " + accountNumber);
            System.out.println("-------------------------");

            // Exit loop after the first account
            break;
        }
    }
}
