package PhptravelsPages.AdminPage.Settings.Locations;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LocationsPage extends PageBase {
    By SelectAllButton = By.xpath("//*[@class=\"form-check-input \"]");
    By SelectItemButton = By.xpath("(//*[@class=\"checkboxcls form-check-input\"])[1]");
    By SortStatusButton = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[1]");
    By SortCityButton = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[3]");
    By SortCountryButton = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[4]");
    By StatusButton = By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]");
    By AddButton = By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    By SearchButton = By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By DeleteButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-red\"])[1]");
    By EditButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-orange\"])[1]");
    By Display25itemsButton = By.xpath("(//*[@class=\"xcrud-button active xcrud-action\"])");
    By Display50itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[1]");
    By Display100itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[2]");
    By DisplayAllItemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[3]");
    By GoToNextPage=By.xpath("(//*[@class=\"xcrud-action\"])[1]");
    public LocationsPage(WebDriver driver) {
        super(driver);
    }
    public void selectAllButton (){
        clickOnElement(SelectAllButton);
    }
    public void selectItem (){
        clickOnElement(SelectItemButton);
    }
    public void sortByStatusButton (){
        clickOnElement(SortStatusButton);
    }
    public void sortByCityButton (){
        clickOnElement(SortCityButton);
    }
    public void statusButton (){
        clickOnElement(StatusButton);
    }
    public void addButton (){
        clickOnElement(AddButton);
    }
    public void searchButton (){
        clickOnElement(SearchButton);
    }
    public void editButton (){
        clickOnElement(EditButton);
    }
    public void deleteButton (){
        clickOnElement(DeleteButton);
    }
    public void sortByCountryButton (){
        clickOnElement(SortCountryButton);
    }
    public void display25itemsButton (){
        clickOnElement(Display25itemsButton);
    }
    public void display50itemsButton (){
        clickOnElement(Display50itemsButton);
    }
    public void display100itemsButton (){
        clickOnElement(Display100itemsButton);
    }
    public void displayAllItemsButton (){
        clickOnElement(DisplayAllItemsButton);
    }
    public void goToNextPage (){
        clickOnElement(GoToNextPage);
    }

}
