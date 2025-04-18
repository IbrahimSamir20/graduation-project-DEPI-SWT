package Tests.AdminTest.Settings.GeneralSettings;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.GeneralSettings.GeneralSettingPage;
public class GeneralSettingPageTest extends AdminTestBase{
    GeneralSettingPage generalSetting;
    @BeforeMethod
    public void init(){
        generalSetting = new GeneralSettingPage(AdminDriver);
    }
    @Test
    public void oo(){}

}