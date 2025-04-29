package PhptravelsPages.AdminPage.Transaction;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionBase extends PageBase{
    By transactionTab=By.xpath("(//*[@class=\"loadeffect text-start btn btn-outline-light btn-toggle collapsed w-100 gap-3 \"])[4]");
    By pageTitle=By.xpath("//*[@class=\"m-0 page_title\"]");
    String transaction="Transactions";
    
    public TransactionBase(WebDriver driver) {
        super(driver);
    }
}

