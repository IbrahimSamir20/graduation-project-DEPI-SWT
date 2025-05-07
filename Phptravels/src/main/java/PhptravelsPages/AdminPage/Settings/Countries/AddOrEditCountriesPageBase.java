package PhptravelsPages.AdminPage.Settings.Countries;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddOrEditCountriesPageBase extends PageBase{
    By Iso = By.xpath("(//*[@class=\"xcrud-input form-control\"])[1]");
    public By Name = By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]");
    By NiceName = By.xpath("(//*[@class=\"xcrud-input form-control\"])[3]");
    By Iso3 = By.xpath("(//*[@class=\"xcrud-input form-control\"])[4]");
    By NumCode = By.xpath("(//*[@class=\"xcrud-input form-control\"])[5]");
    By PhoneCode = By.xpath("(//*[@class=\"xcrud-input form-control\"])[6]");
    By CountryStatus = By.xpath("//*[@class=\"select2-selection__rendered\"]");
    By Traffic = By.xpath("(//*[@class=\"xcrud-input form-control\"])[7]");
    public AddOrEditCountriesPageBase(WebDriver driver) {
        super(driver);
    }
    public void fillIso (String iso){
        sendKeys(Iso,iso);
    }
    public void fillName (String name){
        sendKeys(Name,name);
    }
    public void fillNiceName (String name){
        sendKeys(NiceName,name);
    }
    public void fillIso3 (String iso3){
        sendKeys(Iso3,iso3);
    }
    public void fillNumCode (String code){
        sendKeys(NumCode,code);
    }
    public void fillPhoneCode (String code){
        sendKeys(PhoneCode,code);
    }
    public void selectCountryStatus (String option){
        selectDropDown(CountryStatus,option);
    }
    public void fillTraffic (String traffic){
        sendKeys(Traffic,traffic);
    }
}
