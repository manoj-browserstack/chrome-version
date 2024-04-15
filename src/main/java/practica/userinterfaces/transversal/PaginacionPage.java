package practica.userinterfaces.transversal;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaginacionPage extends PageObject {
    //MENU LATERAL
    public static final Target PAG_SIGUIENTE = Target.the("Página Siguiente")
            .locatedBy("//span[@class='p-paginator-icon pi pi-angle-right']");
    public static final Target PAG_ANTERIOR = Target.the("Paginación Anterior")
            .locatedBy("//span[@class='p-paginator-icon pi pi-angle-left']");
    public static final Target LIST_PAGINAS = Target.the("Elementos paginación")
            .locatedBy("//span[@class='p-paginator-pages ng-star-inserted']//button");
    public static final Target PAG_SELECCION = Target.the("Página {0}")
            .locatedBy("//button[contains(@class,'p-paginator-page')][contains(text(),'{0}')]");
}
