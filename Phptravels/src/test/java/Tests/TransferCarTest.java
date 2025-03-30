package Tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PhptravelsPages.DashboardPage;
import PhptravelsPages.TransferCars;

import static org.testng.AssertJUnit.assertEquals;

public class TransferCarTest extends TestBase {
    TransferCars transferCars;
    DashboardPage dashboardPage;
    @BeforeMethod
    public void init(){
        transferCars = new TransferCars(driver);
        dashboardPage = new DashboardPage(driver);
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
    public void SearchCarsWithEnterDataInfo () throws InterruptedException {
        Thread.sleep(2000);
        transferCars.clickCarsButton();
        Thread.sleep(2000);
        //transferCars.FillFromAirport("Dubai");
        transferCars.FromAirport();
        Thread.sleep(2000);
        transferCars.SelectFromAirport();
        Thread.sleep(2000);
        transferCars.ClickOnToLocation("London");
        Thread.sleep(2000);
        transferCars.selectOnToLocation();
        Thread.sleep(2000);
        transferCars.ClickSearshButton();
        Thread.sleep(2000);
    }
    @Test
    public void SearchCarsWithEnterDataInfoAndSelectDate (){

    }
}
