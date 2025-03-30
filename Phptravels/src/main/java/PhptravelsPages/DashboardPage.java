package PhptravelsPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DashboardPage extends PageBase {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    String url = "https://phptravels.net/";  //expected Result

    /*public String ActualResultAssertr(String ErrorMassage){
        return driver.("Select From Airport");
    }

    public String ActualResultAssert(String ActualResultPath){
        By actualResult = By.xpath(ActualResultPath);
        return driver.findElement(actualResult).getText();
    }*/
}
