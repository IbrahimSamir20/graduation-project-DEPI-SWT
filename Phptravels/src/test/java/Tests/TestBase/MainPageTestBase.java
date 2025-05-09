package Tests.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class MainPageTestBase {
    public static WebDriver MainDriver;
    @BeforeMethod
    public void openBrowser () throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        MainDriver = new ChromeDriver(options);
        MainDriver.get("https://phptravels.net");
        System.out.println(MainDriver.getTitle());
    }
    @AfterMethod
    public  void closeBrowser (){
        MainDriver.quit();
    }
}
