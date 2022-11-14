package co.com.uniquindio.certificacion.sioduq.util;

import java.util.concurrent.Callable;

public class UtilidadTiempo {
    public UtilidadTiempo() {

    }

    public static Callable<Boolean> condicionExitosa(){
        return () -> true;
    }
}

