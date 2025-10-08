package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utilities.Driver;
import org.junit.Assert;

public class RegisterWithMutiDataDef {
    RegisterPage registerPage = new RegisterPage();

    @Given("I navigate to the registration form at {string}")
    public void iNavigateToTheRegistrationFormAt(String url) {
        Driver.getDriver().get(url);
    }

    @When("I fill in the Social security number {string} first name {string} and last name {string}")
    public void i_Fill_In_The_Social_Security_Number_FirstName_And_LastName(String ssn, String firstName, String lastName) {
        registerPage.enterSsn(ssn);
        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
    }

    @And("i fill in the address {string} and phone number {string}")
    public void i_Fill_In_The_Address_And_PhoneNumber(String address, String phoneNumber) {
        registerPage.enterAddress(address);
        registerPage.enterPhone(phoneNumber);
    }

    @And("I fill in the username {string} and the email {string}")
    public void iFillInTheUsernameAndTheEmail(String username, String email) {
        registerPage.enterUsername(username);
        registerPage.enterEmail(email);
    }


    @And("I fill in the password {string} and confirm password {string}")
    public void iFillInThePasswordAndConfirmPassword(String password, String confirmPassword) {
        registerPage.enterPassword(password);
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @And("I click the Register button")
    public void iClickTheRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("I should see a successful registration message")
    public void iShouldSeeASuccessfulRegistrationMessage() {
        String expectedMessage = "User registered successfully!";
        boolean isSuccess = registerPage.isSuccessMessageVisible(expectedMessage);
        Assert.assertTrue("User registered successfully!" + expectedMessage, isSuccess);
    }
}