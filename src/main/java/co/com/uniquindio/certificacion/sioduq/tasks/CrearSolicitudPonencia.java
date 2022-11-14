package co.com.uniquindio.certificacion.sioduq.tasks;

import co.com.uniquindio.certificacion.sioduq.interactions.Esperar;
import co.com.uniquindio.certificacion.sioduq.model.DataBONPonencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitud.*;
import static co.com.uniquindio.certificacion.sioduq.userinterfaces.CrearSolicitudPonenciaI.*;

public class CrearSolicitudPonencia implements Task {

    private DataBONPonencia dataBONPonencia;

    public CrearSolicitudPonencia(DataBONPonencia dataBONPonencia) {
        this.dataBONPonencia = dataBONPonencia;
    }

    public static CrearSolicitudPonencia enLaPaginaCon(DataBONPonencia dataBONPonencia){
        return Tasks.instrumented(CrearSolicitudPonencia.class, dataBONPonencia);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_SOLICITUDES_BON),
                Click.on(BOTON_PONENCIA),
                Enter.theValue(dataBONPonencia.getFechapresentacion()).into(INPUT_FECHA_PRESENTACION),
                Enter.theValue(dataBONPonencia.getNombreautores()).into(INPUT_AUTORES),
                Enter.theValue(dataBONPonencia.getNumeroautores()).into(INPUT_NUMERO_AUTORES),
                Enter.theValue(dataBONPonencia.getTitulo()).into(INPUT_TITULO_PONENCIA),
                Enter.theValue(dataBONPonencia.getIsbn()).into(INPUT_ISBN),
                Enter.theValue(dataBONPonencia.getAniopublicacion()).into(INPUT_ANIO_PUBLICACION),
                Enter.theValue(dataBONPonencia.getLugarevento()).into(INPUT_LUGAR_EVENTO),
                Enter.theValue(dataBONPonencia.getFechaevento()).into(INPUT_FECHA_EVENTO),
                Enter.theValue(dataBONPonencia.getNombreevento()).into(INPUT_NOMBRE_EVENTO),
                Enter.theValue(dataBONPonencia.getCertificaprimervez()).into(INPUT_CERTIFICA),
                SelectFromOptions.byVisibleText(dataBONPonencia.getDifusion().trim()).from(INPUT_DIFUSION),
                Esperar.unMomento(),
                Click.on(BOTON_GUARDAR)
        );
    }
}
