package PhptravelsPages.AdminPage.Settings.Languages;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddOrEditPages extends PageBase{
    By StatusTextField = By.xpath("(//*[@class=\"select2-search__field\"])[1]");
    By CountryTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By TypeTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By ReturnButton = By.xpath("//*[@class=\"xcrud-button xcrud-orange xcrud-action\"]");
    public By StatusDropList = By.xpath("(//*[@class=\"select2-selection__rendered\"])[1]");
    public By CountryDropList = By.xpath("(//*[@class=\"select2-selection__rendered\"])[2]");
    public By LanguageCode = By.xpath("(//*[@class=\"xcrud-input form-control\"])[1]");
    public By Name = By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]");
    public By TypeDropList = By.xpath("(//*[@class=\"selection\"])[3]");
    public By SaveButton = By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    public By EgyFlag = By.xpath("//*[@class=\"flag egypt\"]");
    public AddOrEditPages(WebDriver driver) {
        super(driver);
    }
    public void statusDropList (String option) throws InterruptedException {
        sendKeysToDropList(StatusDropList,StatusTextField,option);
    }
    public void countryDropList (String option) throws InterruptedException {
        sendKeysToDropList(CountryDropList,CountryTextField,option);
    }
    public void fillLanguageCode (String languageCode){
        sendKeys(LanguageCode,languageCode);
    }
    public void fillName (String name){
        sendKeys(Name,name);
    }
    public void typeDropList (String option) throws InterruptedException {
        sendKeysToDropList(TypeDropList,TypeTextField,option);
    }
    public void saveButton (){
        clickOnElement(SaveButton);
    }
    public void returnButton(){
        clickOnElement(ReturnButton);
    }
}
