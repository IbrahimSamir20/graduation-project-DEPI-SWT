package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phpfirstpage extends PageBase{
    By toursbutton= By.xpath( "(//button[@class=\"nav-link w-100 waves-effect\"])[2]");
    By fillsearchbycity=By.xpath("//input[@class=\"select2-search__field\"]");
    By clicksearchbycity=By.xpath("(//span[@class=\"select2-selection select2-selection--single\"])[2]");
    public String noresultfoundtext="No results found";
    By nosearchfoundelemnt=By.xpath("//li[@class=\"select2-results__option select2-results__message\"]");
    public String mostpopulartourtext="Most popular Tours";
    By mostpopulartourelemnt=By.xpath("//small[@class=\"mb-2 px-2 text-muted fw-bold\"]");
    By datefield=By.xpath("(//input[@id=\"date\"])[1]");
    By nineaprildate=By.xpath("(//td[@class=\"day \"])[73]");
    By movethedatelisttorightonetime=By.xpath("(//th[@class=\"next\"])[13]");
    By choosejeddahfromfieldpopulartours=By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]");
    By blueiconsearchbutton=By.xpath("(//button[@class=\"search_button w-100 btn btn-primary btn-m rounded-sm font-700 text-uppercase btn-full h-100 waves-effect\"])[3]");
    By travllernumberbutton=By.xpath("(//a[@class=\"dropdown-toggle dropdown-btn travellers waves-effect\"])[2]");
    By editnumberoftravlleradult=By.xpath("//input[@id=\"tours_adults\"]");
   By clickincreasenumberoftravller=By.xpath("//*[@id=\"tours-search\"]/div/div[3]/div/div/div/div/div[1]/div/div/div[2]");
    By getnumberoftravlersfromsquare=By.xpath("//span[@class=\"guest_tours\"]");
    By decreasenumberofadulttravller=By.xpath("//*[@id=\"tours-search\"]/div/div[3]/div/div/div/div/div[1]/div/div/div[1]");
    WebElement element=driver.findElement(By.xpath("//input[@id=\"tours_adults\"]"));


    public phpfirstpage(WebDriver driver) {
        super(driver);
    }

    public void clicktoursbutton()
    {
        clickkey(toursbutton);
    }
    public void fillsearchbycity(String na)
    {
        sendkey(fillsearchbycity,na);
    }
    public void setClicksearchbycity()
    {
        clickkey(clicksearchbycity);
    }
    public String gettextfromnosearchfoundelement()
    {
        return driver.findElement(nosearchfoundelemnt).getText();
    }
    public String gettextfrommostpopulartourelemnt()
    {
        return driver.findElement(mostpopulartourelemnt).getText();
    }
    public void clickdatefield()
    {
        clickkey(datefield);
    }
    public void choosedatefromdatefield()
    {
        clickkey(nineaprildate);
    }
    public void Movethedatelisttorightonetime()
    {
        clickkey(movethedatelisttorightonetime);
    }
    public void choosejeddahfromlistofpopulartours()
    {
        clickkey(choosejeddahfromfieldpopulartours);
    }
    public void clickonblueiconsearchbutton()
    {
        clickkey(blueiconsearchbutton);
    }
    public void clicktravllernumberbutton()
    {
        clickkey(travllernumberbutton);
    }
    public void editadultnumberoftravller(String x)
    {
        driver.findElement(editnumberoftravlleradult).clear();
        driver.findElement(editnumberoftravlleradult).sendKeys(x);
    }
    public void increasenumberofadulttravllerby1()
    {
        clickkey(clickincreasenumberoftravller);
    }
    public String getnumberofadulttravllers()
    {
        return element.getAttribute("value");
    }
    public String getnumberoftravlersonlist()
    {
        return driver.findElement(getnumberoftravlersfromsquare).getText();
    }
    public void decreasethenumberofadulttravller()
    {
        clickkey(decreasenumberofadulttravller);
    }

}
