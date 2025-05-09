package PhptravelsPages.AdminPage.Settings.Currencies;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddOrEditPages extends PageBase{
    By StatusDropList = By.xpath("(//*[@class=\"select2-selection select2-selection--single\"])[1]");
    By StatusTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    public By Name = By.xpath("(//*[@class=\"xcrud-input form-control\"])[1]");
    By CountryDropList = By.xpath("(//*[@class=\"select2-selection select2-selection--single\"])[2]");
    By CountryTextField = By.xpath("//*[@class=\"select2-search__field\"]");
    By Rate = By.xpath("(//*[@class=\"xcrud-input form-control\"])[2]");
    By SaveButton = By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    By ReturnButton = By.xpath("//*[@class=\"xcrud-button xcrud-orange xcrud-action\"]");
    public AddOrEditPages(WebDriver driver) {
        super(driver);
    }
    public void fillStatusDropList(String status) throws InterruptedException {
        sendKeysToDropList(StatusDropList,StatusTextField,status);
    }
    public void name (String name){
        sendKeys(Name,name);
    }
    public void fillCountryTextField(String country) throws InterruptedException {
        sendKeysToDropList(CountryDropList,CountryTextField,country);
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