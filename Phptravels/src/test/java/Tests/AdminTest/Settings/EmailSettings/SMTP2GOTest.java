package Tests.AdminTest.Settings.EmailSettings;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.EmailSettings.SMTP2GO;
public class SMTP2GOTest extends AdminTestBase{
    SMTP2GO smtp2go;
    @BeforeMethod
    public void init(){
        smtp2go = new SMTP2GO(AdminDriver);
    }
    @Test
    public void oo(){}
}