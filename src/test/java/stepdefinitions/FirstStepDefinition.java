package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FirstStepDefinition {

    @Given("print Hello World on console")
    public void print_hello_world_on_console() {
        System.out.println("Hello World");
    }

    @When("print from one to hundred on console")
    public void print_from_one_to_hundred_on_console() {
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Then("assert if Cucumber contains C")
    public void assert_if_cucumber_contains_c() {
        Assert.assertTrue("Test Failed", "Cucumber".contains("C"));
        System.out.println("Cucumber contains C");
    }
}