package PhptravelsPages.AdminPage.Settings.Countries;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CountriesBasePage extends PageBase{
    By SortIso = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[1]");
    By SortNiceName = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[3]");
    By SortIso3 = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[4]");
    By SortNumCode = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[5]");
    By SortPhoneCode = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[6]");
    By SortCountryStatus = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[7]");
    By SortTraffic = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[8]");
    By SortAsc = By.xpath("//*[@class=\"xcrud-column xcrud-action xcrud-current xcrud-desc\"]");
    By AddButton = By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    By EditButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-orange\"])[3]");
    By DeleteButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-red\"])[4]");
    By SearchButton = By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By Display50itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[1]");
    By Display100itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[2]");
    By DisplayAllItemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[3]");
    public By SearchTextField = By.xpath("//*[@class=\"xcrud-searchdata xcrud-search-active xcrud-input-small\"]");
    public By Zimbabwe = By.xpath("//*[@class=\"flag zimbabwe\"]");
    public By Andorra = By.xpath("//*[@class=\"flag andorra\"]");
    public By Afghanistan = By.xpath("//*[@class=\"flag afghanistan\"]");
    public By UnitedStates = By.xpath("//*[@class=\"flag united states minor \"]");
    public By BruneiDarussalam = By.xpath("//*[@class=\"flag brunei darussalam\"]");
    public By Uzbekistan = By.xpath("//*[@class=\"flag uzbekistan\"]");
    public By SouthGeorgia = By.xpath("//*[@class=\"flag south georgia and th\"]");
    public By Pitcairn = By.xpath("//*[@class=\"flag pitcairn\"]");
    public By India = By.xpath("//*[@class=\"flag india\"]");
    public By Num50 = By.xpath("(//*[@class=\"xcrud-current xcrud-num\"])[50]");
    public By Num100 = By.xpath("(//*[@class=\"xcrud-current xcrud-num\"])[100]");
    public By All = By.xpath("(//*[@class=\"xcrud-current xcrud-num\"])[252]");
    public CountriesBasePage(WebDriver driver) {
        super(driver);
    }
    public void sortIso(){
        clickOnElement(SortIso);
    }
    public void sortNiceName(){
        clickOnElement(SortNiceName);
    }
    public void sortIso3(){
        clickOnElement(SortIso3);
    }
    public void sortNumCode(){
        clickOnElement(SortNumCode);
    }
    public void sortPhoneCode(){
        clickOnElement(SortPhoneCode);
    }
    public void sortCountryStatus (){
        clickOnElement(SortCountryStatus);
    }
    public void sortTraffic (){
        clickOnElement(SortTraffic);
    }
    public void sortAsc(){
        clickOnElement(SortAsc);
    }
    public void addButton(){
        clickOnElement(AddButton);
    }
    public void editButton(){
        clickOnElement(EditButton);
    }
    public void deleteButton(){
        clickOnElement(DeleteButton);
    }
    public void searchButton(){
        clickOnElement(SearchButton);
    }
    public void display50itemsButton(){
        clickOnElement(Display50itemsButton);
    }
    public void display100itemsButton(){
        clickOnElement(Display100itemsButton);
    }
    public void displayAllItemsButton(){
        clickOnElement(DisplayAllItemsButton);
    }
}
