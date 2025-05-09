package PhptravelsPages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {
    public WebDriver driver;
    public static long Wait =200;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    public void waiTimeToBeClickable(By element){
        WebDriverWait wait = new WebDriverWait(driver,Wait);
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
        waiTimeToBeClickable(element);
        driver.findElement(element).click();
    }
    public void selectDropDown (By element, String option){
        Select options = new Select(driver.findElement(element));
        options.selectByVisibleText(option);
    }
    public String getText(By element){
        waiTimeToBeVisible(element);
        return driver.findElement(element).getText();
    }
    public boolean isAPPeared (By element){
        if(driver.findElement(element).isDisplayed()){
            return true;
        }
        return false;
    }
    public void dragAndDropElement(By sourceLocator, By targetLocator) {
        waiTimeToBeVisible(sourceLocator);
        waiTimeToBeVisible(targetLocator);
        WebElement source = driver.findElement(sourceLocator);
        WebElement target = driver.findElement(targetLocator);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
    }
    public void sendKeysToDropList (By element1,By element2, String keys) throws InterruptedException {
        waiTimeToBeClickable(element1);
        driver.findElement(element1).click();
        waiTimeToBeVisible(element2);
        driver.findElement(element2).sendKeys(keys);
        Thread.sleep(200);
        driver.findElement(element2).sendKeys(Keys.ENTER);
    }
}
