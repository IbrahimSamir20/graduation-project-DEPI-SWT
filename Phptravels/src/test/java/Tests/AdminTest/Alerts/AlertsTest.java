package Tests.AdminTest.Alerts;
import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Alerts.AlertsBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AlertsTest extends AdminTestBase {
    AlertsBase alert;
    AdminLoginHelper login;
    @BeforeMethod
    public void init() throws InterruptedException {
        login = new AdminLoginHelper();
        Thread.sleep(2000);
        alert = new AlertsBase(AdminDriver);
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfAlertButton () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(2000);
        alert.displayAlerts();
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfDeleteAlertButton () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(5000);
        alert.displayAlerts();
        Thread.sleep(2000);
        alert.deleteAlert();
        Thread.sleep(2000);
    }
}