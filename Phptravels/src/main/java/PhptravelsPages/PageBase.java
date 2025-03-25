package PhptravelsPages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {
    WebDriver driver;
    public static long Wait =200;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    public void openBrowser (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }
    public  void closeBrowser (){
        driver.quit();
    }
    public void waiTimeToBeClicable(By element){
        WebDriverWait wait;
        wait = new WebDriverWait(driver, Wait);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waiTimeToBeVisible(By element){
        WebDriverWait wait;
        wait = new WebDriverWait(driver,Wait);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void sendKeys (By element, String value){
        waiTimeToBeVisible(element);
        driver.findElement(element).sendKeys(value);
    }
    public void clickOnElement (By element){
        waiTimeToBeClicable(element);
        driver.findElement(element).click();
    }
    public void selectDropDown (By element, String option){
        Select oprions = new Select(driver.findElement(element));
        oprions.selectByVisibleText(option);
    }
}
