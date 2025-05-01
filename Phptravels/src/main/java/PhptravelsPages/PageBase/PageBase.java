package PhptravelsPages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {
    WebDriver driver;
    public static long Wait =200;
    public PageBase(WebDriver driver) {
        this.driver = driver;
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
        driver.findElement(element).clear();
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
    public void sendKeysToDropList (By element1,By element2, String keys) {
        waiTimeToBeClicable(element1);
        driver.findElement(element1).click();
        waiTimeToBeVisible(element2);
        driver.findElement(element2).sendKeys(keys + Keys.ENTER);
    }
}
