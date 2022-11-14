package co.com.uniquindio.certificacion.sioduq.stepdefinitions;

import co.com.uniquindio.certificacion.sioduq.model.DataBONPonencia;
import co.com.uniquindio.certificacion.sioduq.model.DataPAPremio;
import co.com.uniquindio.certificacion.sioduq.tasks.CrearSolicitudPonencia;
import co.com.uniquindio.certificacion.sioduq.tasks.CrearSolicitudPremio;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrearSolicitudStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
        theActorCalled("Nataly").attemptsTo(Open.url("http://localhost:8080/"));
    }

    @Dado("^que ingresa la informacion del formulario premio$")
    public void queIngresoLaInformacionDelFormularioPremio(List<DataPAPremio> data) {
        theActorInTheSpotlight().attemptsTo(CrearSolicitudPremio.enLaPaginaCon(data.get(0)));
    }

    @Dado("^que ingresa la informacion del formulario ponencia$")
    public void queIngresoLaInformacionDelFormularioPonencia(List<DataBONPonencia> data) {
        theActorInTheSpotlight().attemptsTo(CrearSolicitudPonencia.enLaPaginaCon(data.get(0)));
    }
}
