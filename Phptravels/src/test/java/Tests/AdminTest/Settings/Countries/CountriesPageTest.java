package Tests.AdminTest.Settings.Countries;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.Countries.CountriesBasePage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CountriesPageTest extends AdminTestBase{
    AdminSettingsHelper settings;
    CountriesBasePage countries;
    @BeforeMethod
    public void init() {
        countries = new CountriesBasePage(AdminDriver);
        settings = new AdminSettingsHelper();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIsoDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIsoAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNiceNameDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNiceName();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNiceNameAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNiceName();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIso3Desc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso3();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIso3Asc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso3();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNumCodeDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNumCode();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNumCodeAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNumCode();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByPhoneCodeDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortPhoneCode();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByPhoneCodeAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortPhoneCode();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByCountryStatusDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortCountryStatus();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByCountryStatusAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortCountryStatus();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByTrafficDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortTraffic();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByTrafficAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortTraffic();
        countries.sortAsc();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.deleteButton();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.searchButton();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfAddButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.addButton();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.editButton();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfDisplay50ItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.display50itemsButton();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfDisplay100ItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.display100itemsButton();
        Thread.sleep(5000);
    }
    @Test
    public void  VerifyFunctionalityOfDisplayAllItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.displayAllItemsButton();
        Thread.sleep(5000);
    }
}
