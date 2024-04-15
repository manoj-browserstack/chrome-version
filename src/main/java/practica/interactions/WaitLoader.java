package practica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;

public class WaitLoader implements Interaction {
    private static Duration time;

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = as(actor).getDriver();
        new WebDriverWait(driver, time)
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='container-loader']")));

    }

    public static  WaitLoader now(Duration time){
                setTime(time);
        return Tasks.instrumented(WaitLoader.class);
    }

    private static void setTime(Duration timeExt) {
        time = timeExt;
    }
}
