package co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.stepdefinitions;

import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.Task.Login;
import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.model.uTestData;
import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.Task.Join;
import co.com.choucair.certification.ProyectoTecnicoMaloneyDavid.Task.OpenUp;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^new user on the UTEST platform$")
    public void newUserOnTheUTESTPlatform(List<uTestData> LstUTData) throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),
                (Join.onThePage(LstUTData.get(0).getUserName(),LstUTData.get(0).getUserLastName(), LstUTData.get(0).getUserEmail(), LstUTData.get(0).getUserBirthDay(), LstUTData.get(0).getUserBirthMonth(), LstUTData.get(0).getUserBirthYear(), LstUTData.get(0).getUserLanguages(),
                        LstUTData.get(0).getAddCountry(), LstUTData.get(0).getAddCity(), LstUTData.get(0).getAddCode(),
                        LstUTData.get(0).getDevMobile(), LstUTData.get(0).getDevModel(), LstUTData.get(0).getDevOS(), LstUTData.get(0).getEndPassword())));
    }

    @When("^automate new user registration$")
    public void automateNewUserRegistration() throws Exception{
    }

    @Then("^be able to enter the UTest system$")
    public void beAbleToEnterTheUTestSystem() throws Exception{
    }
}
