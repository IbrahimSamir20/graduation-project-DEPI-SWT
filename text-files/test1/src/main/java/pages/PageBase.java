package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public static Duration WAIT= Duration.ofSeconds(100);
    public PageBase(WebDriver driver)
    {
        this.driver=driver;
    }


    public void sendkey(By elemnt , String fill)
    {
        waittimetibevisible(elemnt);
        driver.findElement(elemnt).sendKeys(fill);
    }
    public void clickkey(By elemnt)
    {
        waittimetibevisible(elemnt);
        waittimeTOBECLICKABLE(elemnt);
        driver.findElement(elemnt).click();
    }
    public String getcurrenturl()
    {
        return driver.getCurrentUrl().toString();
    }
    public void waittimeTOBECLICKABLE(By elemnt)
    {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(elemnt));
    }
    public void waittimetibevisible(By elemnt1)
    {
        WebDriverWait wait=new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemnt1));
    }
    public void scrolldown()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1070)");
    }
    public void selectfromlist(By elemnt,String option)
    {
        Select s=new Select(driver.findElement(elemnt));
        s.selectByVisibleText(option);
    }


}
