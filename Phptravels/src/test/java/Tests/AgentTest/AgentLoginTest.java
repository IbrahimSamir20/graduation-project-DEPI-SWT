package Tests.AgentTest;

import PhptravelsPages.AgentPage.AgentLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AgentLoginTest {

    WebDriver driver;
    AgentLogin loginPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/login");
        loginPage = new AgentLogin(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.fillEmail("agent@phptravels.com");
        loginPage.fillPassword("demoagent");
        loginPage.ClickLoginButton();
    }

    @Test
    public void testEmptyFields() {
        loginPage.fillEmail("");
        loginPage.fillPassword("");
        loginPage.ClickLoginButton();
    }

    @Test
    public void testWrongPassword() {
        loginPage.fillEmail("agent@phptravels.com");
        loginPage.fillPassword("wrongpass");
        loginPage.ClickLoginButton();
    }

    @Test
    public void testWrongEmail() {
        loginPage.fillEmail("wrong@phptravels.com");
        loginPage.fillPassword("demoagent");
        loginPage.ClickLoginButton();
    }

    @Test
    public void testWrongEmailAndPassword() {
        loginPage.fillEmail("wrong@phptravels.com");
        loginPage.fillPassword("wrongpass");
        loginPage.ClickLoginButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

