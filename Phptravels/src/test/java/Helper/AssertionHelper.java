package Helper;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
public class AssertionHelper extends AdminTestBase {
    public void assertingOfTextField (By locator , String ExpectedText){
        String ActualText = AdminDriver.findElement(locator).getAttribute("value");
        Assert.assertEquals(ActualText,ExpectedText,"Expected and actual values do not match.");
    }
    public void assertDropListSelection(By displayedValueLocator, String expectedValue) {
        String actualValue = AdminDriver.findElement(displayedValueLocator).getText();
        Assert.assertEquals(actualValue.trim(), expectedValue.trim(), "Drop list selected value mismatch.");
    }
    public void assertElementIsVisible(By locator) {
        boolean isPresent = AdminDriver.findElements(locator).size() > 0;
        Assert.assertTrue(isPresent, "Expected element not found: " + locator.toString());
    }
}
