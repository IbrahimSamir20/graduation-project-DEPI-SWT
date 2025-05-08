package Tests.AdminTest.Settings.Currencies;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.Currencies.CurrenciesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.Currencies.AddOrEditPages;
import Tests.TestBase.AdminTestBase;
public class AddOrEditPagesTest extends AdminTestBase {
    AdminSettingsHelper settings;
    CurrenciesPage currencies;
    AddOrEditPages test;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        currencies = new CurrenciesPage(AdminDriver);
        test = new AddOrEditPages(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendStatusOption() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.fillStatusDropList("Enabled");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendName() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.name("EGY");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendCountryOption() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.fillCountryTextField("Egypt");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendRate() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.rate("4.5");
        test.saveButton();
    }
    @Test//Asserting this
    public void VerifyFunctionalityOfAddNewCurrenciesByFillRequirements() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.fillStatusDropList("Enabled");
        test.name("EGY");
        test.fillCountryTextField("Egypt");
        test.rate("4.5");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfReturnButton() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.returnButton();
    }
    @Test
    public void VerifyFunctionalityOfEditStatusButtonFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("Enabled");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfEditNameButtonFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.name("USA");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfEditCountryFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.fillCountryTextField("United States");
        test.saveButton();
    }
    @Test
    public void VerifyFunctionalityOfEditRateFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.rate("0.88");
        test.saveButton();
    }
    @Test//Asserting this
    public void VerifyFunctionalityOfEditCurrenciesByFillRequirements() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("Enabled");
        test.name("EGY");
        test.fillCountryTextField("Egypt");
        test.rate("4.5");
        test.saveButton();
    }
}