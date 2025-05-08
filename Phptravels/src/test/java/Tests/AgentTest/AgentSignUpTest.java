package Tests.AgentTest;

import PhptravelsPages.AgentPage.AgentSignUp;
import Tests.TestBase.MainPageTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentSignUpTest extends MainPageTestBase {
    AgentSignUp SignUp;

    @BeforeMethod
    public void init() {
        SignUp = new AgentSignUp(driver);
    }

    @Test
    public void testValidAgentSignup() {

        SignUp.fillfirstname("rewan");
        SignUp.fillLastName("Abdelazem");
        SignUp.fillCity("Cairo");
        SignUp.fillAddress("Nasr City");
        SignUp.fillAgencyName("Elite Travels");
        SignUp.fillLicense("AG123456");
        String uniqueEmail = "mona" + System.currentTimeMillis() + "@mail.com";
        SignUp.fillEmail(uniqueEmail);
        SignUp.fillPassword("Test@1234");
        SignUp.uploadLogo("C:\\Users\\YourUser\\Pictures\\logo.png");
        SignUp.clickSignUpButton();

    }

    @Test
    public void testSignupWithInvalidEmail() {
        SignUp.fillfirstname("Laila");
        SignUp.fillLastName("Ibrahim");
        SignUp.fillCity("Giza");
        SignUp.fillAddress("Dokki");
        SignUp.fillAgencyName("Top Tours");
        SignUp.fillLicense("AG654321");
        SignUp.fillEmail("invalid-email");
        SignUp.fillPassword("Test@1234");
        SignUp.uploadLogo("C:\\Users\\YourUser\\Pictures\\logo.png");
        SignUp.clickSignUpButton();

    }

    public void testSignupWithInvaliduploadLogo() {
        SignUp.fillfirstname("Hana");
        SignUp.fillLastName("Omar");
        SignUp.fillCity("Alexandria");
        SignUp.fillAddress("Miami");
        SignUp.fillAgencyName("Seaside Travel");
        SignUp.fillLicense("LIC789");
        String uniqueEmail = "hana" + System.currentTimeMillis() + "@mail.com";
        SignUp.fillEmail(uniqueEmail);
        SignUp.fillPassword("Test@1234");
        SignUp.uploadLogo("C:\\Users\\YourUser\\Documents\\file.pdf");
        SignUp.clickSignUpButton();
    }
}
