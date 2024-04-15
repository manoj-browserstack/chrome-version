package practica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject{

    //Nombre HomePage
    public static final Target LABEL_HOMEPAGE = Target.the("Label HomePage")
            .locatedBy("//div[@class='app_logo' and contains(text(), '{0}')]");
    //Opciones menú lateral
    public static final Target BUTTON_MENU_LATERAL = Target.the("Boton Menu Lateral")
            .locatedBy("//*[contains(text(),'{0}')]//..//..//../div[@role='button']");
    public static final Target BUTTON_SUBMENU_LATERAL = Target.the("Boton Opcion Submenu Lateral")
            .locatedBy("//*[contains(text(),'{0}')]//..//..//..//.");
    public static final Target MODAL_SESION = Target.the("Modal Sesion")
            .locatedBy("(//div[@class='col-11 col-lg-5 col-md-8 col-sm-11 col-xl-5 lib-content-modal-body']//lib-button[@type='btn primary-yellow']//span[@class='p-button-label'])[2]");

}


