package PhptravelsPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DashboardPage extends PageBase {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    String url = "https://phptravels.net/";  //expected Result

    public String dashboardText = "Dashboard";

    /*By actualResult =By.xpath("");

    public String ActualResultAssert(){
        return driver.findElement(actualResult).getText();
    }*/
}
