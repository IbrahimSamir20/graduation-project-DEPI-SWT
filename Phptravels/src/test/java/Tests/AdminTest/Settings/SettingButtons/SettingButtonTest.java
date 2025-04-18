package Tests.AdminTest.Settings.SettingButtons;
import PhptravelsPages.AdminPage.Settings.SettingButtons.SettingsBasePage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingButtonTest extends AdminTestBase {
    SettingsBasePage settings;
    @BeforeMethod
    public void init(){
        settings = new SettingsBasePage(AdminDriver);
    }
    @Test
    public void oo(){}
}