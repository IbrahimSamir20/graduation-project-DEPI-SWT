package Tests.AdminTest.Settings.Languages;
import Helper.AdminSettingsHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Settings.Languages.AddOrEditPages;
import PhptravelsPages.AdminPage.Settings.Languages.LanguagePage;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LanguagePageTest extends AdminTestBase {
    AddOrEditPages addOrEditPage;
    AssertionHelper assertion;
    AdminSettingsHelper settings;
    LanguagePage language;
    @BeforeMethod
    public void init(){
        addOrEditPage = new AddOrEditPages(AdminDriver);
        assertion = new AssertionHelper();
        settings = new AdminSettingsHelper();
        language = new LanguagePage(AdminDriver);
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByStatusOnToOff () throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByStatus();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[5]"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByStatusOffToOn() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByStatus();
        language.sortAsc();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[5]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByCountryDesc () throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByCountry();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='English']"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByCountryAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByCountry();
        language.sortAsc();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='Chinese']"));
    }
    @Test
    public void VerifyFunctionalityOfSortingLanguageByLanguageCodeDesc () throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByLanguageCode();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='Arabic']"));


    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByLanguageCodeAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByLanguageCode();
        language.sortAsc();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='Turkish']"));

    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByNameDesc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByName();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='Arabic']"));

    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByLanguageByNameAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByName();
        language.sortAsc();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='Turkish']"));

    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByDefaultButtonOnToOff() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByDefault();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[1]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[5]"));
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByDefaultButtonOffToOn() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByDefault();
        language.sortAsc();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[5]"));
        assertion.assertCheckboxIsNotChecked(AdminDriver,By.xpath("(//*[@class=\"makeDefault form-check-input\"])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfSortingLanguageByTypeDesc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByType();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='RTL']"));
    }
    @Test
    public void VerifyFunctionalityOfSortingLanguageByTypeAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByType();
        language.sortAsc();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class='xcrud-row xcrud-row-0'])[1]//td[text()='LTR']"));

    }
    @Test
    public void VerifyFunctionalityOfSelectAllItems() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.selectAll();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,language.SelectAllButton);
    }
    @Test
    public void VerifyFunctionalityOfDefaultButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.defaultButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,language.DefaultButton);
    }
    @Test
    public void VerifyFunctionalityOfTranslationButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.translationButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class=\"form-floating\"])[1]"));
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.deleteButton();
        Thread.sleep(2000);
        assertion.assertConfirmationPopupText(AdminDriver,"Do you really want remove this entry?");
    }
    @Test
    public void VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.editButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,addOrEditPage.Name);

    }
    @Test
    public void VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.searchButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(AdminDriver,By.xpath("//*[@class=\"xcrud-searchdata xcrud-search-active xcrud-input-small\"]"));

    }
    @Test
    public void VerifyFunctionalityOfStatusButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.statusButton();
        Thread.sleep(2000);
        assertion.assertCheckboxIsChecked(AdminDriver,language.StatusButton);

    }
}