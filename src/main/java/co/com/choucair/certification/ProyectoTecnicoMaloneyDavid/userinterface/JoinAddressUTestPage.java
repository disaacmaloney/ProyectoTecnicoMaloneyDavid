package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinAddressUTestPage {
    public static final Target INPUT_COUNTRY = Target.the("select the university Choucair").located(By.xpath("//div[4]/div[2]/div/div/div/span/span[2]"));
    public static final Target INPUT_CITY = Target.the("select the university Choucair").located(By.xpath("//img[@alt='Cursos y Certificaciones']"));
    public static final Target INPUT_CODE= Target.the("select the university Choucair").located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target.the("button that shows us the registration form").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/i"));

}
