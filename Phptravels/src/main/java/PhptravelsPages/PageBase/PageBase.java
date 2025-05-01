package PhptravelsPages.PageBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    public WebDriver driver;
    public static Duration Wait= Duration.ofSeconds(200);
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
/*******************************************/
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
/**************************************************/
}
