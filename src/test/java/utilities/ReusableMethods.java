package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ReusableMethods {

    public static String getValidationMessage(WebElement element) {
        // Use JavaScriptExecutor to get the validation message
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        return (String) js.executeScript("return arguments[0].validationMessage;", element);
    }

}
