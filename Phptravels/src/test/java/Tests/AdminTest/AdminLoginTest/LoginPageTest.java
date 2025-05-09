package Tests.AdminTest.AdminLoginTest;

import PhptravelsPages.AdminPage.AdminLoginPage.AdminLoginPage;
import Tests.TestBase.MainPageTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends MainPageTestBase {
    AdminLoginPage login;

    @BeforeMethod
    public void init() {
        login = new AdminLoginPage(MainDriver);
    }

    @Test
    public void testValidLogin() {
        login.fillEmail("admin@phptravels.com");
        login.fillPassword("demoadmin");
        login.clickLoginButton();

    }

    @Test
    public void testInvalidEmail() {
        login.fillEmail("wrong@phptravels.com");
        login.fillPassword("demoadmin");
        login.clickLoginButton();

    }

    @Test
    public void testInvalidPassword() {
        login.fillEmail("admin@phptravels.com");
        login.fillPassword("wrongpass");
        login.clickLoginButton();

    }

    @Test
    public void testInvalidEmailandPassword() {
        login.fillEmail("Wrong@phptravels.com");
        login.fillPassword("wrongpass");
        login.clickLoginButton();

    }

    @Test
    public void testEmptyEmail() {
        login.fillEmail("");
        login.fillPassword("demoadmin");
        login.clickLoginButton();

        WebElement error = MainDriver.findElement(By.className("alert-danger"));
        Assert.assertTrue(error.isDisplayed(), "Error message not shown for empty email.");
    }

    @Test
    public void testEmptyPassword() {
        login.fillEmail("admin@phptravels.com");
        login.fillPassword("");
        login.clickLoginButton();

    }

    @Test
    public void testEmptyEmailAndPassword() {
        login.fillEmail("");
        login.fillPassword("");
        login.clickLoginButton();

    }
}
