package PhptravelsPages.AdminPage.Markups;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarkupsUserForm extends PageBase {
    By statusBtn=By.xpath("(//*[@class=\"select2-selection__arrow\"])[1]");
    By statusField = By.xpath("(//*[@class=\"select2-search__field\"])[1]");
    public By userMarkupFiled = By.xpath("//input[@class=\"xcrud-input form-control\"]");
    By userIdFiled = By.xpath("//input[@class=\"select2-search__field\"]");
    By userIdBtn = By.xpath("(//span[@class=\"select2-selection__arrow\"])[2]");
    By typeFiled = By.xpath("//input[@class=\"select2-search__field\"]");
    By typeBtn = By.xpath("(//*[@class=\"select2-selection__arrow\"])[3]");
    By saveButton = By.xpath("//a[@data-task=\"save\"]");


    public MarkupsUserForm(WebDriver driver) {
        super(driver);
    }


    public void fillStatusDropList(String value) throws InterruptedException {
        sendKeysToDropList(statusBtn,statusField,value);
    }
    public void fillUserMarkupFiled(String value){
        sendKeys(userMarkupFiled,value);
    }

    public void fillUserIdDropList(String value) throws InterruptedException {
        sendKeysToDropList(userIdBtn, userIdFiled, value);
    }
    public void fillTypeList(String value) throws InterruptedException{
        sendKeysToDropList(typeBtn,typeFiled,value);
    }

    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
}
