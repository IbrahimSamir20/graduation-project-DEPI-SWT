package PhptravelsPages.AdminPage.Settings.EmailSettings;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SMTP extends PageBase{
    By DefaultButton = By.xpath("(//*[@class=\"form-check-input\"])[1]");
    By STMPHost = By.xpath("(//*[@class=\"form-control\"])[1]");
    By Port = By.xpath("(//*[@class=\"form-control\"])[2]");
    By UserName = By.xpath("(//*[@class=\"form-control\"])[3]");
    By Password = By.xpath("(//*[@class=\"form-control\"])[4]");
    By SecurityDropList = By.xpath("//*[@class=\"form-select\"]");
    By SecurityOption = By.xpath("value=\"tls\"");
    By SenderEmail = By.xpath("(//*[@class=\"form-control\"])[5]");
    By SenderName = By.xpath("(//*[@class=\"form-control\"])[6]");
    By SubmitButton = By.xpath("(//*[@class=\"btn btn-primary mdc-ripple-upgraded\"])[1]");
    By ToEmail = By.xpath("(//*[@class=\"form-control\"])[7]");
    By SendTestEmailButton = By.xpath("//*[@class=\"test_mails btn btn-primary\"]");
    public SMTP(WebDriver driver) {
        super(driver);
    }
    public void defaultButton(){
        clickOnElement(DefaultButton);
    }
    public void STMPHost (String SMTPHost){
        sendKeys(STMPHost,SMTPHost);
    }
    public void port (String port){
        sendKeys(Port,port);
    }
    public void userName (String username){
        sendKeys(UserName,username);
    }
    public void password (String password){
        sendKeys(Password,password);
    }
    public void securityDropList (){
        clickOnElement(SecurityDropList);
    }
    public void securityOption (){
        clickOnElement(SecurityOption);
    }
    public void senderEmail (String email){
        sendKeys(SenderEmail,email);
    }
    public void senderName (String name){
        sendKeys(SenderName,name);
    }
    public void submitButton (){
        clickOnElement(SubmitButton);
    }
    public void toEmail (String email){
        sendKeys(ToEmail,email);
    }
    public void sendTestEmailButton (){
        clickOnElement(SendTestEmailButton);
    }
}
