package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUTestPage {
    public static final Target BUTTON_LOGIN = Target.the("button that shows us the registration form").located(By.linkText("Log In"));

}
