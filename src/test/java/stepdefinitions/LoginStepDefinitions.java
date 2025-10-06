package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeTablePage;
import pages.SignInPage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class LoginStepDefinitions {

    SignInPage signInPage;
    EmployeeTablePage tablePage;

    @Given("user is on the signin page")
    public void user_is_on_the_signin_page() {
        Driver.getDriver().get("https://claruswaysda.github.io/signIn.html");
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        signInPage = new SignInPage();
        signInPage.enterUsername("admin");
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
        signInPage = new SignInPage();
        signInPage.enterPassword("123");
    }

    @When("user click on submit button")
    public void user_click_on_submit_button() {
        signInPage = new SignInPage();
        signInPage.clickSignIn();
    }

    @Then("user validates the signin")
    public void user_validates_the_signin() {
        tablePage = new EmployeeTablePage();
        tablePage.assertTableHeading();
    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        signInPage = new SignInPage();
        signInPage.enterUsername("adminX");

    }

    @Then("assert alert message")
    public void assert_alert_message() {
        assertEquals("Incorrect username or password", Driver.getDriver().switchTo().alert().getText());
    }

}
