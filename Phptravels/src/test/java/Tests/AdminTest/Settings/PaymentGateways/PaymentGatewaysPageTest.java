package Tests.AdminTest.Settings.PaymentGateways;
import PhptravelsPages.AdminPage.Settings.PaymentGateways.PaymentGateways;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PaymentGatewaysPageTest extends AdminTestBase {
    PaymentGateways paymentGateway;
    @BeforeMethod
    public void init(){
        paymentGateway = new PaymentGateways(AdminDriver);
    }
    @Test
    public void oo(){}
}
