package Tests.AdminTest.Settings.UserRoles;
import PhptravelsPages.AdminPage.Settings.UserRoles.UsersRolesPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class UsersRolesPageTest extends AdminTestBase {
    UsersRolesPage roles;
    @BeforeMethod
    public void init(){
        roles = new UsersRolesPage(AdminDriver);
    }
    @Test
    public void oo(){}
}
