package Tests.MasterPageTest;
import PhptravelsPages.MasterPage.FlightTabPage;
import PhptravelsPages.MasterPage.ResultPage;
import Tests.TestBase.MainPageTestBase;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FlightTabTest extends MainPageTestBase{
    FlightTabPage flightTabPage;
    ResultPage resultPage;
    @BeforeMethod
    public void init(){
        flightTabPage = new FlightTabPage(driver);
        resultPage = new ResultPage(driver);
    }
    public void flyingFromAndDestinationTo() throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.FillFlyingFrom("JED");
        Thread.sleep(2000);
        flightTabPage.FillDestinationTo("DXB");
        Thread.sleep(2000);
        
    }
    
    @Test
    public void searchWitoutEnterAnyDate () throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        flightTabPage.alertTest();
        Thread.sleep(2000);
        
    }
    @Test
    public void enterOnlyFlyingFrom () throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.FillFlyingFrom("LHR");
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
        Thread.sleep(2000);
    }
    @Test
    public void enterOnlyDestinationTo() throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.FillDestinationTo("DXB");
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void enterFlyingFromAndDestinationTo() throws InterruptedException {
        flyingFromAndDestinationTo();
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void choseReturnWay() throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.selectFlightWay("Return");
        Thread.sleep(2000);
        try {
            if (flightTabPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void searchReturnWay() throws InterruptedException {
        Thread.sleep(2000);
        choseReturnWay(); 
        Thread.sleep(2000);
        flightTabPage.FillDepartDate("02-05-2025");
        Thread.sleep(2000);
        flyingFromAndDestinationTo();
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void searchNumberOfTravellers() throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.clickOnTravellersButton();
        Thread.sleep(2000);
        flightTabPage.clickOnTravellersAdultsIncreaseButton();
        flightTabPage.clickOnTravellersAdultsIncreaseButton();
        flightTabPage.clickOnTravellersAdultsIncreaseButton();
        flightTabPage.clickOnTravellersChildIncreaseButton();
        flightTabPage.clickOnTravellersInfantsIncreaseButton();
        Thread.sleep(2000);
        enterFlyingFromAndDestinationTo();
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000); 
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void searchNegativeNumberOfTravellers() throws InterruptedException {
         Thread.sleep(2000);
        flightTabPage.clickOnTravellersButton();
        Thread.sleep(2000);
        flightTabPage.clickOnTravellersAdultsDecreaseButton();
        flightTabPage.clickOnTravellersChildDecreaseButton();
        flightTabPage.clickOnTravellersInfantsDecreaseButton();
        Thread.sleep(2000); 
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void searchFlightType() throws InterruptedException {
        Thread.sleep(2000);
        flightTabPage.selectFlightType("Business");
        Thread.sleep(2000);
        flyingFromAndDestinationTo();
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }
    @Test
    public void TestSwapButton() throws InterruptedException {
        Thread.sleep(2000);
        flyingFromAndDestinationTo();
        Thread.sleep(2000);
        flightTabPage.clickSwapButton();
        Thread.sleep(2000);
        flightTabPage.clickSearchButton();
        Thread.sleep(2000);
        try {
            if (resultPage.isAppeared()) {
                System.out.println("Field is visible.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Field does not exist.");
        }
    }

    
}
