package Tests.AdminTest.Settings.PaymentGateways;
import PhptravelsPages.AdminPage.Settings.PaymentGateways.PaymentMethodSettingsPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentMethodSettingsPageTest extends AdminTestBase {
    PaymentMethodSettingsPage setting;
    @BeforeMethod
    public void init(){
       setting = new PaymentMethodSettingsPage(AdminDriver);
    }
    @Test
    public void oo(){}
}
