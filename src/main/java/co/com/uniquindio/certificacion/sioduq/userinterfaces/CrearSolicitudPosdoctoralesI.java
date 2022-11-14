package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearSolicitudPosdoctoralesI extends PageObject {

    public static final Target INPUT_FECHA_PRESENTACION = Target.the("Dato fecha presentacion").located(By.name("fechaPresentacion"));
    public static final Target INPUT_AUTORES = Target.the("Dato autores").located(By.name("nombreAutores"));
    public static final Target INPUT_NUMERO_AUTORES = Target.the("Dato numeor autores").located(By.name("numeroAutores"));
    public static final Target INPUT_TITULO = Target.the("Dato titulo de trabajo").located(By.name("titulo"));
    public static final Target INPUT_TITULO_DOCTORADO = Target.the("Dato titulo doctorado").located(By.name("tituloTrabajo"));
    public static final Target INPUT_FECHA_INICIO = Target.the("Dato fecha inicio").located(By.name("fechaInicio"));
    public static final Target INPUT_FECHA_FINALIZACION = Target.the("Dato fecha final").located(By.name("fechaFinaliza"));
    public static final Target INPUT_UNIVERSIDAD = Target.the("Dato entidad").located(By.name("entidad"));
}
