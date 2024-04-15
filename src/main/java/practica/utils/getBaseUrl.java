package practica.utils;


import net.serenitybdd.model.environment.ConfiguredEnvironment;

public class getBaseUrl {
    private ConfiguredEnvironment configuredEnvironment;

    public String getBaseUrl() {
        return configuredEnvironment.getConfiguration().getBaseUrl();
    }
}
