package PhptravelsPages.AgentPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentSignUp extends PageBase {
    By firstName = By.xpath("(//*[@class=\"form-control bg-white\"])[1]");
    By lastName = By.xpath("(//*[@class=\"form-control bg-white\"])[2]");
    By countryDropdown = By.xpath("//*[@class=\"filter-option\"]");
    By phone = By.xpath("(//*[@class=\"form-control bg-white\"])[3]");
    By city = By.xpath("(//*[@class=\"form-control bg-white\"])[4]");
    By address = By.xpath("(//*[@class=\"form-control bg-white\"])[5]");
    By agencyName = By.xpath("(//*[@class=\"form-control bg-white\"])[6]");
    By license = By.xpath("(//*[@class=\"form-control bg-white\"])[7]");
    By email = By.xpath("(//*[@class=\"form-control bg-white\"])[8]");
    By password = By.xpath("(//*[@class=\"form-control bg-white\"])[9]");
    By choosefile = By.xpath("//*[@class=\"btn btn-light\"]");
    By signUpButton= By.xpath("//*[@class=\"signup_button\"]");
    public AgentSignUp (WebDriver driver) {
        super(driver);
    }
    public void fillfirstname (String fname) {
        sendKeys(firstName, fname);
    }

    public void fillLastName(String lname) {
        sendKeys(lastName, lname);
    }
    public void selectCountry(String countryName) {
        selectDropDown(countryDropdown, countryName);
    }
    public void fillphone (String number) {
        sendKeys(phone, number);;
    }
    public void fillCity(String cityName) {
        sendKeys(city, cityName);
    }

    public void fillAddress(String addressText) {
        sendKeys(address, addressText);
    }

    public void fillAgencyName(String agency) {
        sendKeys(agencyName, agency);
    }

    public void fillLicense(String licenseText) {
        sendKeys(license, licenseText);
    }

    public void fillEmail(String emailText) {
        sendKeys(email, emailText);
    }

    public void fillPassword(String passText) {
        sendKeys(password, passText);
    }

    public void uploadLogo(String imagePath) {
        sendKeys(choosefile, imagePath);
    }

    public void clickSignUpButton() {
        clickOnElement(signUpButton); }

}
