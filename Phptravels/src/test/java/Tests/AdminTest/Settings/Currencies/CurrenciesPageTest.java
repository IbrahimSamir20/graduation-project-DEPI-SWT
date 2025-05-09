package Tests.AdminTest.Settings.Currencies;
import Helper.AdminSettingsHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Settings.Currencies.AddOrEditPages;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.AdminPage.Settings.Currencies.CurrenciesPage;
public class CurrenciesPageTest extends AdminTestBase {
    AddOrEditPages addOrEditPage;
    AssertionHelper assertion;
    AdminSettingsHelper settings;
    CurrenciesPage currencies;
    @BeforeMethod
    public void init(){
        assertion = new AssertionHelper();
        addOrEditPage = new AddOrEditPages(AdminDriver);
        settings = new AdminSettingsHelper();
        currencies = new CurrenciesPage(AdminDriver);
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByStatusOnToOff() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByStatusButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[5]"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByStatusOffToOn() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByStatusButton();
        currencies.sortByAec();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[5]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByDefaultOnToOff() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByDefaultButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[1]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[5]"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByDefaultOffToOn() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByDefaultButton();
        currencies.sortByAec();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[5]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[1]"));;
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNameAToZ() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByNameButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='USD']"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByNameZToA() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByNameButton();
        currencies.sortByAec();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='EUR']"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByRateAToZ() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByRateButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='SAR']"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingCountriesByRateZToA() throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.sortByRateButton();
        currencies.sortByAec();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='GBP']"));
    }
    @Test
    public void VerifyFunctionalityOfSearchButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.searchButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"xcrud-searchdata xcrud-search-active xcrud-input-small\"]"));
    }
    @Test
    public void VerifyFunctionalityOfAddButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.addButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,addOrEditPage.Name);
    }
    @Test
    public void VerifyFunctionalityOfEditButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.editButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,addOrEditPage.Name);
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.deleteButton();
        Thread.sleep(2000);
        assertion.assertConfirmationPopupText(AdminDriver,"Do you really want remove this entry?");
    }
    @Test
    public void VerifyFunctionalityOfSelectAllButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.selectAllButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,currencies.SelectAllButton);
        assertion.assertCheckboxIsChecked(AdminDriver,currencies.SelectItemButton);
    }
    @Test
    public void VerifyFunctionalityOfSelectAnItemButton () throws InterruptedException {
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.selectItem();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,currencies.SelectItemButton);
    }
    @Test
    public void VerifyFunctionalityOfStatusButton () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.statusButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,currencies.StatusButton);
    }
    @Test
    public void VerifyFunctionalityOfDefaultButton () throws InterruptedException{
        settings.GoToCurrencies();
        Thread.sleep(2000);
        currencies.defaultButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,currencies.DefaultButton);
    }
}
