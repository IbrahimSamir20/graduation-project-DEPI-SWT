package PhptravelsPages.AdminPage.AdminLoginPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AdminLoginPage extends PageBase {
    By Email=By.xpath("(//*[@class=\"form-control\"])[1]");
    By Passward=By.xpath("(//*[@class=\"form-control\"])[2]");
    By LoginButton=By.xpath("//*[@class=\"login_button mt-3 btn btn-primary w-100 btn-lg\"]");
    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }
    public void fillEmail(String email){
        sendKeys(Email,email);
    }
    public void fillPassword(String pass){
        sendKeys(Passward,pass);
    }
    public void clickLoginButton(){
        clickOnElement(LoginButton);
    }
}
