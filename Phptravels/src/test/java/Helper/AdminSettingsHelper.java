package Helper;
import PhptravelsPages.AdminPage.Settings.SettingButtons.SettingsBasePage;
import Tests.TestBase.AdminTestBase;
public class AdminSettingsHelper extends AdminTestBase {
    AdminLoginHelper login = new AdminLoginHelper();
    SettingsBasePage button = new SettingsBasePage(AdminDriver);
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
}
