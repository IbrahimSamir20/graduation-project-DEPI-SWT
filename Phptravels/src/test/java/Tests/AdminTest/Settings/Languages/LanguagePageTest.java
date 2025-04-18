package Tests.AdminTest.Settings.Languages;
import PhptravelsPages.AdminPage.Settings.Languages.LanguagePage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LanguagePageTest extends AdminTestBase {
    LanguagePage language;
    @BeforeMethod
    public void init(){
       language = new LanguagePage(AdminDriver);
    }
    @Test
    public void oo(){}
}
