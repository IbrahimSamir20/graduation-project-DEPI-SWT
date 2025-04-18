package Tests.AdminTest.Settings.Countries;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.Countries.CountriesPage;
public class CountriesPageTest extends AdminTestBase {
    CountriesPage countries;
    @BeforeMethod
    public void init(){
        countries = new CountriesPage(AdminDriver);
    }
    @Test
    public void oo(){}

}
