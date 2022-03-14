package co.com.choucair.certification.UtestAuto.stepdefinitions;

import co.com.choucair.certification.UtestAuto.tasks.Fills;
import co.com.choucair.certification.UtestAuto.tasks.Finish;
import co.com.choucair.certification.UtestAuto.tasks.Login;
import co.com.choucair.certification.UtestAuto.tasks.OpenUp;
import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.Onstage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.choucair.certification.UtestAuto.tasks.OpenUp.*;
import static co.com.choucair.certification.UtestAuto.tasks.Login.*;
import static co.com.choucair.certification.UtestAuto.tasks.Finish.*;
import static co.com.choucair.certification.UtestAuto.tasks.Fills.*;

public class UtestAutoStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Fernan wants to join in the utest platform$")
    public void thanFernanwantstojoinintheutestplatform() {
        OnStage.theActorCalled("Fernan").wasAbleTo(OpenUp.thePage()), (Login.onThePage());

    }

    @When("^he fills out last steps of the form$")
    public void Whenhefillsoutlaststepsoftheform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Fills.theForm());

    }

    @Then("^he complete set up the registration form$")
    public void hecompletesetuptheregistrationform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Finish.theRegistration());

    }

}

