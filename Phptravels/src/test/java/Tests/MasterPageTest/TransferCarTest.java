package Tests.MasterPageTest;
import Helper.AssertionHelper;
import Tests.TestBase.MainPageTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.MasterPage.TransferCarsBase;
public class TransferCarTest extends MainPageTestBase {
    AssertionHelper assertion;
    TransferCarsBase transferCars;
    @BeforeMethod
    public void init(){
        assertion = new AssertionHelper();
        transferCars = new TransferCarsBase(MainDriver);
    }
    @Test
    public void SearchCarsWithoutEnterDataInfo () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.ClickSearchButton();
        assertion.assertConfirmationPopupText(MainDriver,"Select From Airport");
    }
    @Test
    public void SearchCarsWithEnterFromAndToLocation () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.FromAirportDropDownList("Usa");
        transferCars.ToAirportDropDownList("Usa");
        transferCars.ClickSearchButton();
        Thread.sleep(7000);
        assertion.assertElementIsVisible(MainDriver,By.xpath("//*[@class=\"h6 m-0 header_options text-dark\" and .//*[@class=\"text-muted\" and normalize-space(text())='1']]"));
    }
    @Test
    public void SearchCarsWithSelectNumOfTravelers () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.ClickNumOfTravelersButton();
        transferCars.FillNumOfAdults("6");
        transferCars.FillNumOfChild("2");
        transferCars.ClickSearchButton();
        assertion.assertConfirmationPopupText(MainDriver,"Select From Airport");
    }
    @Test
    public void SearchCarsByFillPickUpToDestinationAndNumOfAdultsAndChild () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.FromAirportDropDownList("Usa");
        transferCars.ToAirportDropDownList("Usa");
        transferCars.ClickNumOfTravelersButton();
        transferCars.FillNumOfAdults("6");
        transferCars.FillNumOfChild("2");
        transferCars.ClickSearchButton();
        Thread.sleep(2000);
        assertion.assertElementIsVisible(MainDriver,By.xpath("//*[@class=\"dropdown-toggle dropdown-btn travellers waves-effect\"]"));
    }
}