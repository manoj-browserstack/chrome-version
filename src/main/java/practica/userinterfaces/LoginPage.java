package practica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final Target TEXTFIELD_USUARIO = Target.the("Campo Usuario")
            .locatedBy("//input[@id='user-name']");
    public static final Target TEXTFIELD_CONTRASENIA = Target.the("Campo Contraseña")
            .locatedBy("//input[@id='password']");
    public static final Target BUTTON_CONTINUAR =Target.the("Botón CONTINUAR")
            .locatedBy("//*[@id='login-button']");
    public static final Target BUTTON_INICIAR_SESION =Target.the("Botón INICIAR SESION")
            .locatedBy("//*[@id='login-button']");

    public static final Target TEXT_ERROR_LOGIN = Target.the("Error").locatedBy(
            "//h4[contains(text(),'Login incorrecto')]");
    public static final Target TEXT_INICIAR_SESION = Target.the("Iniciar sesión")
            .locatedBy("//h1[contains(text(),'Iniciar sesión')]");
    public static final Target TEXT_VERIFICACIONTRANS = Target.the("h3")
            .locatedBy("//div[@class='container mt-3']//h3");
    public static final Target TEXT_TRANSPROGRAM = Target.the("Transacciones programadas")
            .locatedBy("//span[contains(text(),'Transacciones programadas')]");


    public static final Target IMAGE_SECURITY_IMAGE = Target.the("Imagen de Seguridad")
            .locatedBy("//div[@class='image']");
    public static final Target TEXT_SECURITY_PHRASE = Target.the("Frase de Seguridad")
            .locatedBy("//p[@class='phrase']");

    public static final Target TEXT_LINK =Target.the("Link login")
            .locatedBy("//a[.='{0}']");

    public static final Target TEXT_BLOQUED_MESSAGE =Target.the("MessageUserBloqued")
            .locatedBy("//h4[.='Usuario bloqueado']");

    //inicio de sesion con usuario incorrecto
    public static final Target TEXT_LOGIN_INCORRECTO = Target.the("MensajeUsuarioIncorrecto")
            .locatedBy("//h4[.='Login incorrecto']");
    //configuracion de perfil de seguridad
    public static final Target TEXT_CONFIGURA_PERFIL_SEGURIDAD = Target.the("MensajeConfigurarPerfilSeguridad")
            .locatedBy("//h2[.='Configura tu perfil de seguridad']");


    public static final Target TEXT_VERIFICACION = Target.the("h2")
            .locatedBy("//div[@class='content-header__text']//h2");


    public static final Target TEXT_VERIFICACION_PANTALLA_INICIO = Target.the("h1")
            .locatedBy("//div[@class='col-12 col-sm-10 col-xl-5 d-flex align-items-center flex-column mt-4 mt-sm-5 mx-auto px-0']//h1");

    public static final Target TEXT_VERIFICACION_LOGIN = Target.the("h1")
            .locatedBy("//div[@class='col-12 col-sm-10 col-xl-5 d-flex align-items-center flex-column mt-4 mt-sm-5 mx-auto px-0']//h1");



    public static final Target BUTTON_ACEPTAR = Target.the("ACEPTAR")
            .locatedBy("//button[@class='btn primary-yellow p-button p-component']/span[contains(text(),'ACEPTAR')]/..");
    public static final Target BUTTON_CERRAR_SESION_LOGOUT = Target.the("CERRAR SESIÓN")
            .locatedBy("//button[@class='btn primary-black-border p-button p-component']/span[contains(text(),'CERRAR SESIÓN.')]/..");

    //dropdowns
    public static final Target BUTTON_DROPDOWN = Target.the("Consultar")
            .locatedBy("//div[@class='menu-option-label d-flex align-items-center p-0']/span[contains(text(),'Consultar.')]/..");



    //transferencias
    public static final Target TEXT_VERIFITRANSFERIR = Target.the("h3")
            .locatedBy("//h3");

    //ocultar y verificar transacciones
    public static final Target TEXT_VERIFICACIONTRANSS = Target.the("span")
            .locatedBy("//div[@class='p-breadcrumb p-component']//span");

    //gestion de favoritos
    public static final Target TEXT_FAVORITOS = Target.the("div con texto 'Gestionar mis favoritos'")
            .locatedBy("//div[contains(text(), 'Gestionar mis favoritos')]");

}
