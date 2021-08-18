package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinEndUTestPage {
    public static final Target INPUT_PASSWORD= Target.the("select the university Choucair").located(By.id("password"));
    public static final Target INPUT_CONFIRM= Target.the("select the university Choucair").located(By.id("confirmPassword"));
    public static final Target INPUT_TERMS= Target.the("select the university Choucair").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span"));
    public static final Target INPUT_POLICY= Target.the("select the university Choucair").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span"));
    public static final Target BUTTON_NEXT = Target.the("button that shows us the registration form").located(By.id("laddaBtn"));
}
