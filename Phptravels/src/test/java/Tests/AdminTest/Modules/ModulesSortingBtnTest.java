package Tests.AdminTest.Modules;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Modules.ModulesSortingBtn;
import Tests.TestBase.AdminTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModulesSortingBtnTest extends AdminTestBase {
    ModulesSortingBtn sortingButtons ;
    AdminLoginHelper login ;

         @BeforeMethod
            public void init (){
                sortingButtons = new ModulesSortingBtn(AdminDriver);
                login = new AdminLoginHelper();
            }

            @Test
    public void testBtnSortAll() throws InterruptedException {
                login.adminLogin();
                sortingButtons.clickOnModuleButton();
                sortingButtons.clickOnSortBtnAll();
            }
            @Test
    public void testBtnSortFlights() throws InterruptedException {
                login.adminLogin();
                sortingButtons.clickOnModuleButton();
                sortingButtons.clickOnSortBtnFlights();
            }
         @Test
    public void testBtnSortHotels() throws InterruptedException {
                login.adminLogin();
                sortingButtons.clickOnModuleButton();
                sortingButtons.clickOSortBtnHotels();
            }
  @Test
    public void testBtnSortTours() throws InterruptedException {
                login.adminLogin();
                sortingButtons.clickOnModuleButton();
                sortingButtons.clickOSortBtnTours();
            }
 @Test
    public void testBtnSortCars() throws InterruptedException {
                login.adminLogin();
                sortingButtons.clickOnModuleButton();
                sortingButtons.clickOSortBtnCars();
            }
@Test
    public void testBtnSortVisa() throws InterruptedException {
                login.adminLogin();
                sortingButtons.clickOnModuleButton();
                sortingButtons.clickOSortBtnVisa();
            }


}
