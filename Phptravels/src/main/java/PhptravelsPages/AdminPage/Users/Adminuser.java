package PhptravelsPages.AdminPage.Users;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adminuser extends PageBase {

    public Adminuser(WebDriver driver) {
        super(driver);
    }

    By users=By.xpath("/html/body/main/header/ul/li[6]/button");
    By adminuser=By.xpath("//*[@id=\"users-collapse\"]/ul/li[2]/a");
    By addbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a");
    By searchbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/a");
    By gobutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[2]/a");
    By searchtextfield=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/input");
    By resetbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[2]/a[2]");
    By listonsearch=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[1]/span[1]/span");
    By textonlist=By.xpath("/html/body/span/span/span[1]/input");
    By firstnameonlist=By.xpath("/html/body/span/span/span[2]/ul/li");
    By allusers=By.xpath("//*[@id=\"users-collapse\"]/ul/li[1]/a");
    By admintext=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[5]");
    By Super=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[4]");
    By firstname=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input");
    By lastname=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/input");
    By clickonuserslist=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[7]/td[2]/span/span[1]/span");
    By writeonuser=By.xpath("/html/body/span/span/span[1]/input");
    By clickonadmin=By.xpath("/html/body/span/span/span[2]/ul/li");
    By clickoncurrencyslist=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[2]/span/span[1]/span");
    By writeoncurr=By.xpath("/html/body/span/span/span[1]/input");
    By clickoneur=By.xpath("/html/body/span/span/span[2]/ul/li");
    By fillemail=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/input");
    By fillpassword=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/input");
    By chartext=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]");
    By clicksave=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a[1]");
    By error=By.xpath("/html/body/main/section/div[2]/div/div/div[2]");

    public String Allusers="All Users";
    public String admin="Admin";
    public String supeR ="Super";
    public String char1="char";
    public String errormsg="Some fields are likely to contain errors. Fix errors and try again.\n";
    public String save="Save";

    public void fillemail(String x){sendKeys(fillemail,x);}
    public void fillpass(String x){sendKeys(fillpassword,x);}
    public void fillfirstname(String x){sendKeys(firstname,x);}
    public void filllastname(String x){sendKeys(lastname,x);}
    public void clickonuserlist(){clickOnElement(clickonuserslist);}
    public void clickoncuurencylist(){clickOnElement(clickoncurrencyslist);}
    public void filluserlist(String x){sendKeys(writeonuser,x);}
    public void fillcuurencylist(String x){sendKeys(writeoncurr,x);}
    public void clickonadmin(){clickOnElement(clickonadmin);}
    public void clickoneur(){clickOnElement(clickoneur);}
    public void clickonsave(){clickOnElement(clicksave);}
    public void clickadminuser(){clickOnElement(adminuser);}
    public void clickonusers(){clickOnElement(users);}
    public void clickadd(){clickOnElement(addbutton);}
    public void clickonsearch(){clickOnElement(searchbutton);}
    public void clickgobutton(){clickOnElement(gobutton);}
    public void fillsearchfield(String x){sendKeys(searchtextfield,x);}
    public void clickresetbutton(){clickOnElement(resetbutton);}
    public void clickonlist(){clickOnElement(listonsearch);}
    public void writeonlist(String x){sendKeys(textonlist,x);}
    public void clickfirstnameonlist(){clickOnElement(firstnameonlist);}


    public String returntextfromallusers(){return driver.findElement(allusers).getText();}
    public String returntextadmn(){return  driver.findElement(admintext).getText();}
    public String returnsuper(){return driver.findElement(Super).getText();}
    public String returndartext(){return driver.findElement(chartext).getText();}
    public String returnerror(){return driver.findElement(error).getText();}
    public String returnsave(){return driver.findElement(clicksave).getText();}
}
