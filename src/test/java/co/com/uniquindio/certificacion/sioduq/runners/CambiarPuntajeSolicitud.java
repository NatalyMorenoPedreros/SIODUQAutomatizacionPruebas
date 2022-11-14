package co.com.uniquindio.certificacion.sioduq.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/cambio_puntaje_solicitud.feature",
        glue = "co.com.uniquindio.certificacion.sioduq.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CambiarPuntajeSolicitud {
    @Before
    public void test() {
        WebDriverManager.chromedriver().setup();
    }
}
