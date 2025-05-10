package Tests.MasterPageTest;
import Helper.AssertionHelper;
import Tests.TestBase.MainPageTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.MasterPage.VisaPage;
public class VisaTest extends MainPageTestBase {
    AssertionHelper assertion;
    VisaPage Visa;
    @BeforeMethod
    public void init(){
        assertion = new AssertionHelper();
        Visa = new VisaPage(MainDriver);
    }
    @Test
    public void testValidVisaSearch() throws InterruptedException {
        Visa.clickVisaButton ();
        Visa.selectFromCountry("Egypt");
        Visa.selectToCountry("Saudi Arabia");
        Visa.clickSearchButton();
        Thread.sleep(7000);
        assertion.assertConfirmationPopupText(MainDriver, "Visa search completed");
    }
    @Test
public void testSearchWithoutSelection () throws InterruptedException {
        Visa.clickVisaButton();
        Visa.clickSearchButton();
        assertion.assertConfirmationPopupText(MainDriver, "Select From Country");
    }
    @Test
    public void testSearchWithoutToCountrySelection() throws InterruptedException {
        Visa.clickVisaButton();
            Visa.selectFromCountry("Egypt");
            Thread.sleep(2000);
            assertion.assertConfirmationPopupText(MainDriver, "Select To Country");
        }
            @Test
            public void testSearchWithoutFromCountrySelection() throws InterruptedException {
                Visa.clickVisaButton();
                    Visa.selectToCountry("Syria");
                assertion.assertConfirmationPopupText(MainDriver, "Select From Country");
            }
        }








