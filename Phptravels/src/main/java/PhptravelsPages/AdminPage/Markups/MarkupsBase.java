package PhptravelsPages.AdminPage.Markups;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarkupsBase extends PageBase {
    By markupsBtn = By.xpath("(//*[@class=\"mb-0\"])[4]");
    By userBtn = By.xpath("//a[@href=\"./markups.php?module=users\"]");
    By flightsBtn = By.xpath("//a[href=\"./markups?module=flights\"]");
    By hotelsBtn = By.xpath("//a[href=\"./markups?module=hotels\"]");
    By toursBtn = By.xpath("//a[href=\"./markups?module=tours\"]");
    By carsBtn = By.xpath("//a[href=\"./markups?module=cars\"]");


    public MarkupsBase(WebDriver driver) {
        super(driver);
    }

    public void clickOnMarkupsBtn(){
        clickOnElement(markupsBtn);
    }

    public void clickOnUserBtn(){
        clickOnElement(userBtn);
    }

    public void clickOnFlightsBtn(){
        clickOnElement(flightsBtn);
    }
    public void clickOnHotelsBtn(){
        clickOnElement(hotelsBtn);
    }
    public void clickOnToursBtn(){
        clickOnElement(toursBtn);
    }
    public void clickOnCarsBtn(){
        clickOnElement(carsBtn);
    }
}
