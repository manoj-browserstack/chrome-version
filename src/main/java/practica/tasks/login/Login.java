
package practica.tasks.login;


import practica.interactions.Click;
import practica.interactions.WaitLoader;
import practica.interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static practica.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Login implements Task {
    private String user;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_USUARIO).text(user),
                WaitUntil.the(BUTTON_CONTINUAR, isClickable()),
                Click.on(BUTTON_CONTINUAR)

        );

        if (password != null) {
            actor.attemptsTo(
                WaitLoader.now(Duration.ofSeconds(5)),
                Write.in(TEXTFIELD_CONTRASENIA).text(password),
                WaitUntil.the(BUTTON_INICIAR_SESION, isClickable()),
                Click.on(BUTTON_INICIAR_SESION)
            );
        }
    }

    public Login user(String usuario){
        this.user = usuario;
        return  this;
    }

    public Login password(String contrasenia){
        this.password = contrasenia;
        return this;
    }

    public static Login with(){
        return Tasks.instrumented(Login.class);
    }
}

