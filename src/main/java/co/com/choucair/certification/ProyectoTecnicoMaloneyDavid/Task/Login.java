package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.Task;


import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface.*;
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

public class Login implements Task {
    private String userEmail;
    private  String endPassword;

    public Login(String userEmail, String endPassword) {
        this.userEmail = userEmail;
        this.endPassword = endPassword;
    }

    public static Performable onLogin(String userEmail, String endPassword) {
        return Tasks.instrumented(Join.class,userEmail, endPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

        );
    }
}
