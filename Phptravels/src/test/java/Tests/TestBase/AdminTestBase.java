package Tests.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class AdminTestBase {
    public static WebDriver AdminDriver;
    @BeforeMethod
    public void openBrowser () throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        AdminDriver = new ChromeDriver(options);
        AdminDriver.get("https://phptravels.net/admin/login");
        System.out.println(AdminDriver.getTitle());
    }
    @AfterMethod
    public  void closeBrowser (){
        AdminDriver.quit();
    }
}
