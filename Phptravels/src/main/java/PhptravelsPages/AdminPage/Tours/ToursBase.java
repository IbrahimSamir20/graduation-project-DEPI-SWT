package PhptravelsPages.AdminPage.Tours;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToursBase extends PageBase {
    WebDriver driver;
    public ToursBase(WebDriver driver){
        super(driver);

    }

    By clickOnTour= By.xpath("//*[@class=\"text-start btn btn-outline-light btn-toggle w-100 gap-3 collapsed\"]");
    By TourSetting=By.xpath("//*[@class=\"loadeffect link-light  active\"]");
    By addButton=By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    By tourName=By.xpath("//*[@class=\"xcrud-input form-control\"]");
    By saveButton=By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    By returnButton=By.xpath("//*[@class=\"xcrud-button xcrud-orange xcrud-action\"]");
    By backButton=By.xpath("//*[@class=\"loading_effect btn btn-warning\"]");

    public void clickOnTourButton(){
        clickOnElement(clickOnTour);

    }

    public void clickOnTourSetting(){
        clickOnElement(TourSetting);
    }

    public void clickOnAddButton(){
        clickOnElement(addButton);
    }
    public void fillTourName(String value)
    {
        sendKeys(tourName,value);
    }

    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }

    public void clickOnReturnButton(){
        clickOnElement(returnButton);
    }

    public void clickOnBackButton(){
        clickOnElement(backButton);
    }

}
