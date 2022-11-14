package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PantallaSolicitud extends PageObject {

    public static final Target INPUT_PUNTAJE_TENTATIVO = Target.the("Puntaje tentativo").located(By.name("puntajeTentativo"));
    public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.name("botonguardarsolciitud"));
    public static final Target INPUT_ESTADO = Target.the("Estado de la solicitud").located(By.id("estado"));
    public static final Target ACCESO_SOLICITUD = Target.the("Estado de la solicitud").located(By.xpath("//a[contains(@href,'/observarSolicitud/23')]"));


}
