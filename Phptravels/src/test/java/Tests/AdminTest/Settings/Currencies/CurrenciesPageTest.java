package Tests.AdminTest.Settings.Currencies;
import Helper.AdminSettingsHelper;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.Currencies.CurrenciesPage;
public class CurrenciesPageTest extends AdminTestBase {
    AdminSettingsHelper settings;
    CurrenciesPage currencies;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        currencies = new CurrenciesPage(AdminDriver);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByStatusOnToOff() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByStatusButton();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByStatusOffToOn() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByStatusButton();
        currencies.sortByAec();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByDefaultOnToOff() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByDefaultButton();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByDefaultOffToOn() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByDefaultButton();
        currencies.sortByAec();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNameAToZ() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByNameButton();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNameZToA() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByNameButton();
        currencies.sortByAec();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByRateAToZ() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByRateButton();
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByRateZToA() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByRateButton();
        currencies.sortByAec();
    }
    @Test
    public void VerifyFunctionalityOfSearchButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.searchButton();
    }
    @Test
    public void VerifyFunctionalityOfAddButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
    }
    @Test
    public void VerifyFunctionalityOfEditButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.deleteButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplay50Button () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.display50itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplay100Button() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.display100itemsButton();
    }
    @Test
    public void VerifyFunctionalityOfDisplayAllButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.displayAllItemsButton();
    }
    @Test
    public void VerifyFunctionalityOfSelectAllButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.selectAllButton();
    }
    @Test
    public void VerifyFunctionalityOfSelectAnItemButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.selectItem();
    }
    @Test
    public void VerifyFunctionalityOfStatusButton () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.statusButton();
    }
    @Test
    public void VerifyFunctionalityOfDefaultButton () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.defaultButton();
    }
}
