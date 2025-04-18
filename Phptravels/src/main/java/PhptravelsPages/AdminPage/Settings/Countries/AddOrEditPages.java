package PhptravelsPages.AdminPage.Settings.Countries;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddOrEditPages extends PageBase{
    By StatusDropList = By.xpath("(//*[@class=\"select2-selection select2-selection--single\"])[1]");
    By StatusTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By StatusOptions = By.xpath("//*[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected\"]");
    By Name = By.xpath("(//*[@class=\"xcrud-input form-control\"])[1]");
    By CountryDropList = By.xpath("(//*[@class=\"select2-selection select2-selection--single\"])[2]");
    By CountryTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By CountryOptions = By.xpath("(//*[@class=\"select2-results__option select2-results__option--selectable\"])[1]");
    By Rate = By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]");
    By SaveButton = By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    By ReturnButton = By.xpath("//*[@class=\"xcrud-button xcrud-orange xcrud-action\"]");
    public AddOrEditPages(WebDriver driver) {
        super(driver);
    }
    public void statusDropList (){
        clickOnElement(StatusDropList);
    }
    public void statusTextField (String status){
        sendKeys(StatusTextField,status);
    }
    public void selectOption (String option){
        clickOnElement(StatusOptions);
    }
    public void name (String name){
        sendKeys(Name,name);
    }
    public void countryDropList (){
        clickOnElement(CountryDropList);
    }
    public void countryTextField (String option){
        sendKeys(CountryTextField,option);
    }
    public void countryOptions(){
        clickOnElement(CountryOptions);
    }
    public void rate(String rate){
        sendKeys(Rate,rate);
    }
    public void saveButton (){
        clickOnElement(SaveButton);
    }
    public void returnButton (){
        clickOnElement(ReturnButton);
    }

}