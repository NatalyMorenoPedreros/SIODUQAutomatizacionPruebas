package co.com.uniquindio.certificacion.sioduq.stepdefinitions;

import co.com.uniquindio.certificacion.sioduq.model.DatosQuestion;
import co.com.uniquindio.certificacion.sioduq.model.SesionData;
import co.com.uniquindio.certificacion.sioduq.questions.VerificarSesion;
import co.com.uniquindio.certificacion.sioduq.tasks.IniciarSesion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class IniciarSesionStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
        theActorCalled("Nataly").attemptsTo(Open.url("http://localhost:8080/"));
    }

    @Dado("^que ingreso las credenciales en la aplicacion$")
    public void queIngresoLasCredencialesEnLaAplicacion(List<SesionData> sesionData) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enLaPaginaCon(sesionData.get(0)));
    }

    @Entonces("^puedo ver la tabla de solicitudes$")
    public void puedoVerLaTablaDeSolicitudes(List<DatosQuestion> sesionData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarSesion.con(sesionData.get(0))));
    }
}
