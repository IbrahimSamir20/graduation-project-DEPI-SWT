package PhptravelsPages.AdminPage.Visa;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class visabooking extends PageBase {
    public visabooking(WebDriver driver) {
        super(driver);
    }
    By addbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a");
    By searchbutoon=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/a");
    By allbooks=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/div/div/button[3]");
    By searchtextbar=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/input");
    By gobuuton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[3]/a");
    By resetbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[3]/a[2]");
    By allbooksbox=By.xpath("//*[@id=\"select_all\"]");
    By editfor3rdelemnt=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[14]/span/a[1]");
    By delete4thelemnt=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[14]/span/a[2]");
    By allfields=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[2]/span[1]/span");
    By secendfieldonsearch=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[1]/span[1]/span");
    By waitingfromlist=By.xpath("/html/body/span/span/span[2]/ul/li");
    By firstnamefromlist=By.xpath("/html/body/span/span/span[2]/ul/li");
    By visa=By.xpath("/html/body/main/header/ul/li[14]/button");
    By visabooking=By.xpath("//*[@id=\"visa-collapse\"]/ul/li[2]/a");
    By quasim= By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]");
    By writedatalistone=By.xpath("/html/body/span/span/span[1]/input");
    By writedatalisttwo=By.xpath("/html/body/span/span/span[1]/input");
    By firstnameoneditfield=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/input");
    By  savebutton=By.xpath(("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a[1]"));
    By editedtext=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[7]");
    By forthelemntname=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[7]");
    By reddeletesquare=By.xpath("//*[@id=\"deleteAll\"]");
    By fromcountry=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input");
    By tocountry=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/input");
    By firstname=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/input");
    By lastname=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[6]/td[2]/input");
    By ziadelemntadded=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]");

    public String Quasim="Qasim";
    public String ziad="ziad";
    public String datainsideziad ="deleteAll";
    public String classattrubite="xcrud-search-toggle xcrud-button xcrud-cyan";

    public void writedatalisttwo(){sendKeys(writedatalisttwo,"fir");}
    public void writeWonfirstlist(){sendKeys(writedatalistone,"w");}
    public void clickaddbutton(){clickOnElement(addbutton);}
    public void clicksearchbutton(){clickOnElement(searchbutoon);}
    public void clickallbooksbutton(){clickOnElement(allbooks);}
    public void fillsearchtextbar(String x){sendKeys(searchtextbar,x);}
    public void clickgobutton(){clickOnElement(gobuuton);}
    public void clickresetbutton(){clickOnElement(resetbutton);}
    public void clickallbooksbox(){clickOnElement(allbooksbox);}
    public void clickeditthirdelemnt(){clickOnElement(editfor3rdelemnt);}
    public void clickdeleteforforthelemnt(){clickOnElement(delete4thelemnt);}
    public void clickonfirstlistonsearch(){clickOnElement(secendfieldonsearch);}
    public void clickonsecendlistonsearch(){clickOnElement(allfields);}
    public void clickwaitingfromfirstlist(){clickOnElement(waitingfromlist);}
    public void clickfirstnamefromsecendlist(){clickOnElement(firstnamefromlist);}
    public void clickvisa(){clickOnElement(visa);}
    public void clickvisabooking(){clickOnElement(visabooking);}
    public void clearfirstnamefield(){driver.findElement(firstnameoneditfield).clear();}
    public void fillfirstnamefield(String x){sendKeys(firstnameoneditfield,x);}
    public void clicksave(){clickOnElement(savebutton);}
    public void fillfromcountry(String x){sendKeys(fromcountry,x);}
    public void filltocountry(String x){sendKeys(tocountry,x);}
    public void fillfirstname(String x){sendKeys(firstname,x);}
    public void filllastname(String x){sendKeys(lastname,x);}

    public String cheaknameiscorrect(){return driver.findElement(quasim).getText();}
    public String gettextfromeditedvalue(){return driver.findElement(editedtext).getText();}
    public String gettextforforthelemntname(){return driver.findElement(forthelemntname).getText();}
    public String getattrubiteforredbutton(){return driver.findElement(reddeletesquare).getAttribute("id");}
    public String getnameofaddedelemnt(){return driver.findElement(ziadelemntadded).getText();}
    public String getattrubiteofsearchbutton(){return driver.findElement(resetbutton).getAttribute("class");}
}
