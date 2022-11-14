package co.com.uniquindio.certificacion.sioduq.stepdefinitions;

import co.com.uniquindio.certificacion.sioduq.model.DataCambioEstado;
import co.com.uniquindio.certificacion.sioduq.tasks.CambiarEstado;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CambiarEstadoSolicitudStepDefinitions {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
        theActorCalled("Nataly").attemptsTo(Open.url("http://localhost:8080/"));
    }

    @Dado("^que ingresa el nuevo estado$")
    public void queIngresaElNuevoEstado(List<DataCambioEstado> data) {
        theActorInTheSpotlight().attemptsTo(CambiarEstado.enLaPaginaCon(data.get(0)));
    }
}
