package Tests.AdminTest.Settings.PaymentGateways;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.PaymentGateways.PaymentGateways;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PaymentGatewaysPageTest extends AdminTestBase {
    AdminSettingsHelper settings;
    PaymentGateways paymentGateway;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        paymentGateway = new PaymentGateways(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfBackButton() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateway.Back();
    }
    @Test
    public void VerifyFunctionalityOfStatusButton() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateway.statusButton();
    }
    @Test
    public void VerifyFunctionalityOfSettingButton() throws InterruptedException {
        settings.GoToPaymentGateways();
        Thread.sleep(2000);
        paymentGateway.goToSettings();
    }
}
