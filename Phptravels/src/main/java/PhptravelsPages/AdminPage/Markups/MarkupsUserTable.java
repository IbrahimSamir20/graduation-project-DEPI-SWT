package PhptravelsPages.AdminPage.Markups;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarkupsUserTable extends PageBase {
    By checkMarkBtn = By.xpath("(//input[@class=\"checkboxcls form-check-input\"])[1]");
    By checkboxStatus = By.xpath("(//input[@class=\"updated_status form-check-input\"])[1]");
    By editBtn = By.xpath("(//a[@class=\"xcrud-action xcrud-button xcrud-orange\"])[1]");
    By deleteBtn = By.xpath("(//a[@class=\"xcrud-action xcrud-button xcrud-red\"])[1]");


    public MarkupsUserTable(WebDriver driver) {
        super(driver);
    }



    public void clickOnCheckMarkBtn(){
        clickOnElement(checkMarkBtn);
    }

    public void clickOnCheckboxStatus(){
        clickOnElement(checkboxStatus);
    }

    public void clickOnEditBtn(){
        clickOnElement(editBtn);
    }

    public void clickOnDeleteBtn(){
        clickOnElement(deleteBtn);
    }


}
