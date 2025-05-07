package PhptravelsPages.MasterPage;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FlightTabPage extends PageBase{
     By typeFly=By.id("flight_type");
    By flightWay=By.xpath("//*[@class=\"flight_way form-select form-select-sm px-3 rounded-2 border\"]");
    By flyingFrom=By.xpath("//*[@class=\"form-control ct ff\"]");
    By destinationTo=By.xpath("//*[@class=\"form-control ct px-md-3 ft\"]");
    By swapButton=By.id("swap");
    By departDate=By.xpath("//*[@class=\"depart form-control\"]");
    By returnDate=By.id("return_date");
    By travellersNumber=By.xpath("class=\"dropdown-toggle dropdown-btn travellers waves-effect\"");
    By travellersAdultsDecreaseNumber=By.xpath("(//*[@class=\"qtyDec\"])[1]");
    By travellersAdultsIncreaseNumber=By.xpath("(//*[@class=\"qtyInc\"])[1]");
    By travellersChildDecreaseNumber=By.xpath("(//*[@class=\"qtyDec\"])[2]");
    By travellersChildIncreaseNumber=By.xpath("(//*[@class=\"qtyInc\"])[2]");
    By travellersInfantsDecreaseNumber=By.xpath("(//*[@class=\"qtyDec\"])[3]");
    By travellersInfantsIncreaseNumber=By.xpath("(//*[@class=\"qtyInc\"])[3]");
    By searchButton=By.xpath("flights-search");
    
    public FlightTabPage(WebDriver driver) {
        super(driver);
    }
    public void FillFlyingFrom(String flyingFrom){
        sendKeys(this.flyingFrom,flyingFrom);
    }
    public void FillDestinationTo(String destinationTo){
        sendKeys(this.destinationTo,destinationTo);
    }
    public void FillDepartDate(String departDate){
        sendKeys(this.departDate,departDate);
    }
    /**public void FillReturnDate(String returnDate){
        sendKeys(this.returnDate,returnDate);
    }*/
    public void clickOnTravellersAdultsDecreaseButton (){
        clickOnElement(travellersAdultsDecreaseNumber);
    }
    public void clickOnTravellersButton (){
        clickOnElement(travellersNumber);
    }
    public void clickOnTravellersAdultsIncreaseButton (){
        clickOnElement(travellersAdultsIncreaseNumber);
    }
    public void clickOnTravellersChildDecreaseButton (){
        clickOnElement(travellersChildDecreaseNumber);
    }
    public void clickOnTravellersChildIncreaseButton (){
        clickOnElement(travellersChildIncreaseNumber);
    }
    public void clickOnTravellersInfantsDecreaseButton (){
        clickOnElement(travellersInfantsDecreaseNumber);
    }
    public void clickOnTravellersInfantsIncreaseButton (){
        clickOnElement(travellersInfantsIncreaseNumber);
    }
    
    public void clickSearchButton (){
        clickOnElement(searchButton);
    }
    public void clickSwapButton (){
        clickOnElement(swapButton);
    }
    
    public void selectFlightType(String option){
        selectDropDown(typeFly,option);
    }
    public void selectFlightWay(String option){
        selectDropDown(flightWay,option);
    }
    public boolean isAppeared(){
        if(isAPPeared(returnDate)){
            return true;
        }
        return false;
    }
    public void alertTest(){
//        WebDriverWait wait = new WebDriverWait(driver,5);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (alertText.equals("Flying City and Destination City Can't be same")) {
            System.out.println("Test Passed: Alert message is correct.");
        } else {
            System.out.println("Test Failed: Alert message is incorrect.");
        }
        alert.accept();

    }

}
