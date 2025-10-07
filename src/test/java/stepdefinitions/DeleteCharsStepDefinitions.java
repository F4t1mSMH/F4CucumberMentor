package stepdefinitions;

import io.cucumber.java.en.When;
import pages.DeleteCharsPage;

public class DeleteCharsStepDefinitions {

    DeleteCharsPage deleteCharsPage;

    @When("user enters {string} into input")
    public void user_enters_into_input(String input) {
        deleteCharsPage = new DeleteCharsPage();
        deleteCharsPage.enterInput(input);
    }

}
