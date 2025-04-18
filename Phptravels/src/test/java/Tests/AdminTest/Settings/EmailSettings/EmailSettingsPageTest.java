package Tests.AdminTest.Settings.EmailSettings;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.EmailSettings.EmailSettingsPage;
public class EmailSettingsPageTest extends  AdminTestBase{
    EmailSettingsPage email;
    @BeforeMethod
    public void init(){
        email = new EmailSettingsPage(AdminDriver);
    }
    @Test
    public void oo(){}

}