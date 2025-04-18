package PhptravelsPages.AdminPage.Settings.PaymentGateways;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PaymentGateways extends PageBase {
    By SettingsButton = By.xpath("(//*[@class=\"btn btn-outline-danger btn-sm pull-left rounded-5\"])[2]");
    By StatusButton = By.xpath("(//*[@class=\"form-check-input\"])[5]");
    By BackButton = By.xpath("//*[@class=\"loading_effect btn btn-warning\"]");
    public PaymentGateways(WebDriver driver) {
        super(driver);
    }
    public void goToSettings(){
        clickOnElement(SettingsButton);
    }
    public void statusButton(){
        clickOnElement(StatusButton);
    }
    public void Back(){
        clickOnElement(BackButton);
    }
}
