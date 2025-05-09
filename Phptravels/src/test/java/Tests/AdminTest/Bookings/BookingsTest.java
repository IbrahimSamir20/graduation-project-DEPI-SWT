package Tests.AdminTest.Bookings;
import Helper.AdminLoginHelper;
import Helper.AssertionHelper;
import PhptravelsPages.AdminPage.Bookings.BookingsBase;
import Tests.TestBase.AdminTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BookingsTest extends AdminTestBase{
    AssertionHelper Assert;
    AdminLoginHelper login;
    BookingsBase booking ;
    @BeforeMethod
    public void init() throws InterruptedException {
        Assert = new AssertionHelper();
        login = new AdminLoginHelper();
        booking = new BookingsBase(AdminDriver);

    }
    @Test
    public void SearchBookingsByID() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setBookingId("20250308073436");
        booking.clickSearchButton();
        Thread.sleep(2000);
        Assert.assertElementIsVisible(AdminDriver,By.xpath("//td[text()='20250308073436']"));

    }
    @Test
    public void SearchModuleType() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.selectModuleType("Hotels");
        booking.clickSearchButton();
        Thread.sleep(2000);
        Assert.assertElementIsNotVisible(AdminDriver,By.xpath("//td[text='20250503073522']"));
    }
    @Test
    public void SearchBookingStatus() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setBookingStatus("Pending");
        booking.clickSearchButton();
        Thread.sleep(2000);
        Assert.assertElementIsNotVisible(AdminDriver,By.xpath("//td[text='20250501035001']"));
    }
    @Test
    public void SearchPaymentStatus() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.setPaymentStatus("Unpaid");
        booking.clickSearchButton();
        Assert.assertElementIsNotVisible(AdminDriver,By.xpath("//td[text='20250501035001']"));
    }
    @Test
    public void VerifyBackFunctionality() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        booking.joinBookingPage();
        booking.clickBackButton();
        Assert.assertElementIsVisible(AdminDriver,By.xpath("(//*[@class=\"card-body p-3\"])[5]"));
    }
}
