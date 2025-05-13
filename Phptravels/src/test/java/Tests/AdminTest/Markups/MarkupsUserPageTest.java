package Tests.AdminTest.Markups;

import PhptravelsPages.AdminPage.Markups.MarkupsUserPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Helper.MarkupsHelper;

public class MarkupsUserPageTest extends AdminTestBase {
    MarkupsUserPage markupsUserPage;
    MarkupsHelper markupsHelper ;
    @BeforeMethod
    public void init(){
        markupsHelper = new MarkupsHelper();
        markupsUserPage = new MarkupsUserPage(AdminDriver);
    }
    
    @Test
    public void testCheckBox() throws InterruptedException{
        markupsHelper.gotToUserMarkup();
        markupsUserPage.clickOnCheckboxStatus();

    }
    @Test
    public void testEditBtn() throws InterruptedException {
        markupsHelper.gotToUserMarkup();
        markupsUserPage.clickOnEditBtn();
    }
    @Test
    public void testDeleteBtn() throws InterruptedException {
        markupsHelper.gotToUserMarkup();
        markupsUserPage.clickOnDeleteBtn();
    }
}
