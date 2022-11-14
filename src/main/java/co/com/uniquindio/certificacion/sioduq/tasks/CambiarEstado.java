package co.com.uniquindio.certificacion.sioduq.tasks;

import co.com.uniquindio.certificacion.sioduq.interactions.Esperar;
import co.com.uniquindio.certificacion.sioduq.model.DataCambioEstado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.uniquindio.certificacion.sioduq.userinterfaces.PantallaSolicitud.*;

public class CambiarEstado implements Task {

    private DataCambioEstado dataCambioEstado;

    public CambiarEstado(DataCambioEstado dataCambioEstado) {
        this.dataCambioEstado = dataCambioEstado;
    }

    public static CambiarEstado enLaPaginaCon(DataCambioEstado dataCambioEstado){
        return Tasks.instrumented(CambiarEstado.class, dataCambioEstado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ACCESO_SOLICITUD),
                SelectFromOptions.byVisibleText(dataCambioEstado.getEstado().trim()).from(INPUT_ESTADO),
                Click.on(BOTON_GUARDAR),
                Esperar.unMomento()
        );
    }
}
