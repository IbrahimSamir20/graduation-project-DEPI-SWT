package Tests.CustomerTest;

import PhptravelsPages.CustomerPage.CustomerSignUp;
import Tests.TestBase.MainPageTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerSignUpTest extends MainPageTestBase {
    CustomerSignUp SignUp;

    @BeforeMethod
    public void init() {
        SignUp = new CustomerSignUp(driver);
    }

    @Test
    public void testValidCustomerSignup() {
        SignUp.fillfirstname("rodaina");
        SignUp.fillLastName("Ali");
        String uniqueEmail = "lina" + System.currentTimeMillis() + "@mail.com";
        SignUp.fillEmail(uniqueEmail);
        SignUp.fillPassword("Test@1234");
        SignUp.clickSignUpButton();

    }

    public void testWithInvalidEmailSignup() {
        SignUp.fillfirstname("rodaina");
        SignUp.fillLastName("Ali");
        String uniqueEmail = "lina" + System.currentTimeMillis() + "@mail.com";
        SignUp.fillEmail(uniqueEmail);
        SignUp.fillPassword("Test@1234");
        SignUp.clickSignUpButton();
    }
}