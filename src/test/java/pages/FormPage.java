package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class FormPage {

    public FormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "surname")
    private WebElement surname;

    @FindBy(id = "age")
    private WebElement age;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "notes")
    private WebElement notes;

    public void enterFirstname(String firstname) {
        this.firstname.sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        surname.sendKeys(lastname);
    }

    public void enterAge(String age) {
        this.age.sendKeys(age);
    }

    public void enterNotes(String notes) {
        this.notes.sendKeys(notes);
    }

    public void selectCountry(String country){
        new Select(this.country).selectByVisibleText(country);
    }


}
