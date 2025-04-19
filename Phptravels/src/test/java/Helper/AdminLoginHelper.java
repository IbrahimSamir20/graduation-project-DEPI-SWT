package Helper;
import PhptravelsPages.AdminPage.AdminLoginPage.AdminLoginPage;
import Tests.TestBase.AdminTestBase;
public class AdminLoginHelper extends AdminTestBase {
    AdminLoginPage login = new AdminLoginPage(AdminDriver);
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
