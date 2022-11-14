package co.com.uniquindio.certificacion.sioduq.tasks;

import co.com.uniquindio.certificacion.sioduq.interactions.Esperar;
import co.com.uniquindio.certificacion.sioduq.model.DataPAPremio;
import co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitud;
import co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitudPremioI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitud.*;
import static co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitudPremioI.*;
import static co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitudPremioI.INPUT_UNIVERSIDADES;

public class CrearSolicitudPremio  implements Task {

    private DataPAPremio dataPAPremio;

    public CrearSolicitudPremio(DataPAPremio dataPAPremio) {
        this.dataPAPremio = dataPAPremio;
    }

    public static CrearSolicitudPremio enLaPaginaCon(DataPAPremio dataPAPremio){
        return Tasks.instrumented(CrearSolicitudPremio.class, dataPAPremio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_SOLICITUDES_PA),
                Click.on(BOTON_PREMIO),
                Enter.theValue(dataPAPremio.getFechapresentacion()).into(INPUT_FECHA_PRESENTACION),
                Enter.theValue(dataPAPremio.getNombreautores()).into(INPUT_AUTORES),
                Enter.theValue(dataPAPremio.getNumeroautores()).into(INPUT_NUMERO_AUTORES),
                Enter.theValue(dataPAPremio.getTitulotrabajo()).into(INPUT_TITULO_TRABAJO),
                Enter.theValue(dataPAPremio.getPremio()).into(INPUT_PREMIO),
                Enter.theValue(dataPAPremio.getPresentadoantes()).into(INPUT_PRESENTADO_ANTES),
                Enter.theValue(dataPAPremio.getFechaantes()).into(INPUT_FECHA_ANTES),
                Enter.theValue(dataPAPremio.getInstitucion()).into(INPUT_INSTITUCION),
                Enter.theValue(dataPAPremio.getFechaotorgamiento()).into(INPUT_FECHA_OTORGAMIENTO),
                Enter.theValue(dataPAPremio.getUniversidades()).into(INPUT_UNIVERSIDADES),
                SelectFromOptions.byVisibleText(dataPAPremio.getDifusion().trim()).from(INPUT_DIFUSION),
                Esperar.unMomento(),
                Click.on(BOTON_GUARDAR)
        );
    }
}
