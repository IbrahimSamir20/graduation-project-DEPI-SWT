package Tests.AdminTest.Hotels;
import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Hotels.HotelsBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelsTest extends AdminTestBase {
    HotelsBase hotelsuggest;
    AdminLoginHelper login;
    @BeforeMethod
    public void init(){
        hotelsuggest=new HotelsBase(AdminDriver);
        login=new AdminLoginHelper();

    }


    @Test
    public void suggestHotelwithvalidData() throws InterruptedException {
        login.adminLogin();
        hotelsuggest.clickOnHotels();
        hotelsuggest.clickOnHotelSuggest();
        hotelsuggest.clickOnAddButton();
        hotelsuggest.clickONStatus();
        hotelsuggest.clickOnEnabled();
        hotelsuggest.clickOnCity();
        hotelsuggest.clickOnCityName();
        hotelsuggest.fillOrder("4");
        hotelsuggest.clickOnSaveButton();
    }
@Test
    public void searchForElementWithValidValue() throws InterruptedException {
        login.adminLogin();
        hotelsuggest.clickOnHotels();
        hotelsuggest.clickOnHotelSuggest();
        hotelsuggest.clickOnSearchButton();
        hotelsuggest.fillSearchElement("dubai");
        hotelsuggest.clickOnGoButton();
}

@Test
public void clickOnResetButton() throws InterruptedException {
    login.adminLogin();
    hotelsuggest.clickOnHotels();
    hotelsuggest.clickOnHotelSuggest();
    hotelsuggest.clickOnSearchButton();
    hotelsuggest.fillSearchElement("dubai");
    hotelsuggest.clickOnGoButton();
    hotelsuggest.clickOnReserButton();
}
}
