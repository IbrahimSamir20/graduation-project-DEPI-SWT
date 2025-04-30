package Tests.AdminTest.Cars;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Cars.carsuggestions;
import Tests.TestBase.AdminTestBase;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Tests.TestBase.AdminTestBase.AdminDriver;

public class CarsuggestionsTest extends AdminTestBase {
    carsuggestions carg;
    AdminLoginHelper log;
    @BeforeMethod
    public void init()
    {
        carg=new carsuggestions(AdminDriver);
        log=new AdminLoginHelper();
    }
    @Test
    public void WhenGoToSearchBarAndClickSearchTheDataYouSearchWithWillDisplay() throws InterruptedException {
        log.adminLogin();
        Thread.sleep(2000);
        carg.clickcarsbutton();
        Thread.sleep(2000);
        carg.clicksubbuttonsugeestedcars();
        Thread.sleep(2000);
        carg.clicksearchbutton();
        Thread.sleep(2000);
        carg.writeontextfield("DXB");
        Thread.sleep(2000);
        carg.clickgobutton();
        Thread.sleep(2000);
        Assert.assertEquals("DXB",carg.getnameofstringlist());
    }
    @Test
    public void whenclickoncheakboxforselectalloranyoptionanewbuttonfordeletewilldisplay() throws InterruptedException {
        log.adminLogin();
        Thread.sleep(2000);
        carg.clickcarsbutton();
        Thread.sleep(2000);
        carg.clicksubbuttonsugeestedcars();
        Thread.sleep(2000);
        carg.clickselectallbutton();
        Thread.sleep(2000);
        Assert.assertEquals("deleteAll",carg.clickfulldeletebutton());
    }
    @Test
    public void whenclickonceditbuttonthecahangeswillapperonouterlist() throws InterruptedException {
        log.adminLogin();
        Thread.sleep(2000);
        carg.clickcarsbutton();
        Thread.sleep(2000);
        carg.clicksubbuttonsugeestedcars();
        Thread.sleep(2000);
        carg.clickeditforlastelemnt();
        Thread.sleep(2000);
        carg.clearcityairporttextbox();
        carg.fillcityairporttextfield("LHE1");
        Thread.sleep(2000);
        carg.clicksave();
        Thread.sleep(2000);
        Assert.assertEquals(carg.getnameafteredditforlastelemntonlist(),"LHE1");
    }
    @Test
    public void whenclickdeleteelemntwhenlookatlisthewillberemoved() throws InterruptedException {
        log.adminLogin();
        Thread.sleep(2000);
        carg.clickcarsbutton();
        Thread.sleep(2000);
        carg.clicksubbuttonsugeestedcars();
        Thread.sleep(2000);
        carg.clickdelete7thelemnt();
        Thread.sleep(2000);
        Assert.assertNotEquals(carg.gettextfortheremovedelemnt(),"LHE");
    }
    @Test
    public void whenclickonaddbuttontheaddedcarwilladdedtolist() throws InterruptedException {
        log.adminLogin();
        Thread.sleep(2000);
        carg.clickcarsbutton();
        Thread.sleep(2000);
        carg.clicksubbuttonsugeestedcars();
        Thread.sleep(2000);
        carg.clickaddbutton();
        Thread.sleep(2000);
        carg.textboxcityairport("lno");
        Thread.sleep(2000);
        carg.clicksave();
        Thread.sleep(2000);
        Assert.assertEquals("lno",carg.gettextfromaddedelemnt());
    }
    @Test
    public void ifyouclickreturrnyouwilldirectbackintosuggestionpage() throws InterruptedException {
        log.adminLogin();
        Thread.sleep(2000);
        carg.clickcarsbutton();
        Thread.sleep(2000);
        carg.clicksubbuttonsugeestedcars();
        Thread.sleep(2000);
        carg.clickaddbutton();
        Thread.sleep(2000);
        carg.clickreturnbutton();
        Thread.sleep(2000);
        Assert.assertEquals(carg.suggestioncars,carg.gettextfromheadofpage());
    }





}
