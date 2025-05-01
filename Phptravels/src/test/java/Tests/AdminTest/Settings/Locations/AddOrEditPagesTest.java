package Tests.AdminTest.Settings.Locations;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.Locations.AddOrEditPages;
import PhptravelsPages.AdminPage.Settings.Locations.LocationsPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddOrEditPagesTest extends AdminTestBase {
    AdminSettingsHelper settings;
    LocationsPage location;
    AddOrEditPages test;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        location = new LocationsPage(AdminDriver);
        test = new AddOrEditPages(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfAddNewLocationByFillStatus() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(2000);
        test.fillStatusDropList("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfAddNewLocationByFillCity() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(2000);
        test.fillCity("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfAddNewLocationByFillCountry() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(2000);
        test.fillCountryDropList("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfAddNewLocationByFillLatitude () throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(2000);
        test.fillLatitude("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfAddNewLocationByFillLongitude() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(2000);
        test.fillLongitude("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfEditLocationByFillCity() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfEditLocationByFillStatus() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfEditNewLocationByFillCountry() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(2000);
        test.fillCountryDropList("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfEditNewLocationByFillLatitude() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(2000);
        test.fillLatitude("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfEditLocationByFillLongitude() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(2000);
        test.fillLongitude("");
        Thread.sleep(2000);
    }
    @Test
    public void VerifyFunctionalityOfAddNewLocationByFillRequirements() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(2000);
        test.fillStatusDropList("");
        Thread.sleep(2000);
        test.fillCity("");
        Thread.sleep(2000);
        test.fillCountryDropList("");
        Thread.sleep(2000);
        test.fillLatitude("");
        Thread.sleep(2000);
        test.fillLongitude("");
        Thread.sleep(2000);

    }
    @Test
    public void VerifyFunctionalityOfEditLocationByFillRequirement() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(2000);
        test.fillStatusDropList("");
        Thread.sleep(2000);
        test.fillCity("");
        Thread.sleep(2000);
        test.fillCountryDropList("");
        Thread.sleep(2000);
        test.fillLatitude("");
        Thread.sleep(2000);
        test.fillLongitude("");
        Thread.sleep(2000);
        Thread.sleep(2000);
    }
}
