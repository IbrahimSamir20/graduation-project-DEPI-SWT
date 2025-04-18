package Tests.AdminTest.Alerts;
import PhptravelsPages.AdminPage.Alerts.AlertsBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AlertsTest extends AdminTestBase {
    AlertsBase alert;
    @BeforeMethod
    public void init(){
        alert = new AlertsBase(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfAlertButton () throws InterruptedException{
        alert.displayAlerts();
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfDeleteAlertButton () throws InterruptedException{
        alert.displayAlerts();
        Thread.sleep(2000);
        alert.DeleteAlert();
        Thread.sleep(2000);
    }

}
