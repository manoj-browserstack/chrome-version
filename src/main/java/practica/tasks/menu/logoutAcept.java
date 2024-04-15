package practica.tasks.menu;

import net.serenitybdd.screenplay.targets.Target;

public class logoutAcept {

    public static final Target BUTTON_CERRAR_SESION = Target.the("p-button-label")
            .locatedBy("//span[contains(text(), 'CERRAR SESIÓN')]");

    public static final Target BUTTON_CERRAR_SESION_LOGOUT = Target.the("p-button-label")
            .locatedBy("//span[contains(text(), 'ACEPTAR')]");
}


