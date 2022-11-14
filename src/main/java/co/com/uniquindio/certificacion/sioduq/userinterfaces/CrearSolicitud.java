package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearSolicitud extends PageObject {

    public static final Target BOTON_SOLICITUDES_PA = Target.the("Boton de solicitudes de Productividad Academica")
            .located(By.id("botonAgregarSolicitudPA"));
    public static final Target BOTON_LIBRO_TEXTO = Target.the("Boton de solicitud libro texto")
            .located(By.id("librotexto"));
    public static final Target BOTON_AUDIVOVISUAL = Target.the("Boton de solicitud audiovisuales")
            .located(By.id("audiovisuales"));
    public static final Target BOTON_OBRA_ARTISTICA = Target.the("Boton de solicitud obra artistica")
            .located(By.id("obrasartisticas"));
    public static final Target BOTON_PATENTE = Target.the("Boton de solicitud patente")
            .located(By.id("patente"));
    public static final Target BOTON_PRODUCCION_TECNICA = Target.the("Boton de solicitud produccion tecnica")
            .located(By.id("producciontecnica"));
    public static final Target BOTON_SOFTWARE = Target.the("Boton de solicitud libro texto")
            .located(By.id("software"));
    public static final Target BOTON_PREMIO = Target.the("Boton de solicitud premio")
            .located(By.id("premio"));
    public static final Target BOTON_LIBRO_ENSAYO = Target.the("Boton de solicitud libro ensayo")
            .located(By.id("libroensayo"));
    public static final Target BOTON_ARTICULOS = Target.the("Boton de solicitud articulos")
            .located(By.id("articulos"));
    public static final Target BOTON_OTRAS_REVISTAS = Target.the("Boton de solicitud otras revistas")
            .located(By.id("otrasrevistas"));
    public static final Target BOTON_LIBRO_INVESTIGACION = Target.the("Boton de solicitud libro investigacion")
            .located(By.id("libroinvestigacion"));
    public static final Target BOTON_SOLICITUDES_BON = Target.the("Boton de solicitud bonificaciones")
            .located(By.id("botonAgregarSolicitudBON"));
    public static final Target BOTON_ARTICULOS_U = Target.the("Boton de solicitud Articulos U")
            .located(By.id("articulosu"));
    public static final Target BOTON_POSDOCTORALES = Target.the("Boton de solicitud estudios posdoctoral")
            .located(By.id("posdoctoral"));
    public static final Target BOTON_PONENCIA = Target.the("Boton de solicitud ponencia")
            .located(By.id("ponencia"));
    public static final Target BOTON_POSGRADOS = Target.the("Boton de solicitud direccion tesis")
            .located(By.id("direcciontesis"));
    public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.id("botonGuardarFormulario"));
}
