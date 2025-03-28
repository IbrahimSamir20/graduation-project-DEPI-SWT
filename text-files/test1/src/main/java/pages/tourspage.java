package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tourspage extends PageBase {
    public String starratingonleftbar="Star Rating";
    By starratingelemnt=By.xpath("//a[@class=\"btn collapsed d-flex justify-content-between align-items-center p-0 text-black waves-effect\"]");

    public tourspage(WebDriver driver) {
        super(driver);
    }

    public String starelemntratinggettext()
    {
        return driver.findElement(starratingelemnt).getText();
    }




}
