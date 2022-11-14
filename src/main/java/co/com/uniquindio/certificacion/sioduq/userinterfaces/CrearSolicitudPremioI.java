package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearSolicitudPremioI extends PageObject {

    public static final Target INPUT_FECHA_PRESENTACION = Target.the("Dato fecha presentacion").located(By.name("fechaPresentacion"));
    public static final Target INPUT_AUTORES = Target.the("Dato autores").located(By.name("nombreAutores"));
    public static final Target INPUT_NUMERO_AUTORES = Target.the("Dato numeor autores").located(By.name("numeroAutores"));
    public static final Target INPUT_TITULO_TRABAJO = Target.the("Dato titulo trabajo").located(By.name("titulo"));
    public static final Target INPUT_PREMIO = Target.the("Dato premio").located(By.name("premio"));
    public static final Target INPUT_PRESENTADO_ANTES = Target.the("Dato presentado antes").located(By.name("presentadoAntes"));
    public static final Target INPUT_FECHA_ANTES = Target.the("Dato fecha antes").located(By.name("fechaAntes"));
    public static final Target INPUT_FECHA_OTORGAMIENTO = Target.the("Dato fecha otorgamiento").located(By.name("fechaOtorgamiento"));
    public static final Target INPUT_UNIVERSIDADES = Target.the("Dato universidades").located(By.name("universidades"));
    public static final Target INPUT_INSTITUCION = Target.the("Dato institucion").located(By.name("institucion"));
    public static final Target INPUT_DIFUSION = Target.the("Dato tipo difusion").located(By.name("tipoDifusion"));
}
