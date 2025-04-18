package Tests.AdminTest.Settings.Countries;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.Countries.AddOrEditPages;
import Tests.TestBase.AdminTestBase;
public class AddOrEditPagesTest extends AdminTestBase {
    AddOrEditPages test;
    @BeforeMethod
    public void init(){
        test = new AddOrEditPages(AdminDriver);
    }
    @Test
    public void oo(){}
}