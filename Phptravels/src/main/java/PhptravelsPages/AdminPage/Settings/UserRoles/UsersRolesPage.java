package PhptravelsPages.AdminPage.Settings.UserRoles;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UsersRolesPage extends PageBase {
    By SortTypeNameAsc = By.xpath("//*[@class=\"xcrud-column xcrud-action\"]");
    By SortTypeNameDesc = By.xpath("//*[@class=\"xcrud-column xcrud-action xcrud-current xcrud-desc\"]");
    By SearchButton = By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By DeleteButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-red\"])[1]");
    By EditButton = By.xpath("(//*[@class=\"xcrud-button\"])[1]");
    By Display25itemsButton = By.xpath("(//*[@class=\"xcrud-button active xcrud-action\"])");
    By Display50itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[1]");
    By Display100itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[2]");
    By DisplayAllItemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[3]");
    By AddButton = By.xpath("//*[@class=\"loading_effect btn btn-dark\"]");
    public UsersRolesPage(WebDriver driver) {
        super(driver);
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
    public void sortByTypeNameAsc (){
        clickOnElement(SortTypeNameAsc);
    }
    public void sortByTypeNameDesc () throws InterruptedException {
        clickOnElement(SortTypeNameAsc);
        Thread.sleep(2000);
        clickOnElement(SortTypeNameDesc);
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
}
