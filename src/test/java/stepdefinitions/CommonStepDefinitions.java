package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.Driver;

public class CommonStepDefinitions {

    @Then("close browser")
    public void close_browser() {
        Driver.closeDriver();
    }

}
