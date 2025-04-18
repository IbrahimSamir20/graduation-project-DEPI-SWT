package Tests.AdminTest.Settings.EmailSettings;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.EmailSettings.SMTP;
public class SMTPTest extends AdminTestBase{
    SMTP smtp;
    @BeforeMethod
    public void init(){
        smtp = new SMTP(AdminDriver);
    }
    @Test
    public void oo(){}
}
