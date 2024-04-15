package practica.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
    private static Integer time;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            System.out.println("Esperando..." + time);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Wait now(Integer time){
                setTime(time);
        return Tasks.instrumented(Wait.class);
    }

    private static void setTime(Integer timeExt) {
        time = timeExt;
    }
}
