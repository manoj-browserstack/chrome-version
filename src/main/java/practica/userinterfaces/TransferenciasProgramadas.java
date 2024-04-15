package practica.userinterfaces;

import practica.models.Client;
import practica.tasks.login.Login;
import practica.utils.setDataClient;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.Matchers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransferenciasProgramadas {
    public static Client client = new Client();



//ingreso del usuario a trasferencias programadas
public static void IngresoTrasferenciasP(int cobisId) throws IOException {
    client = setDataClient.withCobisId(cobisId);
    theActorInTheSpotlight().attemptsTo(
            Login.with()
                    .user(client.getUser())
                    .password(client.getPassword())
    );
}


}
