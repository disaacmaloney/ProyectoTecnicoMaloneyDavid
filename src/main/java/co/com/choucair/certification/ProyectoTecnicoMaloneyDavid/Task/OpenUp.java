package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.Task;

import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Task;

public class OpenUp implements Task{
    private UTestPage _uTestPage;

    public static Performable thePage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(_uTestPage));
    }
}
