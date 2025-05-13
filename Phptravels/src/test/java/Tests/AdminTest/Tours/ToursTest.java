package Tests.AdminTest.Tours;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Tours.ToursBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToursTest extends AdminTestBase {
    ToursBase toursetting;
    AdminLoginHelper login;
    @BeforeMethod
    public void init(){
        toursetting =new ToursBase(AdminDriver);
        login=new AdminLoginHelper();
    }

    @Test
    public void addTourInclusionName() throws InterruptedException {
        login.adminLogin();
        toursetting.clickOnTourButton();
        toursetting.clickOnTourSetting();
        toursetting.clickOnAddButton();
        toursetting.fillTourName("welcome");
        toursetting.clickOnSaveButton();
    }

    @Test
    public void returnButton() throws InterruptedException {
        login.adminLogin();
        toursetting.clickOnTourButton();
        toursetting.clickOnTourSetting();
        toursetting.clickOnAddButton();
        toursetting.fillTourName("");
        toursetting.clickOnReturnButton();
    }
    @Test
    public void backButton() throws InterruptedException {
        login.adminLogin();
        toursetting.clickOnTourButton();
        toursetting.clickOnTourSetting();
        toursetting.clickOnAddButton();
        toursetting.clickOnBackButton();
    }
}
