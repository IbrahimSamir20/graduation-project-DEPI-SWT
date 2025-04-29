package PhptravelsPages.AdminPage.Users;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class supplieruser extends PageBase {
    public supplieruser(WebDriver driver) {
        super(driver);
    }

    By users=By.xpath("/html/body/main/header/ul/li[6]/button");
    By supplierusers =By.xpath("//*[@id=\"users-collapse\"]/ul/li[3]/a");
    By addbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[1]/a");
    By searchbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/a");
    By gobutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[2]/a");
    By searchtextfield=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/input");
    By resetbutton=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[2]/a[2]");
    By listonsearch=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[1]/span[1]/span");
    By textonlist=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/span[1]/span[1]/span");
    By firstnameonlist=By.xpath("//*[@id=\"select2-column-6e-result-i67t-users.first_name\"]");
    public void clickemployeeusers(){clickOnElement(supplierusers);}
    public void clickonusers(){clickOnElement(users);}
    public void clickadd(){clickOnElement(addbutton);}
    public void clickonsearch(){clickOnElement(searchbutton);}
    public void clickgobutton(){clickOnElement(gobutton);}
    public void fillsearchfield(String x){sendKeys(searchtextfield,x);}
    public void clickresetbutton(){clickOnElement(resetbutton);}
    public void clickonlist(){clickOnElement(listonsearch);}
    public void writeonlist(String x){sendKeys(textonlist,x);}
    public void clickfirstnameonlist(){clickOnElement(firstnameonlist);}
}
