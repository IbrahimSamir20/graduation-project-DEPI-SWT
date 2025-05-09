package PhptravelsPages.AdminPage.Bookings;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BookingsBase extends PageBase {
    By BookingButton = By.xpath("(//*[@class=\"mb-0\"])[1]");
    By BookingId = By.xpath("//*[@class=\"form-control booking_id\"]");
    By ModuleType = By.xpath("//*[@class=\"form-select module\"]");
    By BookingStatus =By.xpath("//*[@class=\"form-select booking_status\"]");
    By PaymentStatus = By.xpath("//*[@class=\"form-select payment_status\"]");
    By SearchButton = By.xpath("//*[@class=\"btn btn-primary w-100 h-100 rounded-4\"]");
    By BackButton = By.xpath("//*[@class=\"loading_effect btn btn-warning\"]");
    public BookingsBase(WebDriver driver) {
        super(driver);
    }
    public void joinBookingPage (){
        clickOnElement(BookingButton);
    }
    public void setBookingId (String bookingId){
        sendKeys(BookingId, bookingId);
    }
    public void selectModuleType (String option){
        selectDropDown(ModuleType, option);
    }
    public void setBookingStatus (String option){
        selectDropDown(BookingStatus, option);
    }
    public void setPaymentStatus (String option){
        selectDropDown(PaymentStatus,option);
    }
    public void clickSearchButton(){
        clickOnElement(SearchButton);
    }
    public void clickBackButton (){
        clickOnElement(BackButton);
    }
}
