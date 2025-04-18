package Tests.AdminTest.Bookings;
import PhptravelsPages.AdminPage.Bookings.BookingsBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BookingsTest extends AdminTestBase{
    BookingsBase booking ;
    @BeforeMethod
    public void init(){
        booking = new BookingsBase(AdminDriver);
    }
    @Test
    public void oo(){}
}
