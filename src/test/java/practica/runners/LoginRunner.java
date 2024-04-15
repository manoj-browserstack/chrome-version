package practica.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

/**
 * Runner class for the 'Favoritos Internacional' feature.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/1login.feature",
        glue = {"practica.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
