package co.com.uniquindio.certificacion.sioduq.tasks;

import co.com.uniquindio.certificacion.sioduq.model.SesionData;
import co.com.uniquindio.certificacion.sioduq.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

    private SesionData sesionData;

    public IniciarSesion(SesionData sesionData) {
        this.sesionData = sesionData;
    }

    public static IniciarSesion enLaPaginaCon(SesionData sesionData){
        return Tasks.instrumented(IniciarSesion.class, sesionData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(sesionData.getUsername().trim()).into(InicioSesionPage.INPUT_USERNAME),
                Enter.theValue(sesionData.getPassword().trim()).into(InicioSesionPage.INPUT_PASSWORD),
                Click.on(InicioSesionPage.BOTON_LOGIN)
        );
    }
}
