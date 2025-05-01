package Tests.AdminTest.Newsletter;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Newsletter.NewsletterBase;
import Tests.TestBase.AdminTestBase;
import static Tests.TestBase.AdminTestBase.AdminDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsletterTest extends AdminTestBase {
    AdminLoginHelper login;
    NewsletterBase NewsletterPage;
    @BeforeMethod
    public void init() throws InterruptedException {
        login = new AdminLoginHelper();
        Thread.sleep(2000);
        NewsletterPage = new NewsletterBase(AdminDriver);
        Thread.sleep(2000);
    }
    public void goToTransactionTab () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(2000);
        NewsletterPage.clickonNewsletterTab();
        Thread.sleep(2000);
    }
    @Test
    public void show25() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonButton25(); 
    }
    @Test
    public void show50() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonButton50(); 
    }
    @Test
    public void show100() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonButton100(); 
    }
    @Test
    public void showAll() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonButtonAll(); 
    }
    @Test
    public void exportCSV() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonExportIntoCSVButton(); 
    }
    @Test
    public void searchWithEmptyFields() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonSearchButton();
        Thread.sleep(2000);
        NewsletterPage.clickonGoButton();
        
    }
    @Test
    public void searchWithphrase() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonSearchButton();
        Thread.sleep(2000);
        NewsletterPage.FillPhrase("Basmala");
        Thread.sleep(2000);
        NewsletterPage.clickonGoButton();
        
    }
    @Test
    public void searchWithRang() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonSearchButton();
        Thread.sleep(2000);
        NewsletterPage.SelectRange("Next Year");
        Thread.sleep(2000);
        NewsletterPage.clickonGoButton();
    }
    @Test
    public void searchWithFields() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonSearchButton();
        Thread.sleep(2000);
        NewsletterPage.SelectField("Id");
        Thread.sleep(2000);
        NewsletterPage.clickonGoButton();
        
    }
    public void ResetAfterSearch() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        NewsletterPage.clickonSearchButton();
        Thread.sleep(2000);
        NewsletterPage.FillPhrase("Basmala");
        Thread.sleep(2000);
        NewsletterPage.clickonGoButton();
        Thread.sleep(2000);
        NewsletterPage.clickonResetButton();
    }
    
    

}
