package Tests.AdminTest.Settings.Currencies;
import Helper.AdminSettingsHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Settings.Currencies.CurrenciesPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.Currencies.AddOrEditPages;
import Tests.TestBase.AdminTestBase;
public class AddOrEditPagesTest extends AdminTestBase {
    AssertionHelper assertion;
    AdminSettingsHelper settings;
    CurrenciesPage currencies;
    AddOrEditPages test;
    @BeforeMethod
    public void init(){
        assertion = new AssertionHelper();
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
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"xcrud-message error\"]"));
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendName() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.name("EGY");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"xcrud-message error\"]"));
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendCountryOption() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.fillCountryTextField("Egypt");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"xcrud-message error\"]"));
    }
    @Test
    public void VerifyFunctionalityOfAddNewCurrenciesBySendRate() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.rate("4.5");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"xcrud-message error\"]"));
    }
    @Test
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
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class=\"flag egypt\"])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfReturnButton() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        test.returnButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"flag united states\"]"));
    }
    @Test
    public void VerifyFunctionalityOfEditStatusButtonFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("Enabled");
        test.saveButton();
        Thread.sleep(5000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfEditNameButtonFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.name("USD");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//tr[contains(@class, 'xcrud-row') and .//td[text()='USD']])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfEditCountryFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.fillCountryTextField("United States");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//tr[contains(@class, 'xcrud-row') and .//*[@class=\"flag united states\"]])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfEditRateFromEditPage () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.rate("0.88");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//tr[contains(@class, 'xcrud-row') and .//td[text()='0.88']])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfEditCurrencies() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("Enabled");
        test.name("EGY");
        test.fillCountryTextField("Egypt");
        test.rate("4.5");
        test.saveButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//tr[contains(@class, 'xcrud-row') and .//*[@class=\"flag egypt\"]])[1]"));
    }
}