package PhptravelsPages.AdminPage.Newsletter;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsletterBase extends PageBase {
    By newsletterTab=By.xpath("(//*[@class=\"loadeffect text-start btn btn-outline-light btn-toggle collapsed w-100 gap-3 \"])[3]");
    By pageTitle=By.xpath("//*[@class=\"m-0 page_title\"]");
    By button25=By.xpath("//*[@data-limit=\"25\"]");
    By button50=By.xpath("//*[@data-limit=\"50\"]");
    By button100=By.xpath("//*[@data-limit=\"100\"]");
    By buttonAll=By.xpath("//*[@data-limit=\"all\"]");
    By searchButton=By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By phrase=By.xpath("//*[@class=\"xcrud-searchdata xcrud-search-active xcrud-input-small\"]");
    By selectRange=By.id("select2-range-n2-container");
    By selectField=By.id("select2-column-l7-container");
    By goButton=By.xpath("//*[@class=\"xcrud-action xcrud-button xcrud-green\"]");
    By exportIntoCSVButton=By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-in-new-window xcrud-action\"]");
    By addButton=By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    String newsletter="Newsletter";
    public NewsletterBase(WebDriver driver) {
        super(driver);
    }
    
    
}
