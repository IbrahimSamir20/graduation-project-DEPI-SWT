package PhptravelsPages.AdminPage.Hotels;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HotelsBase extends PageBase {
    WebDriver driver;
    public HotelsBase(WebDriver driver){
super(driver);
    }

    By hotelsbutton=By.xpath("//*[@class=\"text-start btn btn-outline-light btn-toggle w-100 gap-3\"][1]");
    By hotelSuggest=By.xpath("//*[@class=\"loadeffect link-light  \"][1]");
    By addButton=By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
    By status=By.xpath("//*[@class=\"select2-selection__rendered\"][1]");
    By city=By.xpath("//*[@class=\"select2-selection__rendered\"][2]");
    By order=By.xpath("//*[@class=\"xcrud-input form-control\"]");
    By enabled= By.xpath("//*[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected\"]");
    By CityName=By.xpath("//*[@class=\"select2-results__option select2-results__option--selectable select2-results__option--selected\"]");
    By saveButton=By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
    By searchButthon =By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
    By searchElement=By.xpath("//*[@class=\"xcrud-searchdata xcrud-search-active xcrud-input-small\"]");
    By GoButton=By.xpath("//*[@class=\"xcrud-action xcrud-button xcrud-green\"]");
    By resetButton=By.xpath("//*[@class=\"xcrud-action xcrud-button xcrud-red\"]");

public void clickOnHotels(){
        clickOnElement(hotelsbutton);
    }

    public void clickOnHotelSuggest(){
        clickOnElement(hotelSuggest);
    }

    public void clickOnAddButton(){
        clickOnElement(addButton);
    }

    public void clickONStatus(){
        clickOnElement(status);
    }

    public void clickOnEnabled(){
        clickOnElement(enabled);
    }
    public void clickOnCity(){
        clickOnElement(city);
    }

    public void clickOnCityName(){
        clickOnElement(CityName);
    }

    public void fillOrder( String value){
        sendKeys(order,value);
    }

    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }

    public void clickOnSearchButton(){
        clickOnElement(searchButthon);
    }

    public void fillSearchElement(String value){
        sendKeys(searchElement,value);

    }
public void clickOnGoButton(){
        clickOnElement(GoButton);

}
public void clickOnReserButton(){
    clickOnElement(resetButton);
}

}
