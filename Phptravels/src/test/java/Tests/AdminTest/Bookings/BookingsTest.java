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
        Thread.sleep(2000);
        booking.setBookingId("20250420102834");
        Thread.sleep(2000);
        booking.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void SearchModuleType() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        Thread.sleep(2000);
        booking.selectModuleType("Hotels");
        Thread.sleep(2000);
        booking.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void SearchBookingStatus() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        Thread.sleep(2000);
        booking.setBookingStatus("Pending");
        Thread.sleep(2000);
        booking.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void SearchPaymentStatus() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        Thread.sleep(2000);
        booking.setPaymentStatus("Unpaid");
        Thread.sleep(2000);
        booking.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void SearchBookingsByDate() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        Thread.sleep(2000);
        booking.setbookingDate();
        Thread.sleep(2000);
        booking.clickSearchButton();
        Thread.sleep(5000);
    }
    @Test
    public void VerifyBackFunctionality() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        Thread.sleep(2000);
        booking.clickBackButton();
        Thread.sleep(5000);
    }
}
