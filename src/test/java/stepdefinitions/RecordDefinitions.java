package stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.AddRecordPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.getDriver;

public class RecordDefinitions {

    AddRecordPage addRecordPage = new AddRecordPage();

    @Given("the user opens the browser")
    public void theUserOpensTheBrowser() {
        Driver.getDriver();
    }

    @And("the user navigates to the {string} page")
    public void theUserNavigatesToThePage(String pageName) {
        getDriver().get(ConfigReader.getProperty("re_url"));
    }


    @When("the user enters new user record and adds the user")
    public void theUserEntersNewUserRecordAndAddsTheUser() {
        addRecordPage.enterName("Alice Smith")
                .enterAge("35")
                .selectCountry("Canada")
                .clickOnAddRecord();
    }
    @Then("the record for the default new user should be displayed in the table")
    public void theRecordForTheDefaultNewUserShouldBeDisplayedInTheTable() {
        addRecordPage.assertTableContainsText("Alice Smith");
        System.out.println("Alice Smith record is displayed");
    }


    @Given("a record for {string} exists in the table")
    public void aRecordForExistsInTheTableGiven(String recordName) {
        addRecordPage.assertTableContainsText("Sarah Wilson");
    }

    @When("the user edits the record for {string} and changes Age to {string}")
    public void aRecordForExistsInTheTable(String recordName, String newAge) {
        addRecordPage.editRecordByName("Sarah Wilson", newAge);
        addRecordPage.enterAge("25")
                .clickOnAddRecord();
    }

    @Then("the record for {string} should show the updated Age {string}")
    public void theRecordShouldShowTheUpdatedAge(String recordName, String expectedAge) {
        addRecordPage.assertTableContainsText("25");
    }

    @When("the user deletes the record for {string}")
    public void theUserDeletesTheRecord(String recordName) {
        addRecordPage.deleteRecordByName("Alex Johnson");
    }

    @Then("the record for {string} should not be displayed in the table")
    public void theRecordShouldNotBeDisplayedInTheTable(String recordName) {
        addRecordPage.assertTableNotContainsText("Alex Johnson");
    }

    @When("the user checks for the existence of record {string}")
    public void theUserChecksForTheExistenceOfRecord(String recordName) {
    }

    @Then("the record for {string} should be found in the table")
    public void theRecordShouldBeFoundInTheTable(String recordName) {
        addRecordPage.assertTableContainsText("Alex Johnson");
    }
}