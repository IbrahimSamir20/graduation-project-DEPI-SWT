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
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByStatusOffToOn() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByStatusButton();
        Thread.sleep(2000);
        location.sortByAec();
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCityZToA() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCityButton();
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCityAToZ() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCityButton();
        location.sortByAec();
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCountryZToA() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCountryButton();
    }
    @Test
    public void VerifyFunctionalityOfSortLocationsByCountryAToZ() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.sortByCountryButton();
        location.sortByAec();
    }
    @Test
    public void VerifyFunctionalityOfAddButton() throws InterruptedException {
        settings.GoToLocations();
        location.addButton();
    }
    @Test
    public void VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.editButton();
    }
    @Test
    public void VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.searchButton();
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.deleteButton();
    }
    @Test
    public void VerifyFunctionalityOfSelectAllButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.selectAllButton();
    }
    @Test
    public void VerifyFunctionalityOfSelectAnItem() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.selectItem();
    }
    @Test
    public void VerifyFunctionalityOfDisplay50Button() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.display50itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplay100Button() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.display100itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplayAllButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.displayAllItemsButton();
    }
    @Test
    public void VerifyFunctionalityOfGoToNextPageButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.goToNextPage();
    }
    @Test
    public void VerifyFunctionalityOfStatusButton() throws InterruptedException {
        settings.GoToLocations();
        Thread.sleep(2000);
        location.statusButton();
    }
}
