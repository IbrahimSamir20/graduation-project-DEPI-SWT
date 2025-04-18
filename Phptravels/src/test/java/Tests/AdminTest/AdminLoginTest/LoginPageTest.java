package Tests.AdminTest.AdminLoginTest;
import PhptravelsPages.AdminPage.AdminLoginPage.AdminLoginPage;
import Tests.TestBase.MainPageTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginPageTest extends MainPageTestBase {
    AdminLoginPage login;
    @BeforeMethod
    public void init(){
        login = new AdminLoginPage(driver);
    }
    @Test
    public void ooo(){}
}
