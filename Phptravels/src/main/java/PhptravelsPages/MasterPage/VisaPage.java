package PhptravelsPages.MasterPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class VisaPage extends PageBase {
    By VisaButton = By.xpath("(//*[@class=\"nav-link w-100 waves-effect\"])[4]");
    By SelectFromCountry = By.xpath("(//*[@class=\"select2-selection select2-selection--single\"])[5]");
    By SelectToCountry = By.xpath("(//*[@class=\"select2-selection select2-selection--single\"])[6]");
    By DropDownSearchField = By.xpath("//*[@class=\"select2-search__field\"]");
    By SearchButton = By.xpath("(//*[@class=\"search_button w-100 btn btn-primary btn-m rounded-sm font-700 text-uppercase btn-full h-100 waves-effect\"])[5]");
    public VisaPage(WebDriver driver) {
        super(driver);
    }
    public void clickVisaButton() {
        clickOnElement(VisaButton);
    }
    public void selectFromCountry(String country) throws InterruptedException {
        sendKeysToDropList(SelectFromCountry, DropDownSearchField, country);
    }
    public void selectToCountry(String country) throws InterruptedException {
        sendKeysToDropList(SelectToCountry, DropDownSearchField, country);
    }
    public void clickSearchButton() {
        clickOnElement(SearchButton);
    }
}

