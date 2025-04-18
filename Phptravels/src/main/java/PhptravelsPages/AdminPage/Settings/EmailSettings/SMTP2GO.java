package PhptravelsPages.AdminPage.Settings.EmailSettings;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SMTP2GO extends PageBase{
    By DefaultButton = By.xpath("(//*[@class=\"form-check form-switch\"])[2]");
    By APIKey = By.xpath("(//*[@class=\"form-control\"])[8]");
    By SenderName = By.xpath("(//*[@class=\"form-control\"])[9]");
    By SenderEmail = By.xpath("(//*[@class=\"form-control\"])[10]");
    By SubmitButton = By.xpath("(//*[@class=\"btn btn-primary mdc-ripple-upgraded\"])[2]");
    By SendTestEmail = By.xpath("(//*[@class=\"form-control\"])[11]");
    By SubmitSendTestEmailButton = By.xpath("//*[@class=\"test_mail btn btn-primary\"]");
    public SMTP2GO(WebDriver driver) {
        super(driver);
    }
    public void defaultButton (){
        clickOnElement(DefaultButton);
    }
    public void apiKey (String key){
        sendKeys(APIKey,key);
    }
    public void senderName (String name){
        sendKeys(SenderName,name);
    }
    public void senderEmail (String email){
        sendKeys(SenderEmail, email);
    }
    public void submitButton (){
        clickOnElement(SubmitButton);
    }
    public void sendTestEmail (String email){
        sendKeys(SendTestEmail,email);
    }
    public void submitTestEmailButton (){
        clickOnElement(SubmitSendTestEmailButton);
    }
}