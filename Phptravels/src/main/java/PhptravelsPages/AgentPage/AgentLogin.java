package PhptravelsPages.AgentPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AgentLogin extends PageBase {
    By Email=By.xpath("(//*[@class=\"form-control\"])[1]");
    By Password=By.xpath("(//*[@class=\"form-control\"])[2]");
    By LoginButton=By.xpath("//*[@class=\"btn btn-primary w-100 waves-effect\"]");
    By SignupButton=By.xpath("//*[@class=\"d-flex align-items-center justify-content-center btn btn-outline-primary waves-effect\"]");

    public AgentLogin(WebDriver driver) {
        super(driver);
    }
    public void fillEmail(String email){
        sendKeys(Email,email);
    }
    public void fillPassword(String pass){
        sendKeys(Password,pass);
    }
    public void ClickLoginButton(){
        clickOnElement(LoginButton);
    }
    public void ClickSignupButton(){
        clickOnElement(SignupButton);}
}