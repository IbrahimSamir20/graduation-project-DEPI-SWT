package Tests.CustomerTest;

import PhptravelsPages.CustomerPage.CustomerLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class CustomerLoginTest {

    WebDriver driver;
    CustomerLogin customerLogin;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/login");
        customerLogin = new CustomerLogin(driver);
    }

    @Test
    public void testValidLogin() {
        customerLogin.fillEmail("user@phptravels.com");
        customerLogin.fillPassword("demouser");
        customerLogin.clickLoginButton();
    }

    @Test
    public void testEmptyLoginFields() {
        customerLogin.fillEmail("");
        customerLogin.fillPassword("");
        customerLogin.clickLoginButton();
    }

    @Test
    public void testWrongPassword() {
        customerLogin.fillEmail("user@phptravels.com");
        customerLogin.fillPassword("wrongpass");
        customerLogin.clickLoginButton();
        // Assert: تحقق من فشل تسجيل الدخول
    }

    @Test
    public void testWrongEmail() {
        customerLogin.fillEmail("wrong@phptravels.com");
        customerLogin.fillPassword("demouser");
        customerLogin.clickLoginButton();
        // Assert: تحقق من فشل تسجيل الدخول
    }

    @Test
    public void testWrongEmailAndPassword() {
        customerLogin.fillEmail("wrong@phptravels.com");
        customerLogin.fillPassword("wrongpass");
        customerLogin.clickLoginButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

