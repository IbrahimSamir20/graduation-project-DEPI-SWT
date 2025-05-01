package PhptravelsPages.AdminPage.Settings.SettingButtons;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SettingsBasePage extends PageBase {
    By SettingsButton = By.xpath("(//*[@class=\"mb-0\"])[2]");
    By GeneralSettingsButton = By.xpath("(//*[@class=\"loadeffect link-light \"])[1]");
    By UserRolesButton = By.xpath("(//*[@class=\"loadeffect link-light  \"])[1]");
    By PaymentGatewaysButton = By.xpath("(//*[@class=\"loadeffect link-light  \"])[2]");
    By CurrenciesButton = By.xpath("(//*[@class=\"loadeffect link-light  \"])[3]");
    By LocationButton = By.xpath("(//*[@class=\"loadeffect link-light  \"])[5]");
    By LanguagesButton = By.xpath("(//*[@class=\"loadeffect link-light  \"])[6]");
    By CountriesButton = By.xpath("(//*[@class=\"loadeffect link-light  \"])[7]");
    public SettingsBasePage(WebDriver driver) {
        super(driver);
    }
    public void SettingsButton(){
        clickOnElement(SettingsButton);
    }
    public void clickOnGeneralSettingsButton(){
        clickOnElement(GeneralSettingsButton);
    }
    public void clickOnUserRolesButton(){
        clickOnElement(UserRolesButton);
    }
    public void clickOnPaymentGatewaysButton(){
        clickOnElement(PaymentGatewaysButton);
    }
    public void clickOnCurrenciesButton(){
        clickOnElement(CurrenciesButton);
    }
    public void clickOnLocationButton(){
        clickOnElement(LocationButton);
    }
    public void clickOnLanguagesButton(){
        clickOnElement(LanguagesButton);
    }
    public void clickOnCountriesButton(){
        clickOnElement(CountriesButton);
    }
}