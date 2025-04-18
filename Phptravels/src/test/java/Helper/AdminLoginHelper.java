package Helper;
import PhptravelsPages.AdminPage.AdminLoginPage.AdminLoginPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AdminLoginHelper extends AdminTestBase {
    AdminLoginPage login;
    @BeforeMethod
    public void init(){
        login = new AdminLoginPage(AdminDriver);
    }
    @Test
    public void adminLogin() throws InterruptedException {
        Thread.sleep(2000);
        login.fillEmail("admin@phptravels.com");
        Thread.sleep(2000);
        login.fillPassword("demoadmin");
        Thread.sleep(2000);
        login.clickLoginButton();
        Thread.sleep(2000);
    }
}
