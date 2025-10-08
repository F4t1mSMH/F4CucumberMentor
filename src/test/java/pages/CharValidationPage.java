package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class CharValidationPage {

    public CharValidationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "characters")
    private WebElement input;

    @FindBy(name = "validation_message")
    private WebElement validation_message;

    @FindBy(name = "validate")
    private WebElement validateButton;


    public void enterInput(String input) {
        this.input.sendKeys(input);
    }

    public void clickValidate() {
        validateButton.click();
    }

    public void assertValidOutput() {
        assertEquals("Valid Value", validation_message.getAttribute("value"));
        input.clear();
    }

    public void assertInvalidOutput() {
        assertEquals("Invalid Value", validation_message.getAttribute("value"));
        input.clear();
    }


}
