package Tests.AdminTest.Settings.UserRoles;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.UserRoles.UsersRolesPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class UsersRolesPageTest extends AdminTestBase {
    AdminSettingsHelper settings;
    UsersRolesPage roles;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        roles = new UsersRolesPage(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfAddButton() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.addButton();
    }
    @Test
    public void VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.editButton();
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.deleteButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplay25Button() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.display25itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplay50Button() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.display50itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplay100Button() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.display100itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplayAllButton() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.displayAllItemsButton();
    }
    @Test
    public void VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.searchButton();
    }
    @Test
    public void VerifyFunctionalityOfSortingNameZToA() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.sortByTypeNameAsc();
    }
    @Test
    public void VerifyFunctionalityOfSortingNameAToZ() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.sortByTypeNameDesc();
    }
}
