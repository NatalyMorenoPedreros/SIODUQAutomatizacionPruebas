package co.com.uniquindio.certificacion.sioduq.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input para username").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Inputd para contraseña").located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("Boton login").located(By.id("botonLogin"));
    public static final Target LISTA = Target.the("Cabecera de tabla").located(By.xpath("//div//h4"));
}
