package Tests.AdminTest.Modules;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Modules.ModulesBase;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModulesTest extends AdminTestBase {
    ModulesBase modulesBase ;
    AdminLoginHelper login;

    @BeforeMethod
    public void init(){
        modulesBase = new ModulesBase(AdminDriver);
        login = new AdminLoginHelper();
    }

//    test cases
    @Test
    public void moveElementToDrag() throws InterruptedException {
        login.adminLogin();
        modulesBase.clickOnModuleButton();
        modulesBase.moving();
    }

    @Test
    public void testCheckboxBtnIsWorking() throws InterruptedException {
        login.adminLogin();
        modulesBase.clickOnModuleButton();
        modulesBase.clickOnCheckbox();
    }

    @Test
    public void testSittingButtonIsWorking() throws InterruptedException {
        login.adminLogin();
        modulesBase.clickOnModuleButton();
        modulesBase.clickOnSittingButton();
    }
}
