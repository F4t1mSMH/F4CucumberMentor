package stepdefinitions;

import io.cucumber.java.en.When;
import pages.FormPage;

public class FormStepDefinitions {

    FormPage formPage;

    @When("user enters first name {string}")
    public void user_enters_first_name(String firstname) {
        formPage = new FormPage();
        formPage.enterFirstname(firstname);
    }

    @When("user enters last name {string}")
    public void user_enters_last_name(String lastname) {
        formPage = new FormPage();
        formPage.enterLastname(lastname);
    }

    @When("user enters age {string}")
    public void user_enters_age(String age) {
        formPage = new FormPage();
        formPage.enterAge(age);
    }

    @When("user enters country {string}")
    public void user_enters_country(String country) {
        formPage = new FormPage();
        formPage.selectCountry(country);
    }

    @When("user enters notes {string}")
    public void user_enters_notes(String note) {
        formPage = new FormPage();
        formPage.enterNotes(note);
    }

}
