package PhptravelsPages.AdminPage.Visa;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Visacountries extends PageBase {


    public Visacountries(WebDriver driver) {
        super(driver);
    }
    By visa=By.xpath("/html/body/main/header/ul/li[14]/button");
    By visacountries=By.xpath("//*[@id=\"visa-collapse\"]/ul/li[1]/a");
    By fromcountry=By.xpath("//*[@id=\"nav-tab\"]/a[1]");
    By tocountry=By.xpath("//*[@id=\"nav-tab\"]/a[2]");
    By addbutton=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[1]/a");
    By backbutton=By.xpath("/html/body/main/section/div[1]/div/div[2]/a");
    By cheakbox=By.xpath("//*[@id=\"select_all\"]");
    By editsecendelemnt=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[6]/span/a[1]");
    By deletethirdelemnt=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[6]/span/a[2]");
    By searchbutton=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/span/a");
    By allelemntbutton=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/div/div/button[4]");
    By hundrendelemntbutton=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/div/div/button[3]");
    By page11=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/div/ul/li[10]/a");
    By dashboardheader=By.xpath("/html/body/main/section/div[1]/div/div[1]/p");
    By deleteallelemnt=By.xpath("//*[@id=\"deleteAll\"]");
    By searchtextfield=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/span/span/input");
    By gobutton=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/span/span/span[3]/a");
    By albanianame=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[4]");
    By beninname=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr/td[4]");
    By resettbutton=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[3]/span/span/span[3]/a[2]");
    By afghanstanto=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]");
    By afghanstan=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]");
    By hundredelemnttext=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[100]/td[2]");
    By lastnumberonlistafterclickall=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[253]/td[2]");
    By saintmartin=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]");
    By algeriatext=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[4]");
    By edittextbox=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input");
    By savebutton=By.xpath(("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[1]/a[1]"));
    By secendcountryname=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[4]");
    By addnickname=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input");
    By addedelemnt=By.xpath("//*[@id=\"nav-visa_from\"]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[4]");

    public String visacountriestext="Visa Countries";
    public String dashboardtext="Dashboard";
    public String delteallatributevalue="deleteAll";
    public String firstcountrystringinfromcountry ="Afghanistan";
    public String algeria="Algeria";
    public String albaniaedited="Albaniax";
    public String egypt="egypt";

    public void clickvisa(){clickOnElement(visa);}
    public void clickvisacountries(){clickOnElement(visacountries);}
    public void clickfromcountry(){clickOnElement(fromcountry);}
    public void clickontocountry(){clickOnElement(tocountry);}
    public void clickaddbutton(){clickOnElement(addbutton);}
    public void clickbackbutton(){clickOnElement(backbutton);}
    public void clickcheakboxforallelemnt(){clickOnElement(cheakbox);}
    public void editsecendelment(){clickOnElement(editsecendelemnt);}
    public void deletethirdelemnt(){clickOnElement(deletethirdelemnt);}
    public void clicksearchbutton(){clickOnElement(searchbutton);}
    public void clickallelemntbutton(){clickOnElement(allelemntbutton);}
    public void clickhundredelemntbutton(){clickOnElement(hundrendelemntbutton);}
    public void clickpage11button(){clickOnElement(page11);}
    public void fillsearchtextfield(String x){sendKeys(searchtextfield,x);}
    public void clickgobutton(){clickOnElement(gobutton);}
    public void clickrestbutton(){clickOnElement(resettbutton);}
    public void filledittextbox(String x){sendKeys(edittextbox,x);}
    public void clicksavebutton(){clickOnElement(savebutton);}
    public void filladdnickname(String x){sendKeys(addnickname,x);}

    public void cleartextboxforedit(){driver.findElement(edittextbox).clear();}

    public String getnumberofelmentlistwhenclickonhundred(){return driver.findElement(hundredelemnttext).getText();}
    public String gettextofdashboardheader(){return driver.findElement(dashboardheader).getText();}
    public String gettextfromvisacountries(){return driver.findElement(visacountries).getText();}
    public String gettextofalbaniacountry(){return driver.findElement(albanianame).getText();}
    public String gettextofbenincountry(){return driver.findElement(beninname).getText();}
    public String gettextfromafgansthantextinfromcountry(){return driver.findElement(afghanstan).getText();}
    public String gettextfromafgansthantextintocountry(){return driver.findElement(afghanstanto).getText();}
    public String gettextofidattributefromdeleteallbutton(){return driver.findElement(deleteallelemnt).getAttribute("id");}
    public String getnumberoflastelemntofcountries(){return driver.findElement(lastnumberonlistafterclickall).getText();}
    public String gettextofsaintmartin(){return driver.findElement(saintmartin).getText();}
    public String getalgriatext(){return driver.findElement(algeriatext).getText();}
    public String getsecendcountryname(){return driver.findElement(secendcountryname).getText();}
    public String getvalueofaddedelemnt(){return driver.findElement(addedelemnt).getText();}
}
