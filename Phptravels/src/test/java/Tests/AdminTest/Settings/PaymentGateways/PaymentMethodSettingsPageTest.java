package Tests.AdminTest.Settings.PaymentGateways;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.PaymentGateways.PaymentGateways;
import PhptravelsPages.AdminPage.Settings.PaymentGateways.PaymentMethodSettingsPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentMethodSettingsPageTest extends AdminTestBase {
    AdminSettingsHelper settings;
    PaymentGateways paymentGateways;
    PaymentMethodSettingsPage paymentSetting;
    @BeforeMethod
    public void init(){
       settings = new AdminSettingsHelper();
       paymentGateways = new PaymentGateways(AdminDriver);
       paymentSetting = new PaymentMethodSettingsPage(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfSetCredentials() throws InterruptedException {
       settings.GoToPaymentGateways();
       Thread.sleep(2000);
       paymentGateways.goToSettings();
       paymentSetting.credentials1("Account holder Omar Talaat");
    }
    @Test
    public void VerifyFunctionalityOfSelectDevelopmentMode() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateways.goToSettings();
        paymentSetting.devModeDropList("Production");
    }
    @Test
    public void VerifyFunctionalityOfSelectCurrency() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateways.goToSettings();
        paymentSetting.currencyDropList("USD");
    }
    @Test
    public void VerifyFunctionalityOfSubmitButtonWithoutEnterAnyData() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateways.goToSettings();
        paymentSetting.submitButton();
    }
    @Test
    public void VerifyFunctionalityOfSubmitButtonByEdit() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateways.goToSettings();
        paymentSetting.credentials1("Account holder Omar Talaat");
        paymentSetting.credentials4("AlexAndria");
        paymentSetting.devModeDropList("Production");
        paymentSetting.currencyDropList("USD");
        paymentSetting.submitButton();
    }

}
