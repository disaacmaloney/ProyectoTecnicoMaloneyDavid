package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.Task;

import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface.JoinAddressUTestPage;
import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface.JoinEndUTestPage;
import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface.JoinUTestPage;
import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface.JoinDevicesUTestPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.joda.time.Seconds;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Join implements Task {

    private String userName;
    private String userLastName;
    private String userEmail;
    private int userBirthDay;
    private int userBirthMonth;
    private int userBirthYear;
    private  String userLanguages;
    private String addCity;
    private String addCode;
    private String addCountry;
    private  String devMobile;
    private  String devModel;
    private  String devOS;
    private  String endPassword;

    public Join(String userName, String userLastName, String userEmail, int userBirthDay, int userBirthMonth, int userBirthYear, String userLanguages, String addCountry,String addCity, String addCode, String devMobile, String devModel, String devOS, String endPassword) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userBirthDay = userBirthDay;
        this.userBirthMonth = userBirthMonth;
        this.userBirthYear = userBirthYear;
        this.userLanguages = userLanguages;
        this.addCity = addCity;
        this.addCode = addCode;
        this.addCountry = addCountry;
        this.devMobile = devMobile;
        this.devModel = devModel;
        this.devOS = devOS;
        this.endPassword = endPassword;
    }

    public static Performable onThePage(String userName, String userLastName, String userEmail, int userBirthDay, int userBirthMonth, int userBirthYear, String userLanguages, String addCountry, String addCity, String addCode, String devMobile, String devModel, String devOS, String endPassword) {
        return Tasks.instrumented(Join.class,userName,userLastName,userEmail,userBirthDay,userBirthMonth,userBirthYear,userLanguages,addCountry,addCity,addCode, devMobile, devModel, devOS, endPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(JoinUTestPage.BUTTON_JOIN),
                Enter.theValue(userName).into(JoinUTestPage.INPUT_NAME),
                Enter.theValue(userLastName).into(JoinUTestPage.INPUT_LASTNAME),
                Enter.theValue(userEmail).into(JoinUTestPage.INPUT_EMAIL),
                SelectFromOptions.byIndex(userBirthMonth).from(JoinUTestPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(Integer.toString(userBirthDay)).from(JoinUTestPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(Integer.toString(userBirthYear)).from(JoinUTestPage.SELECT_YEAR),
                Enter.theValue(userLanguages).into(JoinUTestPage.SELECT_LANGUAGES),
                Click.on(JoinUTestPage.SELECT_LANGUAGES_01),
                Click.on(JoinUTestPage.BUTTON_NEXT),
                Enter.theValue(addCode).into(JoinAddressUTestPage.INPUT_CODE),
                Click.on(JoinAddressUTestPage.BUTTON_NEXT),
                Click.on(JoinDevicesUTestPage.INPUT_DEVICE),
                Enter.theValue(devMobile).into(JoinDevicesUTestPage.LIST_DEVICE),
                Click.on(JoinDevicesUTestPage.SELECT_DEVICE),
                Click.on(JoinDevicesUTestPage.INPUT_MODEL),
                Enter.theValue(devModel).into(JoinDevicesUTestPage.LIST_MODEL),
                Click.on(JoinDevicesUTestPage.SELECT_MODEL),
                Click.on(JoinDevicesUTestPage.INPUT_OS),
                Enter.theValue(devOS).into(JoinDevicesUTestPage.LIST_OS),
                Click.on(JoinDevicesUTestPage.SELECT_OS),
                Click.on(JoinDevicesUTestPage.BUTTON_NEXT),
                Enter.theValue(endPassword).into(JoinEndUTestPage.INPUT_PASSWORD),
                Enter.theValue(endPassword).into(JoinEndUTestPage.INPUT_CONFIRM),
                Click.on(JoinEndUTestPage.INPUT_POLICY),
                Click.on(JoinEndUTestPage.INPUT_TERMS),
                Click.on(JoinEndUTestPage.BUTTON_NEXT)
                );
    }
}
