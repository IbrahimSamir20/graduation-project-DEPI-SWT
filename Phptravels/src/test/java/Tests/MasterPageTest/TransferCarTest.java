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
        Thread.sleep(2000);
        transferCars.ClickSearshButton();
        Thread.sleep(2000);
    }
    @Test
    public void SearchCarsWithEnterFromandtolocation () throws InterruptedException {
        Thread.sleep(2000);
        transferCars.clickCarsButton();
        Thread.sleep(2000);
        //transferCars.FillFromAirport("Dubai");
        transferCars.FromAirport();
        Thread.sleep(2000);
        transferCars.SelectFromAirport();
        Thread.sleep(2000);
        transferCars.ToLocation("London");
        Thread.sleep(2000);
        transferCars.selectOnToLocation();
        Thread.sleep(2000);
        transferCars.ClickSearshButton();
        Thread.sleep(2000);
    }
    @Test
    public void SearchCarsWithdSelectFromandToDate () throws InterruptedException {
        Thread.sleep(2000);
        transferCars.clickCarsButton();
        Thread.sleep(2000);
        transferCars.OpenPickUpCale();
        Thread.sleep(2000);
        transferCars.ClickPickNext();
        Thread.sleep(2000);
        transferCars.SelectPickDay();
        Thread.sleep(2000);
        transferCars.openDropCale();
        Thread.sleep(2000);
        transferCars.ClickDropNext();
        Thread.sleep(2000);
        transferCars.SelectDropDay();
    }
    @Test
    public void SearchCarsWithSelectFromandToTime() throws InterruptedException {
        Thread.sleep(2000);
        transferCars.clickCarsButton();
        Thread.sleep(2000);
        transferCars.FillPickUpTime("10:30");
        Thread.sleep(200);
        transferCars.FillDropOfTime("11:30");
        Thread.sleep(2000);
   }
    @Test
    public void SearchCarsWithSelectNumofTravelers () throws InterruptedException {
        Thread.sleep(2000);
        transferCars.clickCarsButton();
        Thread.sleep(2000);
        transferCars.ClickNumOfTravelersButton();
        Thread.sleep(2000);
        transferCars.FillNumOfAdults("6");
        Thread.sleep(2000);
        transferCars.FillNumOfChilds("2");
        Thread.sleep(2000);
    }
}