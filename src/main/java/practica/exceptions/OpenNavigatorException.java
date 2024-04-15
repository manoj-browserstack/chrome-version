package practica.exceptions;


import net.serenitybdd.model.exceptions.SerenityManagedException;

public class OpenNavigatorException extends SerenityManagedException {
    public static final String OPEN_THE_BROWSER_FAILED = "Failed open the browser.";
    public OpenNavigatorException(String OPEN_THE_BROWSER_FAILED, Throwable testErrorException) {
        super(testErrorException);
    }
}
