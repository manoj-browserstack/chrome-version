
package practica.tasks.login;


import practica.interactions.Click;
import practica.interactions.WaitLoader;
import practica.interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static practica.userinterfaces.LoginPage.BUTTON_CONTINUAR;
import static practica.userinterfaces.LoginPage.TEXTFIELD_USUARIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class VerifyLogin implements Task {
    private String user;
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_USUARIO).text(user),
                WaitUntil.the(BUTTON_CONTINUAR, isClickable()),
                Click.on(BUTTON_CONTINUAR)
        );
    }

    public VerifyLogin user(String usuario){
        this.user = usuario;
        return  this;
    }
    public static VerifyLogin with(){
        return Tasks.instrumented(VerifyLogin.class);
    }
}

