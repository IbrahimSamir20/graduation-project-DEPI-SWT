package PhptravelsPages.AdminPage.Transaction;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionBase extends PageBase{
    By transactionTab=By.xpath("(//*[@class=\"loadeffect text-start btn btn-outline-light btn-toggle collapsed w-100 gap-3 \"])[4]");
    By pageTitle=By.xpath("//*[@class=\"m-0 page_title\"]");
    By button25=By.xpath("//*[@data-limit=\"25\"]");
    By button50=By.xpath("//*[@data-limit=\"50\"]");
    By button100=By.xpath("//*[@data-limit=\"100\"]");
    By buttonAll=By.xpath("//*[@data-limit=\"all\"]");
    By searchButton=By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By phrase=By.xpath("//*[@class=\"xcrud-searchdata xcrud-search-active xcrud-input-small\"]");
    By selectRange=By.xpath("//*[@class=\"xcrud-daterange xcrud-searchdata xcrud-input-small select2-hidden-accessible\"]");
    By selectPending=By.xpath("//*[@class=\"xcrud-searchdata xcrud-input-small select2-hidden-accessible\"]");
    By selectField=By.xpath("//*[@class=\"xcrud-data xcrud-columns-select xcrud-input-small select2-hidden-accessible\"]");
    By goButton=By.xpath("//*[@class=\"xcrud-action xcrud-button xcrud-green\"]");
    By exportIntoCSVButton=By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-in-new-window xcrud-action\"]");
    public String transaction="Transactions";
    
    public TransactionBase(WebDriver driver) {
        super(driver);
    }
    public void SelectRange(String selectRange){
        selectDropDown(this.selectRange,selectRange);
    }
    public void SelectPending(String selectPending){
        selectDropDown(this.selectPending,selectPending);
    }
    public void FillPhrase(String phrase){
        sendKeys(this.phrase,phrase);
    }
    public void SelectField(String selectField){
        selectDropDown(this.selectField,selectField);
    }
    public void clickonTransactionTab(){
        clickOnElement(transactionTab);
    }
    public void clickonExportIntoCSVButton(){
        clickOnElement(exportIntoCSVButton);
    }
    public void clickonButton25(){
        clickOnElement(button25);
    }
    public void clickonButton50(){
        clickOnElement(button50);
    }
    public void clickonButton100(){
        clickOnElement(button100);
    }
    public void clickonButtonAll(){
        clickOnElement(buttonAll);
    }
    public void clickonSearchButton(){
        clickOnElement(searchButton);
    }
    public void clickonGoButton(){
        clickOnElement(goButton);
    }
    
    public String getHeader(){
        return getText(pageTitle);
    }
}
