package Tests.MasterPageTest;
import Tests.TestBase.MainPageTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.MasterPage.TransferCarsBase;

import static org.testng.AssertJUnit.assertEquals;
public class TransferCarTest extends MainPageTestBase {
    TransferCarsBase transferCars;
    @BeforeMethod
    public void init(){
        transferCars = new TransferCarsBase(driver);
    }
    @Test
    public void SearchCarsWithoutEnterDataInfo () throws InterruptedException {
        Thread.sleep(2000);
        transferCars.clickCarsButton();
        transferCars.ClickSearshButton();
    }
    @Test
    public void SearchCarsWithEnterFromAndToLocation () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.FromAirport();
        transferCars.SelectFromAirport();
        transferCars.ToLocation("London");
        transferCars.selectOnToLocation();
        transferCars.ClickSearshButton();
    }
    @Test
    public void SearchCarsWithSelectFromAndToDate () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.OpenPickUpCale();
        transferCars.ClickPickNext();
        transferCars.SelectPickDay();
        transferCars.openDropCale();
        transferCars.ClickDropNext();
        transferCars.SelectDropDay();
    }
    @Test
    public void SearchCarsWithSelectFromAndToTime() throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.FillPickUpTime("10:30");
        transferCars.FillDropOfTime("11:30");
   }
    @Test
    public void SearchCarsWithSelectNumOfTravelers () throws InterruptedException {
        transferCars.clickCarsButton();
        transferCars.ClickNumOfTravelersButton();
        transferCars.FillNumOfAdults("6");
        transferCars.FillNumOfChilds("2");
    }
}