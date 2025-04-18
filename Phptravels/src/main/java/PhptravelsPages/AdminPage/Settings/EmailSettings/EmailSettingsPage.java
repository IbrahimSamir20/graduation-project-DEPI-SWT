package PhptravelsPages.AdminPage.Settings.EmailSettings;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class EmailSettingsPage extends PageBase {
    By SMTPDisplayList = By.xpath("(//*[@class=\"accordion-button collapsed\"])[1]");
    By SMTP2GODisplayList = By.xpath("(//*[@class=\"accordion-button collapsed\"])[2]");
    By BackButton = By.xpath("");
    public EmailSettingsPage(WebDriver driver) {
        super(driver);
    }
    public void DisplaySMTPSettings (){
        clickOnElement(SMTPDisplayList);
    }
    public void DisplaySMTP2GOSettings (){
        clickOnElement(SMTP2GODisplayList);
    }
    public void clickBackButton (){
        clickOnElement(BackButton);
    }
}