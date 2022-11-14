package co.com.uniquindio.certificacion.sioduq.questions;

import co.com.uniquindio.certificacion.sioduq.model.DatosQuestion;
import co.com.uniquindio.certificacion.sioduq.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarSesion implements Question<Boolean> {

    private DatosQuestion sesionData;

    public VerificarSesion(DatosQuestion sesionData) {
        this.sesionData = sesionData;
    }

    public static  VerificarSesion con(DatosQuestion sesionData){
        return new VerificarSesion(sesionData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return InicioSesionPage.LISTA.resolveFor(actor).getText().equals(sesionData.getMensaje());
    }
}
