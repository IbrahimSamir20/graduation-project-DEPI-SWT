package Tests.AdminTest.Markups;

import Helper.AdminLoginHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Markups.MarkupsBase;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MarkupsTest extends AdminTestBase {
    MarkupsBase markupsBase;
    AdminLoginHelper login;
    AssertionHelper assertionHelper;
    @BeforeMethod
    public void init (){
        markupsBase = new MarkupsBase(AdminDriver);
        login = new AdminLoginHelper();
        assertionHelper=new AssertionHelper();
    }

    @Test
    public void testBtnRoutingUserPage() throws InterruptedException {
     login.adminLogin();
     markupsBase.clickOnMarkupsBtn();
     markupsBase.clickOnUserBtn();
//     assertionHelper.assertElementIsNotVisible(AdminDriver, By.xpath("(//th[@class=\"xcrud-column xcrud-action\"])[2]"));

    }

    @Test
    public void testBtnRoutingFlightsPage() throws InterruptedException {
     login.adminLogin();
     markupsBase.clickOnMarkupsBtn();
     markupsBase.clickOnFlightsBtn();
    }
    @Test
    public void testBtnRoutingToursPage() throws InterruptedException {
     login.adminLogin();
     markupsBase.clickOnMarkupsBtn();
     markupsBase.clickOnToursBtn();
    }
    @Test
    public void testBtnRoutingHotelsPage() throws InterruptedException {
     login.adminLogin();
     markupsBase.clickOnMarkupsBtn();
     markupsBase.clickOnHotelsBtn();
    }
    @Test
    public void testBtnRoutingCarsPage() throws InterruptedException {
     login.adminLogin();
     markupsBase.clickOnMarkupsBtn();
     markupsBase.clickOnCarsBtn();
    }

}
