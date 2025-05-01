package Tests.AdminTest.Settings.Locations;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.Locations.LocationsPage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LocationsPageTest extends AdminTestBase {
    AdminSettingsHelper settings;
    LocationsPage location;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        location = new LocationsPage(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByStatusOnToOff() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByStatusButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByStatusOffToOn() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByStatusButton();
        Thread.sleep(2000);
        location.sortByAec();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCityZToA() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCityButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCityAToZ() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCityButton();
        Thread.sleep(2000);
        location.sortByAec();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCountryZToA() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCountryButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCountryAToZ() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCountryButton();
        Thread.sleep(2000);
        location.sortByAec();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfAddButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.addButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.searchButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.deleteButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSelectAllButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.selectAllButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfSelectAnItem() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.selectItem();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfDisplay50Button() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.display50itemsButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfDisplay100Button() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.display100itemsButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfDisplayAllButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.displayAllItemsButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfGoToNextPageButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.goToNextPage();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyFunctionalityOfStatusButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.statusButton();
        Thread.sleep(5000);
    }
}
