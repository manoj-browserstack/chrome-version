package practica.stepdefinitions;

import practica.models.Client;
import practica.questions.Verify;
import practica.tasks.OpenWebdriver;
import practica.userinterfaces.LoginPage;
import practica.userinterfaces.TransferenciasProgramadas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {
    public static Client client = new Client();
    private LoginPage page;
    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
//test
    //@After("@loginFrase")
    @Given("^(.*) accede a la nueva SVP$")
    public void clientWithCobisIdWantsToEnterToSVP(String nombre)  {
        theActor(nombre).wasAbleTo(
                OpenWebdriver.on(page)
        );
    }

    //ingreso del usuario a trasferencias programadas
    @When("^el cliente nuevo con cobisId (.*) ingresa su usuario y contraseña$")
    public void clientEnterTheCredentials(int cobisId) throws IOException {
        TransferenciasProgramadas.IngresoTrasferenciasP(cobisId);
    }

    @Then("^el cliente nuevo deberia ver el mensaje (.*) en (.*)$")
    public void ClientShouldSeeTheMenssageSaldosConsolidadosInTheMainScreen(String message, String screen) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Verify.with().text(message).in(screen)
                , Matchers.is(message)
        ));

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
