package PhptravelsPages.AdminPage.Settings.Languages;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddOrEditPages extends PageBase{
    By StatusDropList = By.xpath("(//*[@class=\"select2-selection__rendered\"])[1]");
    By StatusTextField = By.xpath("(//*[@class=\"select2-search__field\"])[1]");
    By StatusOption = By.xpath("(//*[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected\"])[1]");
    By CountryDropList = By.xpath("(//*[@class=\"select2-selection__rendered\"])[2]");
    By CountryTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By CountryOption = By.xpath("(//*[@class=\"select2-results__option select2-results__option--selectable\"])[1]");
    By LanguageCode = By.xpath("(//*[@class=\"xcrud-input form-control\"])[1]");
    By Name = By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]");
    By TypeDropList = By.xpath("//*[@class=\"select2 select2-container select2-container--default select2-container--focus\"]");
    By TypeTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By TypeOption = By.xpath("//*[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected\"]");
    By SaveButton = By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    By ReturnButton = By.xpath("class=\"xcrud-button xcrud-orange xcrud-action\"");
    public AddOrEditPages(WebDriver driver) {
        super(driver);
    }
    public void statusDropList (){
        clickOnElement(StatusDropList);
    }
    public void fillStatusTextField (String status){
        sendKeys(StatusTextField,status);
    }
    public void statusOption (){
        clickOnElement(StatusOption);
    }
    public void countryDropList (){
        clickOnElement(CountryDropList);
    }
    public void fillCountryTextField (String country){
        sendKeys(CountryTextField,country);
    }
    public void countryOption (){
        clickOnElement(CountryOption);
    }
    public void fillLanguageCode (String languageCode){
        sendKeys(LanguageCode,languageCode);
    }
    public void fillName (String name){
        sendKeys(Name,name);
    }
    public void typeDropList (){
        clickOnElement(TypeDropList);
    }
    public void fillTypeTextField (String type){
        sendKeys(TypeTextField,type);
    }
    public void typeOption (){
        clickOnElement(TypeOption);
    }
    public void saveButton (){
        clickOnElement(SaveButton);
    }
    public void returnButton(){
        clickOnElement(ReturnButton);
    }
}
