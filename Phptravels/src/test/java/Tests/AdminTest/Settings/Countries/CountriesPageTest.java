package Tests.AdminTest.Settings.Countries;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.Countries.AddOrEditCountriesPageBase;
import PhptravelsPages.AdminPage.Settings.Countries.CountriesBasePage;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CountriesPageTest extends AdminTestBase{
    AdminSettingsHelper settings;
    CountriesBasePage countries;
    AddOrEditCountriesPageBase addOrEditPage ;
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
        settings.assertElementIsVisible(countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIsoAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.Andorra);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNiceNameDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNiceName();
        settings.assertElementIsVisible(countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNiceNameAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNiceName();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.Afghanistan);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIso3Desc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso3();
        settings.assertElementIsVisible(countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIso3Asc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso3();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.UnitedStates);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNumCodeDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNumCode();
        settings.assertElementIsVisible(countries.BruneiDarussalam);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNumCodeAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNumCode();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.SouthGeorgia);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByPhoneCodeDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortPhoneCode();
        settings.assertElementIsVisible(countries.Uzbekistan);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByPhoneCodeAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortPhoneCode();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.Pitcairn);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByCountryStatusDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortCountryStatus();
        settings.assertElementIsVisible(countries.Pitcairn);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByCountryStatusAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortCountryStatus();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.Pitcairn);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByTrafficDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortTraffic();
        settings.assertElementIsVisible(countries.India);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByTrafficAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortTraffic();
        countries.sortAsc();
        settings.assertElementIsVisible(countries.Pitcairn);
    }
    @Test
    public void  VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.deleteButton();
    }
    @Test
    public void  VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.searchButton();
        settings.assertElementIsVisible(countries.SearchTextField);
    }
    @Test
    public void  VerifyFunctionalityOfAddButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.addButton();
        settings.assertElementIsVisible(addOrEditPage.Name);

    }
    @Test
    public void  VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.editButton();
        settings.assertElementIsVisible(addOrEditPage.Name);
    }
    @Test
    public void  VerifyFunctionalityOfDisplay50ItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.display50itemsButton();
        settings.assertElementIsVisible(countries.Num50);
    }
    @Test
    public void  VerifyFunctionalityOfDisplay100ItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.display100itemsButton();
        settings.assertElementIsVisible(countries.Num100);
    }
    @Test
    public void  VerifyFunctionalityOfDisplayAllItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.displayAllItemsButton();
        settings.assertElementIsVisible(countries.All);
    }
}
