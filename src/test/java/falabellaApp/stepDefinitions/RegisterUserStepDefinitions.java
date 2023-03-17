package falabellaApp.stepDefinitions;

import Task.LogsOutLogsBackIntoUserFalabella;
import Task.RegisterToUserFalabella;
import appiumDriver.AppiumAndroidDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class RegisterUserStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^That Brandon access successfully$")
    public void thatBrandonAccessSuccessfully() {
        OnStage.theActorCalled("Brandon").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));
    }

    @When("^Brandon Registers in the app falabella$")
    public void brandonRegistersInTheAppFalabella() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterToUserFalabella.onApp());
    }

    @Then("^Brandon logs out and logs back into the falaballa app$")
    public void brandonLogsOutAndLogsBackIntoTheFalaballaApp() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogsOutLogsBackIntoUserFalabella.onApp());
    }
}
