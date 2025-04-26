package PhptravelsPages.AdminPage.Cars;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cars extends PageBase {
    public Cars(WebDriver driver) {
        super(driver);
    }
    By carsbutton=By.xpath("(//button[@class=\"text-start btn btn-outline-light btn-toggle collapsed w-100 gap-3\"])[3]");
    By subbuttoncars=By.xpath("//*[@id=\"cars-collapse\"]/ul/li[1]/a");
    By subbuttonsuggestedcars=By.xpath("//*[@id=\"cars-collapse\"]/ul/li[2]/a");
    By addbutton=By.xpath("//a[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    By searchbutton=By.xpath("//a[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By carsheader=By.xpath("//p[@class=\"m-0 page_title\"]");
    By cardeatials=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/div/ul/li/a");
    By statuslist=By.xpath("(//span[@class=\"select2-selection select2-selection--single\"])[1]");
    By enableonstatuslist=By.xpath("//li[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected select2-results__option--highlighted\"]");
    By featuredlist=By.xpath("(//span[@class=\"select2-selection select2-selection--single\"])[2]");
    By chooseyesformfeature=By.xpath("(//li[@class=\"select2-results__option select2-results__option--selectable select2-results__option--highlighted\"])");
    By namefield=By.xpath("(//input[@class=\"xcrud-input form-control\"])[1]");
    By featuresecendfield=By.xpath("(//input[@class=\"select2-search__field\"])");
    By removeelemnt=By.xpath("//a[@class=\"xcrud-remove-file xcrud-button xcrud-red\"]");
    By addphoto=By.xpath("//input[@class=\"xcrud-upload\"]");
    By currency=By.xpath("(//span[@class=\"select2-selection select2-selection--single\"])[3]");
    By euroncurrency=By.xpath("(//li[@class=\"select2-results__option select2-results__option--selectable select2-results__option--highlighted\"])");
    By clickcurrency=By.xpath("//input[@class=\"select2-search__field\"]");
    By starslist=By.xpath("(//span[@class=\"select2-selection select2-selection--single\"])[6]");
    By starslistnum1=By.xpath("//li[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected select2-results__option--highlighted\"]");
    By starslistnum2=By.xpath("(//li[@class=\"select2-results__option select2-results__option--selectable\"])[1]");
    By price=By.xpath("(//input[@class=\"xcrud-input form-control\"])[2]");
    By savebutton=By.xpath("//a[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    By deleteicon=By.xpath("(//a[@class=\"xcrud-action xcrud-button xcrud-red\"])[1]");
    By nameoftoyta=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[6]");
    By editicon=By.xpath("(//a[@class=\"xcrud-action xcrud-button xcrud-orange\"])[1]");
    By aftereditcheak=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[6]");
    By addcheakstring=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[6]");
    By searchbox=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[3]/span/span/input");
    By opelcar=By.xpath("/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[6]");
    By clickgo=By.xpath("//a[@class=\"xcrud-action xcrud-button xcrud-green\"]");
    public String StringSuggestedcars="Cars Suggestions";
    public String Stringcars="Cars";
    public String cardeatailsonaddbutton="Car Details";
    public String nameoftyotastrin="Toyota Camry 2023 full options";

    public void clickcarsbutton(){clickOnElement(carsbutton);}
    public void clicksubbuttoncars(){clickOnElement(subbuttoncars);}
    public void clicksubbuttonsugeestedcars(){clickOnElement(subbuttonsuggestedcars);}
    public void clickaddbutton(){clickOnElement(addbutton);}
    public void clicksearchbutton(){clickOnElement(searchbutton);}
    public void clickstatuslist(){clickOnElement(statuslist);}
    public void clickstatuslistandchooseenabled(){clickOnElement(enableonstatuslist);}
    public void clickfeatureslist(){clickOnElement(featuredlist);}
    public void clickfeatureslistandchooseyes(){clickOnElement(chooseyesformfeature);}
    public void enternameonnamefield(String x){sendKeys(namefield,x);}
    public void writeyes(){sendKeys(featuresecendfield,"Yes");}
    public void clickremove(){clickOnElement(removeelemnt);}
    public void clickaddphoto(){clickOnElement(addphoto);}
    public void clickcurrency(){clickOnElement(currency);}
    public void clickeuroncurrency(){clickOnElement(euroncurrency);}
    public void clickoncurrencyfield(){sendKeys(clickcurrency,"EUR");}
    public void clickonstarslist(){clickOnElement(starslist);}
    public void choose1fromstarslist(){clickOnElement(starslistnum1);}
    public void choose2fromstarslist(){clickOnElement(starslistnum2);}
    public void fillprice(){sendKeys(price,"200000");}
    public void clicksave() throws InterruptedException {clickOnElement(savebutton);}
    public void clickondelteicon(){clickOnElement(deleteicon);}
    public void clickonediticon(){clickOnElement(editicon);}
    public void clearnamefield(){driver.findElement(namefield).clear();}
    public void clickgo(){clickOnElement(clickgo);}
    public void fillsearchbar(String x){sendKeys(searchbox,x);}
    public String getnameofcar(){return driver.findElement(opelcar).getText();}
    public String returnvalueafteradd(){return driver.findElement(addcheakstring).getText();}
    public String getnameoftyotaassert(){return driver.findElement(nameoftoyta).getText();}
    public String cheakwhenclickoncarsansugestedcarsandcarsbuttonswillshowen(){return driver.findElement(subbuttonsuggestedcars).getText();}
    public String cheakwhenclickonsubbuttoncarsapagewithcarswilldisplay(){return driver.findElement(carsheader).getText();}
    public String cheakwhenclickonaddbuttonadatatofillwilldisplaytoaddnewcar(){return driver.findElement(cardeatials).getText();}
    public String getnameoffieldoafteredit(){return driver.findElement(aftereditcheak).getText();}



}
