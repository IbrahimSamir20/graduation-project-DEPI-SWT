package PhptravelsPages.MasterPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TransferCarsBase extends PageBase {
    By CarsButton = By.xpath("(//*[@class=\"nav-link w-100 waves-effect\"])[3]");
    By SelectFromAirport = By.xpath("//*[@class=\"mt-1 show active\"]");
    By SelectToLocation = By.xpath("(//*[@class=\"select2-selection__rendered\"])[4]");
    By TextField = By.xpath("//*[@class=\"select2-search__field\"]");
    public By SearchButton = By.xpath("(//*[@class=\"search_button w-100 btn btn-primary btn-m rounded-sm font-700 text-uppercase btn-full h-100 waves-effect\"])[4]");
    By NumOfTravelersButton = By.xpath("(//*[@class=\"dropdown-toggle dropdown-btn travellers waves-effect\"])[3]");
    By NumOfAdults = By.xpath("(//*[@class=\"qtyInput_cars\"])[1]");
    By NumOfChild =By.xpath("(//*[@class=\"qtyInput_cars\"])[2]");
    public TransferCarsBase(WebDriver driver) {
        super(driver);
    }
    public void clickCarsButton (){
        clickOnElement(CarsButton);
    }
    public void FromAirportDropDownList(String option) throws InterruptedException {
        sendKeysToDropList(SelectFromAirport,TextField,option);
    }
    public void ToAirportDropDownList(String option) throws InterruptedException {
        sendKeysToDropList(SelectToLocation,TextField,option);
    }
    public void ClickNumOfTravelersButton (){
        clickOnElement(NumOfTravelersButton);
    }
    public void FillNumOfAdults(String Adults){
        sendKeys(NumOfAdults,Adults);
    }
    public void FillNumOfChild(String Child){
        sendKeys(NumOfChild,Child);
    }
    public void ClickSearchButton (){
        clickOnElement(SearchButton);
    }

}
