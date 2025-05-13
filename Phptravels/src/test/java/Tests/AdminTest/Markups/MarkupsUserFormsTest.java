package Tests.AdminTest.Markups;

import Helper.AssertionHelper;
import Helper.MarkupsHelper;
import PhptravelsPages.AdminPage.Markups.MarkupsUserForm;
import Tests.TestBase.AdminTestBase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MarkupsUserFormsTest extends AdminTestBase {
    MarkupsUserForm markupsUserForm;
    MarkupsHelper markupsHelper;
    AssertionHelper assertionHelper;
    @BeforeMethod
    public void init(){
        markupsUserForm = new MarkupsUserForm(AdminDriver);
        markupsHelper = new MarkupsHelper();
        assertionHelper = new AssertionHelper();
    
    }

    @Test
    public void testFromAddWithOutData() throws InterruptedException {
        markupsHelper.goToUserMarkupAdd();
        markupsUserForm.clickOnSaveButton();
        Thread.sleep(2000);
        assertionHelper.assertElementIsVisible(AdminDriver, By.xpath("(//*[@class=\"xcrud-action xcrud-button xcrud-red\"])[3]"));
    }
    @Test
    public void testAddFormStatusListValueIsCorrect() throws InterruptedException {
        markupsHelper.goToUserMarkupAdd();
        Thread.sleep(2000);
        markupsUserForm.fillStatusDropList("Disabled");
        Thread.sleep(2000);
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[1]"), "Disabled");

    }
    @Test
    public void testAddFormUserMarkupValueIsCorrect() throws InterruptedException {
        markupsHelper.goToUserMarkupAdd();
        Thread.sleep(2000);
        markupsUserForm.fillUserMarkupFiled("ibrahim");
        Thread.sleep(2000);
        assertionHelper.assertingOfTextField(AdminDriver, markupsUserForm.userMarkupFiled, "ibrahim");
    }
    @Test
    public void testAddFormUserIdList() throws InterruptedException {
        markupsHelper.goToUserMarkupAdd();
        Thread.sleep(2000);
        markupsUserForm.fillUserIdDropList("Agent@Phptravels.Com");
        Thread.sleep(2000);
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[2]"), "Agent@Phptravels.Com");

        // assertionHelper.assertingOfTextField(AdminDriver, , "ibrahim");
    }
    //there is filler cars not Cars
    @Test
    public void testAddFormTypeList() throws InterruptedException {
        markupsHelper.goToUserMarkupAdd();
        Thread.sleep(2000);
        markupsUserForm.fillTypeList("cars");
        Thread.sleep(2000);
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[3]"), "cars");

    }

    @Test
    public void testEditFormForMarkupsIsSelectFirstRow() throws InterruptedException {
        markupsHelper.gotToUserMarkupEditFirstRow();
        Thread.sleep(2000);
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[1]"), "Enabled");
        assertionHelper.assertingOfTextField(AdminDriver, markupsUserForm.userMarkupFiled, "");
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[2]"), "- None -");
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[3]"), "Flights");
    }

    @Test
    public void testEditFormForMarkupsWithValidData() throws InterruptedException{
        markupsHelper.gotToUserMarkupEditFirstRow();
        Thread.sleep(2000);
        markupsUserForm.fillStatusDropList("Disabled");
        Thread.sleep(2000);
        markupsUserForm.fillUserMarkupFiled("ibrahim");
        Thread.sleep(2000);
        markupsUserForm.fillUserIdDropList("Agent@Phptravels.Com");
        markupsUserForm.fillTypeList("cars");
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[1]"), "Disabled");
        assertionHelper.assertingOfTextField(AdminDriver, markupsUserForm.userMarkupFiled, "ibrahim");
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[2]"), "Agent@Phptravels.Com");
        assertionHelper.assertDropListSelection(AdminDriver, By.xpath("(//span[@class=\"select2-selection__rendered\"])[3]"), "Cars");
        Thread.sleep(2000);
        markupsUserForm.clickOnSaveButton();
    }

}
