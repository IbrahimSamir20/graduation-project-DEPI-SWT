package PhptravelsPages.AdminPage.Settings.PaymentGateways;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PaymentMethodSettingsPage extends PageBase{
    By StatusButton = By.xpath("//*[@class=\"form-check-input\"]");
    By Credentials1 = By.xpath("(//*[@class=\"form-control\"])[1]");
    By Credentials2 = By.xpath("(//*[@class=\"form-control\"])[2]");
    By Credentials3 = By.xpath("(//*[@class=\"form-control\"])[3]");
    By Credentials4 = By.xpath("(//*[@class=\"form-control\"])[4]");
    By DevModeDropList = By.xpath("(//*[@class=\"form-select\"])[1]");
    By CurrencyDropList = By.xpath("(//*[@class=\"form-select\"])[2]");
    By AdminNotes =By.xpath("(//*[@class=\"form-control\"])[5]");
    By SubmitButton =By.xpath("//*[@class=\"btn btn-primary mdc-ripple-upgraded\"]");
    By BackButton = By.xpath("//*[@class=\"loading_effect btn btn-warning\"]");
    public PaymentMethodSettingsPage(WebDriver driver) {
        super(driver);
    }
    public void statusButton(){
        clickOnElement(StatusButton);
    }
    public void credentials1 (String credential){
        sendKeys(Credentials1,credential);
    }
    public void credentials2 (String credential){
        sendKeys(Credentials2,credential);
    }
    public void credentials3 (String credential){
        sendKeys(Credentials3,credential);
    }
    public void credentials4 (String credential){
        sendKeys(Credentials4,credential);
    }
    public void devModeDropList(String option){
        selectDropDown(DevModeDropList,option);
    }
    public void currencyDropList(String option){
        selectDropDown(CurrencyDropList,option);
    }
    public void adminNotes (String  note){
        sendKeys(AdminNotes,note);
    }
    public void submitButton (){
        clickOnElement(SubmitButton);
    }
    public void Back(){
        clickOnElement(BackButton);
    }
}
