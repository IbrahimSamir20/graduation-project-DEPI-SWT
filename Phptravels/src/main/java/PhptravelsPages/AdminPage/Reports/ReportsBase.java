package PhptravelsPages.AdminPage.Reports;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportsBase extends PageBase {
    By reportTab=By.xpath("(//*[@class=\"text-start btn btn-outline-light btn-toggle collapsed w-100 gap-3\"])[5]");
    By weeklyBookingTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[8]");
    By monthlyBookingTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[9]");
    By annuallyBookingTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[10]");
    By weeklyUsersTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[11]");
    By monthlyUsersTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[12]");
    By annuallyUsersTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[13]");
    By paymentTransactionsTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[14]");
    By annualIncomeReportTab=By.xpath("(//*[@class=\"loadeffect link-light \"])[15]");
    
    By header=By.xpath("class=\"card-header\"");
    public String weeklyBooking="Weekly Bookings";
    public String monthlyBooking="Monthly Bookings";
    public String annuallyBooking="Annual Bookings";
    public String weeklyUsers="Weekly Users";
    public String monthlyUsers="Monthly Users";
    public String annuallyUsers="Annually Users";
    public String transactionReport="Transaction Report";
    public String annualIncomeReport="Income Report For 5 Years";

    public ReportsBase(WebDriver driver) {
        super(driver);
    }
    
    public void clickonReportTab(){
        clickOnElement(reportTab);
    }
    public void clickonWeeklyBookingTab(){
        clickOnElement(weeklyBookingTab);
    }
    public void clickonMonthlyBookingTab(){
        clickOnElement(monthlyBookingTab);
    }
    public void clickonAnnuallyBookingTab(){
        clickOnElement(annuallyBookingTab);
    }
    public void clickonWeeklyUsersTab(){
        clickOnElement(weeklyUsersTab);
    }
    public void clickonMonthlyUsersTab(){
        clickOnElement(monthlyUsersTab);
    }
    public void clickonAnnuallyUsersTab(){
        clickOnElement(annuallyUsersTab);
    }
    public void clickonPaymentTransactionsTab(){
        clickOnElement(paymentTransactionsTab);
    }
    public void clickonAnnualIncomeReportTab(){
        clickOnElement(annualIncomeReportTab);
    }
    
    public String getHeader(){
        return getText(header);
    }
    
}
