package Tests.AdminTest.Settings.Locations;
import PhptravelsPages.AdminPage.Settings.Locations.AddOrEditPages;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddOrEditPagesTest extends AdminTestBase {
    AddOrEditPages test;
    @BeforeMethod
    public void init(){
       test = new AddOrEditPages(AdminDriver);
    }
    @Test
    public void oo(){}
}
