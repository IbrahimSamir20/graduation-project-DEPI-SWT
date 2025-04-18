package Tests.AdminTest.Settings.Locations;
import PhptravelsPages.AdminPage.Settings.Locations.LocationsPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LocationsPageTest extends AdminTestBase {
    LocationsPage location;
    @BeforeMethod
    public void init(){
       location = new LocationsPage(AdminDriver);
    }
    @Test
    public void oo(){}

}
