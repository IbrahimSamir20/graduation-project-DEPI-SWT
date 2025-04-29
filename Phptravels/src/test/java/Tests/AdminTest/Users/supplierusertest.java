package Tests.AdminTest.Users;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Users.Adminuser;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;

public class supplierusertest extends AdminTestBase {
    Adminuser user;
    AdminLoginHelper log;
    @BeforeMethod
    public void init()
    {
        user=new Adminuser(AdminDriver);
        log=new AdminLoginHelper();
    }
}
