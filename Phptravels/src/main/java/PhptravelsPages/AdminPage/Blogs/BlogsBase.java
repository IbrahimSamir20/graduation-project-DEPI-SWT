
package PhptravelsPages.AdminPage.Blogs;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BlogsBase extends PageBase{
WebDriver driver;
    public BlogsBase(WebDriver driver) {
        super(driver);
    }


        By addButton = By.xpath("//*[@class=\"xcrud-button xcrud-green xcrud-action\"]");
        By catNameField = By.xpath("//*[@class=\"xcrud-input form-control\"]");
        By catSlugField = By.xpath("//*[@class=\"xcrud-input form-control\"]");
        By saveButton = By.xpath("//*[@class=\"xcrud-button xcrud-purple xcrud-action\"]");
        By firstEditButton = By.xpath("//*[@class=\"xcrud-action xcrud-button xcrud-orange\"]");
        By firstDeleteButton = By.xpath("//*[@class=\"xcrud-action xcrud-button xcrud-red\"]");
        By searchButton = By.xpath("//*[@class=\"xcrud-search-toggle xcrud-button xcrud-cyan\"]");
        By firstCheckbox = By.xpath("//*[@class=\"checkboxcls form-check-input\"]"); // Skip master checkbox
        By blog=By.xpath("//*[@class=\"text-start btn btn-outline-light btn-toggle w-100 gap-3 collapsed\"]");
        By blogcat=By.xpath("//*[@class=\"loadeffect link-light active\"]");


        public void clickAddButton() {
           // wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
            clickOnElement(addButton);
        }

        public void fillCatNameField(String value) {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(catNameField)).sendKeys(name);
//            driver.findElement(catSlugField).sendKeys(slug);
//            driver.findElement(saveButton).click();
             sendKeys(catNameField,value);
        }

        public void fillCatSlugField(String value){
            sendKeys(catSlugField ,value);

        }

        public void clicksavebutton(){
            clickOnElement(saveButton);
        }
public void clickOnBlog(){
            clickOnElement(blog);
}

public void clickOnBlogCat(){
            clickOnElement(blogcat);
}
        public void editFirstCategory() {
//            wait.until(ExpectedConditions.elementToBeClickable(firstEditButton)).click();
//            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(catNameField));
//            nameField.clear();
//            nameField.sendKeys(newName);
//
//            WebElement slugField = driver.findElement(catSlugField);
//            slugField.clear();
//            slugField.sendKeys(newSlug);
//
//            driver.findElement(saveButton).click();
            clickOnElement(firstEditButton);
        }

        public void deleteFirstCategory() {
//            wait.until(ExpectedConditions.elementToBeClickable(firstDeleteButton)).click();
//            driver.switchTo().alert().accept();
// Accept the confirmation alert
   clickOnElement(firstDeleteButton);
        }

        public void clickSearchButton() {
          clickOnElement(searchButton);
        }

        public void selectFirstCheckbox() {
          clickOnElement(firstCheckbox);
        }
    }


