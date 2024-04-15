package practica.tasks;
import practica.exceptions.OpenNavigatorException;
import practica.interactions.WaitLoader;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.model.environment.ConfiguredEnvironment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenWebdriver implements Task {
    private ConfiguredEnvironment configuredEnvironment;
    private PageObject page;
    private String url;
    private String url2;

    public OpenWebdriver(PageObject page) {
        this.page = page;
        this.url = configuredEnvironment.getConfiguration().getBaseUrl();

        WebDriver driver = getDriver();
        this.url2 = driver.getCurrentUrl();

    }

    @Override
    @Step("{0} abre el navegador en el sitio #url")
    public <T extends Actor> void performAs(T actor) {
        try {

            WaitLoader.now(Duration.ofSeconds(2));
            boolean x = url2.contains("https://www.saucedemo.com/");
            if(!x){
                actor.wasAbleTo(
                        Open.browserOn(page)

                );
            }

        } catch (Exception e) {
            throw new OpenNavigatorException(OpenNavigatorException.OPEN_THE_BROWSER_FAILED, e);
        }
    }

    public static OpenWebdriver on (PageObject page) {
        return Tasks.instrumented(OpenWebdriver.class, page);
    }
}
