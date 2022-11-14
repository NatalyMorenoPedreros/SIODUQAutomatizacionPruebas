package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearSolicitudPonenciaI extends PageObject {

    public static final Target INPUT_FECHA_PRESENTACION = Target.the("Dato fecha presentacion").located(By.name("fechaPresentacion"));
    public static final Target INPUT_AUTORES = Target.the("Dato autores").located(By.name("nombreAutores"));
    public static final Target INPUT_NUMERO_AUTORES = Target.the("Dato numeor autores").located(By.name("numeroAutores"));
    public static final Target INPUT_TITULO_PONENCIA = Target.the("Dato nombre ponencia").located(By.name("titulo"));
    public static final Target INPUT_ISBN = Target.the("Dato isbn o issn").located(By.name("isbn"));
    public static final Target INPUT_ANIO_PUBLICACION = Target.the("Dato anio publicacion").located(By.name("anioPublicado"));
    public static final Target INPUT_LUGAR_EVENTO = Target.the("Dato lugar evento").located(By.name("lugarEvento"));
    public static final Target INPUT_FECHA_EVENTO = Target.the("Dato fecha evento").located(By.name("fechaEvento"));
    public static final Target INPUT_NOMBRE_EVENTO = Target.the("Dato nombre evento").located(By.name("nombreEvento"));
    public static final Target INPUT_CERTIFICA = Target.the("Dato certifica primer vez").located(By.name("certificadoPrimeraVez"));
    public static final Target INPUT_DIFUSION = Target.the("Dato tipo difusion").located(By.name("tipoDifusion"));

}
