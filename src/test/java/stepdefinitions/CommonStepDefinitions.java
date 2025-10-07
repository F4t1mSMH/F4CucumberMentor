package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.devtools.v138.input.model.DragData;
import utilities.Driver;

public class CommonStepDefinitions {

    @Then("close browser")
    public void close_browser() {
        Driver.closeDriver();
    }

    @Given("user visits {string}")
    public void userVisits(String url) {
        Driver.getDriver().get(url);
    }
}
