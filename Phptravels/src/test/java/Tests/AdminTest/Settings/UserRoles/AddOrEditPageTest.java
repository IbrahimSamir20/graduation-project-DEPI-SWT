package Tests.AdminTest.Settings.UserRoles;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.UserRoles.AddOrEditPage;
import PhptravelsPages.AdminPage.Settings.UserRoles.UsersRolesPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AddOrEditPageTest extends AdminTestBase {
    AddOrEditPage test;
    AdminSettingsHelper settings;
    UsersRolesPage roles;

    @BeforeMethod
    public void init() {
        settings = new AdminSettingsHelper();
        roles = new UsersRolesPage(AdminDriver);
        test = new AddOrEditPage(AdminDriver);
    }

    @Test
    public void VerifyFunctionalityOfAddNewUserBySetName() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.addButton();
        Thread.sleep(2000);
        test.roleName("Omar Talaat");
        Thread.sleep(2000);
        test.submit();
        Thread.sleep(5000);
    }

    @Test
    public void VerifyFunctionalityOfAddNewUserBySelectPermission() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.addButton();
        Thread.sleep(2000);
        test.permission();
        Thread.sleep(2000);
        test.submit();
        Thread.sleep(5000);
    }

    @Test
    public void VerifyFunctionalityOfEditUserName() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.editButton();
        Thread.sleep(2000);
        test.roleName("Mahmoud");
        Thread.sleep(2000);
        test.submit();
        Thread.sleep(5000);
    }

    @Test
    public void VerifyFunctionalityOfEditUserPermission() throws InterruptedException {
        settings.GoToUserRoles();
        Thread.sleep(2000);
        roles.editButton();
        Thread.sleep(2000);
        test.selectAll();
        Thread.sleep(2000);
        test.submit();
        Thread.sleep(5000);
    }
}