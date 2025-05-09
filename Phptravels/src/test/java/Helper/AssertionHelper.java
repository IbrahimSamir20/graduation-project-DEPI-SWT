package Helper;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.*;
import org.testng.Assert;
public class AssertionHelper extends AdminTestBase {
    public void assertingOfTextField (WebDriver driver,By locator , String ExpectedText){
        String ActualText = driver.findElement(locator).getAttribute("value");
        Assert.assertEquals(ActualText,ExpectedText,"Expected and actual values do not match.");
    }
    public void assertDropListSelection(WebDriver driver,By displayedValueLocator, String expectedValue) {
        String actualValue = driver.findElement(displayedValueLocator).getText();
        Assert.assertEquals(actualValue.trim(), expectedValue.trim(), "Drop list selected value mismatch.");
    }
    public void assertElementIsVisible(WebDriver driver,By locator) {
        boolean isPresent = driver.findElements(locator).size() > 0;
        Assert.assertTrue(isPresent, "Expected element not found: " + locator.toString());
    }
    public void assertElementIsNotVisible(WebDriver driver,By locator) {
        boolean isPresent = driver.findElements(locator).size() > 0;
        Assert.assertFalse(isPresent, "Element was found but should not be: " + locator.toString());
    }
    public void assertCheckboxIsChecked(WebDriver driver,By locator) {
        WebElement checkbox = driver.findElement(locator);
        Assert.assertTrue(checkbox.isSelected(), "Checkbox should be checked (ON): " + locator.toString());
    }
    public void assertCheckboxIsNotChecked(WebDriver driver,By locator) {
        WebElement checkbox = driver.findElement(locator);
        Assert.assertFalse(checkbox.isSelected(), "Checkbox should NOT be checked (OFF): " + locator.toString());
    }
    public void assertConfirmationPopupText(WebDriver driver,String expectedText) {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            Assert.assertEquals(alertText, expectedText, "Alert text does not match.");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert was present.");
        }
    }
}
