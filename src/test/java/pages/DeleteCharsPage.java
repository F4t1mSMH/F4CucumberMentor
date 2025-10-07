package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeleteCharsPage {

    public DeleteCharsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputText")
    private WebElement input;

    public void enterInput(String input){
        this.input.sendKeys(input);
    }

}
