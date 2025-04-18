package PhptravelsPages.AdminPage.Alerts;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AlertsBase extends PageBase{
    By AlertsButton = By.xpath("//*[@class=\"d-flex justify-content-between w-100\"]");
    By DeleteAlertButton = By.xpath("(//*[@class=\"btn btn-warning btn-sm p-3 py-0\"])[1]");
    public AlertsBase(WebDriver driver) {
        super(driver);
    }
    public void displayAlerts (){
        clickOnElement(AlertsButton);
    }
    public void DeleteAlert(){
        clickOnElement(DeleteAlertButton);
    }
}
