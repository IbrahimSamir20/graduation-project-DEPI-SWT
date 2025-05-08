package Tests.AdminTest.Bookings;
import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Bookings.BookingsBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BookingsTest extends AdminTestBase{
    AdminLoginHelper login;
    BookingsBase booking ;
    @BeforeMethod
    public void init() throws InterruptedException {
        login = new AdminLoginHelper();
        booking = new BookingsBase(AdminDriver);

    }
    @Test
    public void SearchBookingsByID() throws InterruptedException {
        Thread.sleep(2000);
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setBookingId("20250420102834");
        booking.clickSearchButton();
    }
    @Test
    public void SearchModuleType() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.selectModuleType("Hotels");
        booking.clickSearchButton();
    }
    @Test
    public void SearchBookingStatus() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setBookingStatus("Pending");
        booking.clickSearchButton();
    }
    @Test
    public void SearchPaymentStatus() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setPaymentStatus("Unpaid");
        booking.clickSearchButton();
    }
    @Test
    public void SearchBookingsByDate() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setbookingDate();
        booking.clickSearchButton();
    }
    @Test
    public void VerifyBackFunctionality() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.clickBackButton();
    }
}
