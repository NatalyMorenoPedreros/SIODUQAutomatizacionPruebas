package co.com.uniquindio.certificacion.sioduq.interactions;

import co.com.uniquindio.certificacion.sioduq.util.UtilidadTiempo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static co.com.uniquindio.certificacion.sioduq.util.UtilidadTiempo.*;

public class Esperar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Awaitility.await().forever().pollInterval(30000, TimeUnit.MILLISECONDS).until(condicionExitosa());
    }

    public static Esperar unMomento(){
        return Tasks.instrumented(Esperar.class);
    }
}
