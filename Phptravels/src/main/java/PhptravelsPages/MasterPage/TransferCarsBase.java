package PhptravelsPages.MasterPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TransferCarsBase extends PageBase {
    By CarsButton = By.xpath("(//*[@class=\"nav-link w-100 waves-effect\"])[3]");
    By FromAirport = By.xpath("//*[@class=\"mt-1 show active\"]");
    By SelectFromAirport = By.xpath("(//*[@class=\"d-flex align-items-center p-2 to--insert overflow-hidden\"])[1]");
    By ToLocation = By.xpath("(//*[@class=\"select2-selection__rendered\"])[4]");
    By SearchToLocation = By.xpath("//*[@class=\"select2-search__field\"]");
    By SelectToLocation = By.xpath("//*[@class=\"select2-results__option select2-results__option--highlighted\"]");
    By PickUpDateList = By.xpath("(//*[@class=\"dp form-control\"])[2]");
    By PNextMonthButton = By.xpath("(//*[@class=\"next\"])[16]");
    By PickUpDay = By.xpath("(//*[@class=\"day \"][text()=2])[4]");
    By PickUpTime = By.xpath("(//*[@class=\"form-select h-100\"])[1]");
    By DropDateList = By.xpath("(//*[@class=\"dp form-control\"])[3]");
    By BNextMonthButton = By.xpath("(//*[@class=\"next\"])[19]");
    By DropDay = By.xpath("(//*[@class=\"day \"][text()=8])[7]");
    By DropOfTime = By.xpath("(//*[@class=\"form-select h-100\"])[2]");
    By SearshButton = By.xpath("(//*[@class=\"search_button w-100 btn btn-primary btn-m rounded-sm font-700 text-uppercase btn-full h-100 waves-effect\"])[4]");
    By NumOfTravelersButton = By.xpath("(//*[@class=\"dropdown-toggle dropdown-btn travellers waves-effect\"])[3]");
    By NumOfAdults = By.xpath("(//*[@class=\"qtyInput_cars\"])[1]");
    By NumOfChilds =By.xpath("(//*[@class=\"qtyInput_cars\"])[2]");
    public TransferCarsBase(WebDriver driver) {
        super(driver);
    }
    public void clickCarsButton (){
        clickOnElement(CarsButton);
    }
    public void FromAirport(){
        clickOnElement(FromAirport);
    }
    public void SelectFromAirport(){
        clickOnElement(SelectFromAirport);
    }
    public void ToLocation(String Value){
        clickOnElement(ToLocation);
        sendKeys(SearchToLocation, Value);
    }
    public void selectOnToLocation (){
        clickOnElement(SelectToLocation);
    }
    public void OpenPickUpCale(){
        clickOnElement(PickUpDateList);
    }
    public void ClickPickNext (){
        clickOnElement(PNextMonthButton);
    }
    public void SelectPickDay(){
        clickOnElement(PickUpDay);
    }
    public void FillPickUpTime(String Time){
        sendKeys(PickUpTime,Time);
    }
    public void openDropCale(){
        clickOnElement(DropDateList);
    }
    public void ClickDropNext (){
        clickOnElement(BNextMonthButton);
    }
    public void SelectDropDay(){
        clickOnElement(DropDay);
    }
    public void FillDropOfTime(String Time){
        sendKeys(DropOfTime,Time);
    }
    public void ClickNumOfTravelersButton (){
        clickOnElement(NumOfTravelersButton);
    }
    public void FillNumOfAdults(String Adults){
        sendKeys(NumOfAdults,Adults);
    }
    public void FillNumOfChilds(String Childs){
        sendKeys(NumOfChilds,Childs);
    }
    public void ClickSearshButton (){
        clickOnElement(SearshButton);
    }

}
