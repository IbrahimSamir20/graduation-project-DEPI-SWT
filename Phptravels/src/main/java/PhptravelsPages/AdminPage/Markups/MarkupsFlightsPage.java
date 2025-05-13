package PhptravelsPages.AdminPage.Markups;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarkupsFlightsPage extends PageBase {
    public MarkupsFlightsPage(WebDriver driver) {
        super(driver);
    }
    By checkBox = By.xpath("//input[@class=\"form-check-input \"]");
    By addButton = By.xpath("//*[@data-task=\"create\"]");

    
}
