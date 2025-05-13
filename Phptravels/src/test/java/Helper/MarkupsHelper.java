package Helper;

import PhptravelsPages.AdminPage.Markups.MarkupsBase;
import PhptravelsPages.AdminPage.Markups.MarkupsUserPage;
import Tests.TestBase.AdminTestBase;

public class MarkupsHelper extends AdminTestBase {
        AdminLoginHelper login= new AdminLoginHelper();
        MarkupsBase markBtn = new MarkupsBase(AdminDriver);
        MarkupsUserPage markupsUserPage = new MarkupsUserPage(AdminDriver);
        public void gotToUserMarkup() throws InterruptedException{
                login.adminLogin();
                Thread.sleep(2000);
                markBtn.clickOnMarkupsBtn();
                markBtn.clickOnUserBtn();
        }

        public void goToUserMarkupAdd() throws InterruptedException{
                login.adminLogin();
                Thread.sleep(2000);
                markBtn.clickOnMarkupsBtn();
                markBtn.clickOnUserBtn();
                markupsUserPage.clickOnAddButton();

        }

        public void gotToUserMarkupEditFirstRow() throws InterruptedException{
                login.adminLogin();
                Thread.sleep(2000);
                markBtn.clickOnMarkupsBtn();
                markBtn.clickOnUserBtn();
                markupsUserPage.clickOnEditBtn();

        }
}
