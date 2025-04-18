package PhptravelsPages.AdminPage.Settings.Languages;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LanguagePage extends PageBase {
    By SelectAllButton = By.xpath("(//*[@class=\"form-check\"])[1]");
    By SortStatus = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[1]");
    By SortCountry = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[2]");
    By SortLanguageCode = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[3]");
    By SortName = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[4]");
    By SortDefault = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[5]");
    By SortType = By.xpath("(//*[@class=\"xcrud-column xcrud-action\"])[6]");
    By StatusButton = By.xpath("(//*[@class=\"updated_status form-check-input\"])[1]");
    By DefaultButton = By.xpath("(//*[@class=\"makeDefault form-check-input\"])[1]");
    By TranslationButton = By.xpath("(//*[@class=\"xcrud-button\"])[1]");
    By EditButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-orange\"])[1]");
    By DeleteButton = By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-red\"])[1]");
    By Display25itemsButton = By.xpath("(//*[@class=\"xcrud-button active xcrud-action\"])");
    By Display50itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[1]");
    By Display100itemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[2]");
    By DisplayAllItemsButton = By.xpath("(//*[@class=\"xcrud-button xcrud-action\"])[3]");
    By SearchButton = By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By AddButton = By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    public LanguagePage(WebDriver driver) {
        super(driver);
    }
    public void selectAll (){
        clickOnElement(SelectAllButton);
    }
    public void sortByStatus (){
        clickOnElement(SortStatus);
    }
    public void sortByCountry(){
        clickOnElement(SortCountry);
    }
    public void sortByLanguageCode(){
        clickOnElement(SortLanguageCode);
    }
    public void sortByName(){
        clickOnElement(SortName);
    }
    public void sortByDefault (){
        clickOnElement(SortDefault);
    }
    public void sortByType(){
        clickOnElement(SortType);
    }
    public void statusButton(){
        clickOnElement(StatusButton);
    }
    public void defaultButton(){
        clickOnElement(DefaultButton);
    }
    public void translationButton(){
        clickOnElement(TranslationButton);
    }
    public void deleteButton(){
        clickOnElement(DeleteButton);
    }
    public void editButton(){
        clickOnElement(EditButton);
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
    public void searchButton (){
        clickOnElement(SearchButton);
    }
    public void addButton (){
        clickOnElement(AddButton);
    }
}
