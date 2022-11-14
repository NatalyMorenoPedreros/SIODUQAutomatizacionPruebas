package co.com.uniquindio.certificacion.sioduq.tasks;

import co.com.uniquindio.certificacion.sioduq.interactions.Esperar;
import co.com.uniquindio.certificacion.sioduq.model.DataCambioEstado;
import co.com.uniquindio.certificacion.sioduq.model.DataCambioPuntaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.uniquindio.certificacion.sioduq.userinterfaces.PantallaSolicitud.*;

public class CambiarPuntaje implements Task {

    private DataCambioPuntaje dataCambioPuntaje;

    public CambiarPuntaje(DataCambioPuntaje dataCambioPuntaje) {
        this.dataCambioPuntaje = dataCambioPuntaje;
    }

    public static CambiarPuntaje enLaPaginaCon(DataCambioPuntaje dataCambioPuntaje){
        return Tasks.instrumented(CambiarPuntaje.class, dataCambioPuntaje);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataCambioPuntaje.getPuntaje()).into(INPUT_PUNTAJE_TENTATIVO),
                Click.on(BOTON_GUARDAR),
                Esperar.unMomento()
        );
    }
}
