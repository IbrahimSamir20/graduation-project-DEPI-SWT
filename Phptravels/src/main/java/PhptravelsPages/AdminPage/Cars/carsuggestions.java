package PhptravelsPages.AdminPage.Cars;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class carsuggestions extends PageBase {

    public carsuggestions(WebDriver driver) {
        super(driver);
    }
    By addbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a");
    By searchbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/a");
    By editforlastelemnt=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[6]/span/a[1]");
    By delete7thelemnt=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[7]/td[6]/span/a[2]");
    By selectallbutton=By.xpath("//*[@id=\"select_all\"]");
    By selectlastelemntbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[1]/div/input");
    By searchtextfield=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/input");
    By gobutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[3]/a");
    By getnameofelemntonlist=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[4]");
    By carsbutton=By.xpath("(//button[@class=\"text-start btn btn-outline-light btn-toggle collapsed w-100 gap-3\"])[3]");
    By subbuttonsuggestedcars=By.xpath("//*[@id=\"cars-collapse\"]/ul/li[2]/a");
    By fulldeletebutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[1]/div/button");
    By cityairporttextfield=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input");
    By clicksave=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a[1]");
    By lhe1afterchange=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[4]");
    By lhe1namexpath=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[7]/td[4]");
    By cityairportadded=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input");
    By addedlemnt=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]");
    By returnbutton= By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a[2]");
    By suggestion=By.xpath("/html/body/main/section/div[1]/div/div[1]/p");
    public String suggestioncars="Cars Suggestions";
    public void clickaddbutton(){clickOnElement(addbutton);}
    public void clicksearchbutton(){clickOnElement(searchbutton);}
    public void clickeditforlastelemnt(){clickOnElement(editforlastelemnt);}
    public void clickdelete7thelemnt(){clickOnElement(delete7thelemnt);}
    public void clickselectallbutton(){clickOnElement(selectallbutton);}
    public void clickselectlastelemntbutton(){clickOnElement(selectlastelemntbutton);}
    public void writeontextfield(String x){sendKeys(searchtextfield,x);}
    public void clickgobutton(){clickOnElement(gobutton);}
    public void clickcarsbutton(){clickOnElement(carsbutton);}
    public void clicksubbuttonsugeestedcars(){clickOnElement(subbuttonsuggestedcars);}
    public void fillcityairporttextfield(String x){sendKeys(cityairporttextfield,x);}
    public void clearcityairporttextbox(){driver.findElement(cityairporttextfield).clear();}
    public void clicksave(){clickOnElement(clicksave);}
    public void textboxcityairport(String x){sendKeys(cityairportadded,x);}
    public void clickreturnbutton(){clickOnElement(returnbutton);}

    public String clickfulldeletebutton(){return driver.findElement(fulldeletebutton).getAttribute("id");}
    public String getnameofstringlist(){return driver.findElement(getnameofelemntonlist).getText();}
    public String getnameafteredditforlastelemntonlist(){return driver.findElement(lhe1afterchange).getText();}
    public String gettextfortheremovedelemnt(){return driver.findElement(lhe1namexpath).getText();}
    public String gettextfromheadofpage(){return driver.findElement(suggestion).getText();}
    public String gettextfromaddedelemnt(){return driver.findElement(addedlemnt).getText();}
}

