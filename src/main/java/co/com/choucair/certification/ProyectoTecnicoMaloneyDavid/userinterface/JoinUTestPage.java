package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinUTestPage {
    public static final Target BUTTON_JOIN = Target.the("button that shows us the registration form").located(By.linkText("Join Today"));
    public static final Target INPUT_NAME = Target.the("button that shows us the registration form").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("button that shows us the registration form").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("button that shows us the registration form").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("button that shows us the registration form").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("button that shows us the registration form").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("button that shows us the registration form").located(By.id("birthYear"));
    public static final Target SELECT_LANGUAGES = Target.the("button that shows us the registration form").located(By.xpath("//div[@id='languages']/div/input"));
    public static final Target SELECT_LANGUAGES_01 = Target.the("button that shows us the registration form").located(By.cssSelector(".ui-select-highlight"));
    public static final Target BUTTON_NEXT = Target.the("button that shows us the registration form").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a/span"));


}
