package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinDevicesUTestPage {
    public static final Target INPUT_DEVICE= Target.the("select the university Choucair").located(By.xpath("//div[@id='mobile-device']/div/div[2]/div/div/span"));
    public static final Target LIST_DEVICE= Target.the("select the university Choucair").located(By.xpath("//div[@id='mobile-device']/div/div[2]/div/input"));
    public static final Target SELECT_DEVICE= Target.the("select the university Choucair").located(By.xpath("//div[@id='ui-select-choices-row-6-0']/span/div"));
    public static final Target INPUT_MODEL= Target.the("select the university Choucair").located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/div/span/span"));
    public static final Target LIST_MODEL= Target.the("select the university Choucair").located(By.xpath("//div[@id='mobile-device']/div[2]/div[2]/div/input"));
    public static final Target SELECT_MODEL= Target.the("select the university Choucair").located(By.xpath("//div[@id='ui-select-choices-row-7-0']/span/div/span"));
    public static final Target INPUT_OS= Target.the("select the university Choucair").located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/div/span"));
    public static final Target LIST_OS= Target.the("select the university Choucair").located(By.xpath("//div[@id='mobile-device']/div[3]/div[2]/div/input"));
    public static final Target SELECT_OS= Target.the("select the university Choucair").located(By.xpath("//div[@id='ui-select-choices-row-8-0']/span/div"));
    public static final Target BUTTON_NEXT= Target.the("select the university Choucair").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
