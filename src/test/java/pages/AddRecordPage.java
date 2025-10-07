package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddRecordPage {
    // Locators for input fields
    private By nameInput = By.id("nameInput");
    private By ageInput = By.id("ageInput");
    private By countrySelect = By.id("countrySelect");
    private By addRecordButton = By.xpath("//button[@onclick='addRecord()']");
    private By tableBody = By.id("tableBody");
    private By editButton = By.xpath("//button[@class='edit-btn']");
    private By deleteButton = By.xpath("//button[@class='delete-btn']");
    private String rowByTextXPath = "//tr[contains(.,'%s')]";



    public AddRecordPage enterName(String name) {
        Driver.getDriver().findElement(nameInput).sendKeys(name);
        return this;
    }

    public AddRecordPage enterAge(String age) {
        Driver.getDriver().findElement(ageInput).sendKeys(age);
        return this;
    }

    public AddRecordPage selectCountry(String visibleText) {
        new Select(Driver.getDriver().findElement(countrySelect)).selectByVisibleText(visibleText);
        return this;
    }

    public AddRecordPage clickOnAddRecord() {
        Driver.getDriver().findElement(addRecordButton).click();
        return this;
    }

    public AddRecordPage editRecordByName(String recordName, String newAge) {
        Driver.getDriver().findElement(By.xpath(String.format(rowByTextXPath, recordName)))
                .findElement(editButton).click();

        Driver.getDriver().findElement(ageInput).clear();
        Driver.getDriver().findElement(ageInput).sendKeys(newAge);
        clickOnAddRecord();
        return this;
    }

    public AddRecordPage deleteRecordByName(String recordName) {
        Driver.getDriver().findElement(By.xpath(String.format(rowByTextXPath, recordName)))
                .findElement(deleteButton).click();
        return this;
    }

    public AddRecordPage assertTableContainsText(String text) {
        assertTrue(Driver.getDriver().findElement(tableBody).getText().contains(text));
        return this;
    }

    public AddRecordPage assertTableNotContainsText(String text) {
        assertFalse(Driver.getDriver().findElement(tableBody).getText().contains(text));
        return this;
    }
}