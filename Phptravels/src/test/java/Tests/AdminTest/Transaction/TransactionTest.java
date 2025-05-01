package Tests.AdminTest.Transaction;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Transaction.TransactionBase;
import Tests.TestBase.AdminTestBase;
import static Tests.TestBase.AdminTestBase.AdminDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransactionTest extends AdminTestBase{
    AdminLoginHelper login;
    TransactionBase transactionPage;
    @BeforeMethod
    public void init() throws InterruptedException {
        login = new AdminLoginHelper();
        Thread.sleep(2000);
        transactionPage = new TransactionBase(AdminDriver);
        Thread.sleep(2000);
    }
    public void goToTransactionTab () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(2000);
        transactionPage.clickonTransactionTab();
        Thread.sleep(2000);
    }
    @Test
    public void show25() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonButton25(); 
    }
    @Test
    public void show50() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonButton50(); 
    }
    @Test
    public void show100() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonButton100(); 
    }
    @Test
    public void showAll() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonButtonAll(); 
    }
    @Test
    public void exportCSV() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonExportIntoCSVButton(); 
    }
    @Test
    public void searchWithEmptyFields() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonSearchButton();
        Thread.sleep(2000);
        transactionPage.clickonGoButton();
        
    }
    @Test
    public void searchWithphrase() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonSearchButton();
        Thread.sleep(2000);
        transactionPage.FillPhrase("Basmala");
        Thread.sleep(2000);
        transactionPage.clickonGoButton();
        
    }
    @Test
    public void searchWithRang() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonSearchButton();
        Thread.sleep(2000);
        transactionPage.SelectRange("Next Year");
        Thread.sleep(2000);
        transactionPage.clickonGoButton();
    }
    @Test
    public void searchWithPanding() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonSearchButton();
        Thread.sleep(2000);
        transactionPage.SelectPending("Approved");
        Thread.sleep(2000);
        transactionPage.clickonGoButton();
    }
    @Test
    public void searchWithFields() throws InterruptedException{
        goToTransactionTab();
        Thread.sleep(2000);
        transactionPage.clickonSearchButton();
        Thread.sleep(2000);
        transactionPage.SelectField("Id");
        Thread.sleep(2000);
        transactionPage.clickonGoButton();
        
    }
    
    
}
