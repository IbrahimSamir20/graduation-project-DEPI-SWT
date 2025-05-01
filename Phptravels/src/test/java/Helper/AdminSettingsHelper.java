package Helper;
import PhptravelsPages.AdminPage.Settings.SettingButtons.SettingsBasePage;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.TestBase.MainPageTestBase.driver;

public class AdminSettingsHelper extends AdminTestBase {
    AdminLoginHelper login = new AdminLoginHelper();
    SettingsBasePage button = new SettingsBasePage(AdminDriver);
    public void GoToGeneralSettings () throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnGeneralSettingsButton();
    }
    public void GoToUserRoles () throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnUserRolesButton();
    }
    public void GoToPaymentGateways() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnPaymentGatewaysButton();
    }
    public void GoToCurrencies () throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnCurrenciesButton();
    }
    public void GoToLocations() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnLocationButton();
    }
    public void GoToLanguages () throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnLanguagesButton();
    }
    public void GoToCountries () throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        button.SettingsButton();
        button.clickOnCountriesButton();
    }
    public void assertingOfTextField (By locator ,String ExpectedText){
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
