package PhptravelsPages.CustomerPage;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerSignUp extends PageBase {

    By firstName = By.xpath("(//*[@class=\"form-control\"])[1]");
    By lastName = By.xpath("(//*[@class=\"form-control\"])[2]");
    By countryDropdown = By.xpath("//*[@class=\"filter-option-inner-inner\"]");
    By phone = By.xpath("(//*[@class=\"form-control\"])[4]");
    By email = By.xpath("(//*[@class=\"form-control\"])[5]");
    By password = By.xpath("(//*[@class=\"form-control\"])[6]");
    By signUpButton = By.xpath("//*[@class=\"signup_button\"]");

        public CustomerSignUp (WebDriver driver) {
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

        public void fillEmail(String mail) {
            sendKeys(email, mail);
        }

        public void fillPassword(String pass) {
            sendKeys(password, pass);
        }

        public void clickSignUpButton() {
            clickOnElement(signUpButton);
        }
    }

