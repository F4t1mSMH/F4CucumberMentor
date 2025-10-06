package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ArithmeticSteps {
    private int number1;
    private int number2;
    private int result;

    @Given("the first number is {int}")
    public void the_first_number_is(int num1) {
        this.number1 = num1;
        System.out.println("First number set to: " + this.number1);
    }

    @Given("the second number is {int}")
    public void the_second_number_is(int num2) {
        this.number2 = num2;
        System.out.println("Second number set to: " + this.number2);
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        this.result = number1 + number2;
        System.out.println("Numbers added. Result: " + this.result);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, this.result);
        System.out.println("Test Passed! Result: " + this.result);
    }
}