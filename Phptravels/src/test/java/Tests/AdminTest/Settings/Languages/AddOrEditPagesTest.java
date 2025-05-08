package Tests.AdminTest.Settings.Languages;
import Helper.AdminSettingsHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Settings.Languages.AddOrEditPages;
import PhptravelsPages.AdminPage.Settings.Languages.LanguagePage;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AddOrEditPagesTest extends AdminTestBase {
    AssertionHelper Assert;
    AdminSettingsHelper settings;
    LanguagePage language;
    AddOrEditPages test;
    @BeforeMethod
    public void init() throws InterruptedException {
        Assert = new AssertionHelper();
        settings = new AdminSettingsHelper();
        language = new LanguagePage(AdminDriver);
        test = new AddOrEditPages(AdminDriver);
    }
    @Test
    public void VerifyFunctionalityOfSelectOptionFromStatus() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.statusDropList("Enabled");
        Assert.assertDropListSelection(test.StatusDropList,"Enabled" );

    }
    @Test
    public void VerifyFunctionalityOfSelectOptionFromCountry() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.countryDropList("Egypt");
        Assert.assertDropListSelection(test.CountryDropList, "EGYPT");
    }
    @Test
    public void  VerifyFunctionalityOfFillLanguageCode() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.fillLanguageCode("ar");
        Assert.assertingOfTextField(test.LanguageCode,"ar");
    }
    @Test
    public void  VerifyFunctionalityOfFillName() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.fillName("Egypt");
        Assert.assertingOfTextField(test.Name,"Egypt");
    }
    @Test
    public void VerifyFunctionalityOfSelectOptionFromType() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.typeDropList("RTL");
        Assert.assertDropListSelection(test.TypeDropList,"RTL");
    }
    @Test
    public void  VerifyFunctionalityOfSaveButtonWithoutEnterData() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.saveButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(test.SaveButton);
    }
    @Test
    public void VerifyFunctionalityOfSaveButtonWithFillData() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.statusDropList("Enable");
        test.countryDropList("Egypt");
        test.fillLanguageCode("EGY");
        test.fillName("Egypt");
        test.typeDropList("RTL");
        test.saveButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(test.EgyFlag);
    }
    @Test
    public void VerifyFunctionalityOfReturnButton() throws InterruptedException {
        settings.GoToLanguages();
        Thread.sleep(2000);
        language.addButton();
        Thread.sleep(2000);
        test.statusDropList("Enable");
        test.countryDropList("Egypt");
        test.fillLanguageCode("EGY");
        test.fillName("Egypt");
        test.typeDropList("RTL");
        test.returnButton();
        Assert.assertElementIsVisible(test.EgyFlag);
    }
}
