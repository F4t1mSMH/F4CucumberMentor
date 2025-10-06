package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeeTablePage {

    public EmployeeTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "employeeHeader")
    private WebElement tableHeading;

    public EmployeeTablePage assertTableHeading() {
        Assert.assertEquals("Employee Table", tableHeading.getText());
        return this;
    }

}
