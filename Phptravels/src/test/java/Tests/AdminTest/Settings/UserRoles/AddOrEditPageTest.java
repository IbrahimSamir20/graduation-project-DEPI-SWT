package Tests.AdminTest.Settings.UserRoles;

import PhptravelsPages.AdminPage.Settings.UserRoles.AddOrEditPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AddOrEditPageTest extends AdminTestBase {
    AddOrEditPage test;
    @BeforeMethod
    public void init(){
        test = new AddOrEditPage(AdminDriver);
    }
    @Test
    public void oo(){}
}
