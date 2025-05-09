package Tests.AdminTest.Settings.Countries;
import Helper.AdminSettingsHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Settings.Countries.AddOrEditCountriesPageBase;
import PhptravelsPages.AdminPage.Settings.Countries.CountriesBasePage;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CountriesPageTest extends AdminTestBase{
    AssertionHelper Assert;
    AdminSettingsHelper settings;
    CountriesBasePage countries;
    AddOrEditCountriesPageBase addOrEditPage ;
    @BeforeMethod
    public void init() {
        Assert = new AssertionHelper();
        countries = new CountriesBasePage(AdminDriver);
        settings = new AdminSettingsHelper();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIsoDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso();
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIsoAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Andorra);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNiceNameDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNiceName();
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNiceNameAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNiceName();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Afghanistan);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIso3Desc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso3();
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByIso3Asc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortIso3();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.UnitedStates);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNumCodeDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNumCode();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.BruneiDarussalam);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNumCodeAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortNumCode();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.SouthGeorgia);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByPhoneCodeDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortPhoneCode();
        Assert.assertElementIsVisible(AdminDriver,countries.Uzbekistan);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByPhoneCodeAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortPhoneCode();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Pitcairn);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByCountryStatusDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortCountryStatus();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByCountryStatusAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortCountryStatus();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByTrafficDesc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortTraffic();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByTrafficAsc() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.sortTraffic();
        countries.sortAsc();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Zimbabwe);
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
        Assert.assertElementIsVisible(AdminDriver,countries.SearchTextField);
    }
    @Test
    public void  VerifyFunctionalityOfAddButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.addButton();
        Thread.sleep(5000);
        Assert.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]"));

    }
    @Test
    public void  VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.editButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]"));
    }
    @Test
    public void  VerifyFunctionalityOfDisplay50ItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.display50itemsButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Num50);
    }
    @Test
    public void  VerifyFunctionalityOfDisplay100ItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.display100itemsButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.Num100);
    }
    @Test
    public void  VerifyFunctionalityOfDisplayAllItemsInThePage() throws InterruptedException {
        settings.GoToCountries();
        Thread.sleep(2000);
        countries.displayAllItemsButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,countries.All);
    }
}
