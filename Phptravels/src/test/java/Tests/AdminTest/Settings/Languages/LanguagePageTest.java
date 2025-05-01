package Tests.AdminTest.Settings.Languages;
import Helper.AdminSettingsHelper;
import PhptravelsPages.AdminPage.Settings.Languages.LanguagePage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LanguagePageTest extends AdminTestBase {
    AdminSettingsHelper settings;
    LanguagePage language;
    @BeforeMethod
    public void init(){
        settings = new AdminSettingsHelper();
        language = new LanguagePage(AdminDriver);
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByStatusOnToOff () throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByStatus();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByStatusOffToOn() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByStatus();
        language.sortAsc();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByCountryDesc () throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByCountry();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByCountryAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByCountry();
        language.sortAsc();
    }
    @Test
    public void VerifyFunctionalityOfSortingLanguageByLanguageCodeDesc () throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByLanguageCode();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByLanguageCodeAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByLanguageCode();
        language.sortAsc();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByNameDesc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByName();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByLanguageByNameAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByName();
        language.sortAsc();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByDefaultButtonOnToOff() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByDefault();
    }
    @Test
    public void  VerifyFunctionalityOfSortingLanguageByDefaultButtonOffToOn() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByDefault();
        language.sortAsc();
    }
    @Test
    public void VerifyFunctionalityOfSortingLanguageByTypeDesc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByType();
    }
    @Test
    public void VerifyFunctionalityOfSortingLanguageByTypeAsc() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.sortByType();
        language.sortAsc();
    }
    @Test
    public void VerifyFunctionalityOfSelectAllItems() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.selectAll();
    }
    @Test
    public void VerifyFunctionalityOfDefaultButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.defaultButton();
    }
    @Test
    public void VerifyFunctionalityOfTranslationButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.translationButton();
    }
    @Test
    public void VerifyFunctionalityOfDeleteButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.deleteButton();
    }
    @Test
    public void VerifyFunctionalityOfEditButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.editButton();
    }
    @Test
    public void VerifyFunctionalityOfSearchButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.searchButton();
    }
    @Test
    public void VerifyFunctionalityOfStatusButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.statusButton();
    }
}