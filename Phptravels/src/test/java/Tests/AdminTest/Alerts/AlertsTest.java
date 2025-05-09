package Tests.AdminTest.Alerts;
import Helper.AdminLoginHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Alerts.AlertsBase;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AlertsTest extends AdminTestBase {
    AssertionHelper Assert;
    AlertsBase alert;
    AdminLoginHelper login;
    @BeforeMethod
    public void init() throws InterruptedException {
        Assert = new AssertionHelper();
        login = new AdminLoginHelper();
        alert = new AlertsBase(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfAlertButton () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(2000);
        alert.displayAlerts();
        Assert.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class=\"px-2\"])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfDeleteAlertButton () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(2000);
        alert.displayAlerts();
        alert.deleteAlert();
        Thread.sleep(2000);
        Assert.assertElementIsNotVisible(AdminDriver,By.xpath("//*[@class='px-2' and text()='Hotel booking invoice 20250419061627']"));
    }
}