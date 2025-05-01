package PhptravelsPages.AdminPage.Modules;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModulesBase extends PageBase {
    By moduleButton = By.xpath("//a[@class=\"loadeffect d-flex align-items-center link-light text-decoration-none gap-3\"]");
    By moveButton = By.xpath("(//th[@style=\"width: 50px;\"])[1]");
    By targetMoveButton = By.xpath("(//th[@style=\"width: 50px;\"])[3]");
    By checkboxBtn=By.xpath("(//input[@id=\"checkedbox\"])[1]");
    By settingButton=By.xpath("(//button[@class=\"btn btn-danger btn-sm pull-left mdc-ripple-upgraded\"])[1]");
    public ModulesBase(WebDriver driver) {
        super(driver);
    }

    public void moving (){
        dragAndDropElement(moveButton,targetMoveButton);
    }

    public void clickOnModuleButton(){
        clickOnElement(moduleButton);
    }

    public void clickOnCheckbox(){
        clickOnElement(checkboxBtn);
    }

    public void clickOnSittingButton(){
        clickOnElement(settingButton);
    }

}

