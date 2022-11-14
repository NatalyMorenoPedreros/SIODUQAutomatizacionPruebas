package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearSolicitudArticulosI extends PageObject {

    public static final Target INPUT_FECHA_PRESENTACION = Target.the("Dato fecha presentacion").located(By.name("fechaPresentacion"));
    public static final Target INPUT_AUTORES = Target.the("Dato autores").located(By.name("nombreAutores"));
    public static final Target INPUT_NUMERO_AUTORES = Target.the("Dato numeor autores").located(By.name("numeroAutores"));
    public static final Target INPUT_NOMBRE_ARTICULO = Target.the("Dato nombre articulo").located(By.name("nombre"));
    public static final Target INPUT_REVISTA = Target.the("Dato titulo revista").located(By.name("tituloRevista"));
    public static final Target INPUT_ISSN = Target.the("Dato issn").located(By.name("issn"));
    public static final Target INPUT_FECHA_ACEPTACION = Target.the("Dato fecha aceptacion").located(By.name("fechaAceptacion"));
    public static final Target INPUT_FECHA_PUBLICACION = Target.the("Dato fecha publicacion").located(By.name("fechaPublicacion"));
    public static final Target INPUT_CATEGORIA = Target.the("Dato categoria indexada").located(By.name("categoriaIndexada"));
    public static final Target INPUT_FECHA_INDEXACION = Target.the("Dato fecha indexacion").located(By.name("fechaIndexacion"));
    public static final Target INPUT_DERIVADO = Target.the("Dato proyecto investigacion").located(By.name("proyectoInvestigacion"));

    public static final Target INPUT_NUMERO_PROYECTO = Target.the("Dato fnumero proyecto").located(By.name("numeroProyecto"));
    public static final Target INPUT_PAIS = Target.the("Dato pais").located(By.name("pais"));
    public static final Target INPUT_EDITORIAL = Target.the("Dato editorial").located(By.name("editorial"));
    public static final Target INPUT_IDIOMA = Target.the("Dato nombre").located(By.name("idioma"));
    public static final Target INPUT_PAGINAS = Target.the("Dato paginas").located(By.name("paginas"));
    public static final Target INPUT_DESDE = Target.the("Dato pagina inicial").located(By.name("paginaInicial"));
    public static final Target INPUT_HASTA = Target.the("Dato pagina final").located(By.name("paginaFinal"));
    public static final Target INPUT_INSTITUCION = Target.the("Dato institucion").located(By.name("institucion"));
    public static final Target INPUT_SIR = Target.the("Dato sir").located(By.name("sir"));
    public static final Target INPUT_UNIVERSIDADES = Target.the("Dato universidades").located(By.name("universidades"));
    public static final Target INPUT_TIPO_ARTICULO = Target.the("Dato tipo difusion").located(By.name("tipoDifusion"));
    public static final Target INPUT_TIPO_REVISTA = Target.the("Dato tipo revista").located(By.name("tipoRevista"));

}
