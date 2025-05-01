package PhptravelsPages.AdminPage.Settings.UserRoles;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class AddOrEditPage extends PageBase {
    By RoleName = By.xpath("//*[@class=\"form-control\"]");
    By SelectAllButton = By.xpath("(//*[@class=\"form-check-input\"])[1]");
    By Permission = By.xpath("(//*[@class=\"form-check-input\"])[5]");
    By SubmitButton = By.xpath("//*[@class=\"btn btn-primary mdc-ripple-upgraded\"]");
    public AddOrEditPage(WebDriver driver) {
        super(driver);
    }
    public void roleName (String name){
        sendKeys(RoleName,name);
    }
    public void selectAll (){
        clickOnElement(SelectAllButton);
    }
    public void permission (){
        clickOnElement(Permission);
    }
    public void submit (){
        clickOnElement(SubmitButton);
    }
}
