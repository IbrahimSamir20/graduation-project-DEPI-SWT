package PhptravelsPages.AdminPage.Modules;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModulesSortingBtn extends PageBase {
    By moduleButton = By.xpath("//a[@class=\"loadeffect d-flex align-items-center link-light text-decoration-none gap-3\"]");
    By sortBtnAll = By.xpath("//div[@class=\"btn btn-outline-dark module_all\"]");
    By sortBtnFlights =By.xpath("//div[@class=\"btn btn-outline-dark module_flights\"]");
    By sortBtnHotels = By.xpath("//div[@class=\"btn btn-outline-dark module_hotels\"]");
    By sortBtnTours = By.xpath("//div[@class=\"btn btn-outline-dark module_tours\"]");
    By sortBtnCars = By.xpath("//div[@class=\"btn btn-outline-dark module_cars\"]");
    By sortBtnVisa = By.xpath("//div[@class=\"btn btn-outline-dark module_visa\"]");
    By sortBtnSitting=By.xpath("//a[@class=\"btn btn-outline-dark\"]");


    public ModulesSortingBtn(WebDriver driver) {
        super(driver);
    }


    public void clickOnModuleButton(){
        clickOnElement(moduleButton);
    }
    public void clickOnSortBtnAll(){
        clickOnElement(sortBtnAll);
    }
    public void clickOnSortBtnFlights(){
        clickOnElement(sortBtnFlights);
    }
    public void clickOSortBtnHotels(){
        clickOnElement(sortBtnHotels);
    }
    public void clickOSortBtnTours(){
        clickOnElement(sortBtnTours);
    }
    public void clickOSortBtnCars(){
        clickOnElement(sortBtnCars);
    }
    public void clickOSortBtnVisa(){
        clickOnElement(sortBtnVisa);
    }
    public void clickOSortBtnSitting(){
        clickOnElement(sortBtnSitting);
    }
}
