package Tests.AdminTest.Reports;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Reports.ReportsBase;
import Tests.TestBase.AdminTestBase;
import static Tests.TestBase.AdminTestBase.AdminDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsTest extends AdminTestBase {
    ReportsBase reportsBase;
    AdminLoginHelper login;
    @BeforeMethod
    public void init() throws InterruptedException {
        login = new AdminLoginHelper();
        Thread.sleep(2000);
        reportsBase = new ReportsBase(AdminDriver);
        Thread.sleep(2000);
    }
    public void goToReportTab () throws InterruptedException{
        login.adminLogin();
        Thread.sleep(2000);
        reportsBase.clickonReportTab();
        Thread.sleep(2000);
    }
    @Test
    public void goToweeklyBookingTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonWeeklyBookingTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.weeklyBooking);
        Thread.sleep(2000);
    }
    @Test
    public void goToMonthlyBookingTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonMonthlyBookingTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.monthlyBooking);
        Thread.sleep(2000);
    }
    @Test
    public void goToAnnuallyBookingTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonAnnuallyBookingTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.annuallyBooking);
        Thread.sleep(2000);
    }
    @Test
    public void goTomonthlyBookingTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonMonthlyBookingTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.monthlyBooking);
        Thread.sleep(2000);
    }
    @Test
    public void goToWeeklyUsersTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonWeeklyUsersTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.weeklyUsers);
        Thread.sleep(2000);
    }
    @Test
    public void goToMonthlyUsersTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonMonthlyUsersTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.monthlyUsers);
        Thread.sleep(2000);
    }
    @Test
    public void goToAnnuallyUsersTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonAnnuallyUsersTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.annuallyUsers);
        Thread.sleep(2000);
    }
    @Test
    public void goToPaymentTransactionsTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonPaymentTransactionsTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.transactionReport);
        Thread.sleep(2000);
    }
    @Test
    public void goToAnnualIncomeReportTab() throws InterruptedException{
        Thread.sleep(2000);
        goToReportTab();
        Thread.sleep(2000);
        reportsBase.clickonAnnualIncomeReportTab();
        Thread.sleep(2000);
        Assert.assertEquals(reportsBase.getHeader(),reportsBase.annualIncomeReport);
        Thread.sleep(2000);
    }
}
