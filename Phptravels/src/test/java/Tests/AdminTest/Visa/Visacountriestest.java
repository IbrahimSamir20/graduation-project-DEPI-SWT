package Tests.AdminTest.Visa;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Visa.Visacountries;
import Tests.TestBase.AdminTestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Visacountriestest extends AdminTestBase {
    Visacountries visa;
    AdminLoginHelper log;

    @BeforeMethod
    public void init()
    {
        visa=new Visacountries(AdminDriver);
        log=new AdminLoginHelper();

    }
    @Test
    public void whenclickonvisaalistofoptionswillshow() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        Assert.assertEquals(visa.visacountriestext,visa.gettextfromvisacountries());
    }
    @Test
    public void whenclickbackbackwewillreturntodashboeardpage() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickbackbutton();
        Thread.sleep(2000);
        Assert.assertEquals(visa.gettextofdashboardheader(),visa.dashboardtext);

    }
    @Test
    public void whenclickoncheakboxforallelemntadeletebuttonwilldisplay() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickcheakboxforallelemnt();
        Thread.sleep(2000);
        Assert.assertEquals(visa.gettextofidattributefromdeleteallbutton(),visa.delteallatributevalue);
    }
    @Test
    public void whenclickonsearchbuttonandfilldatathedatawilldisplay() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clicksearchbutton();
        Thread.sleep(2000);
        visa.fillsearchtextfield("benin");
        Thread.sleep(2000);
        visa.clickgobutton();
        Thread.sleep(2000);
        Assert.assertNotEquals(visa.gettextofbenincountry(),"benin");

    }
    @Test
    public void whenclicksearchthengothenresetyouwillbacktothelistofcountries() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clicksearchbutton();
        Thread.sleep(2000);
        visa.fillsearchtextfield("benin");
        Thread.sleep(2000);
        visa.clickgobutton();
        Thread.sleep(2000);
        visa.clickrestbutton();
        Thread.sleep(2000);
        Assert.assertEquals(visa.gettextfromafgansthantextinfromcountry(),"Afghanistan");
    }
    @Test
    public void whenclickonhundredelemntbuttoncheakifhundredcountrieswilldisplay() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickhundredelemntbutton();
        Thread.sleep(2000);
        Assert.assertEquals("100",visa.getnumberofelmentlistwhenclickonhundred());
    }
    @Test
    public void whenclickonallthepagewilldisplaya253country() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickallelemntbutton();
        Thread.sleep(2000);
        Assert.assertEquals("253",visa.getnumberoflastelemntofcountries());
    }
    @Test
    public void whenclickonpagelevenwewillnotseefirstcountry() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickpage11button();
        Thread.sleep(2000);
        Assert.assertNotEquals(visa.firstcountrystringinfromcountry,visa.gettextofsaintmartin());
    }
    @Test
    public void whendeletethirdcountrythiscountrywillnotsee() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.deletethirdelemnt();
        Thread.sleep(3000);
        Assert.assertNotEquals(visa.getalgriatext(),visa.algeria);
    }
    @Test
    public void whenclickeditforsecendelemntandchangethenamethenamewillcahnge() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.editsecendelment();
        Thread.sleep(2000);
        visa.cleartextboxforedit();
        visa.filledittextbox(visa.albaniaedited);
        Thread.sleep(2000);
        visa.clicksavebutton();
        Thread.sleep(2000);
        Assert.assertEquals(visa.albaniaedited,visa.getsecendcountryname());
    }
    @Test
    public void whenclickontocountrybuttonsamepagewilldisplaywithsameoptions() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickontocountry();
        Thread.sleep(2000);
        Assert.assertEquals(visa.gettextfromafgansthantextinfromcountry(),visa.gettextfromafgansthantextintocountry());
    }
    @Test
    public void whenclickaddbuttonandandcountrythecountrywilldisplayonthelist() throws InterruptedException {
        log.adminLogin();
        visa.clickvisa();
        Thread.sleep(2000);
        visa.clickvisacountries();
        Thread.sleep(2000);
        visa.clickaddbutton();
        Thread.sleep(2000);
        visa.filladdnickname(visa.egypt);
        Thread.sleep(2000);
        visa.clicksavebutton();
        Thread.sleep(2000);
        visa.clickpage11button();
        Thread.sleep(2000);
        Assert.assertEquals(visa.getvalueofaddedelemnt(),visa.egypt);
    }





}
