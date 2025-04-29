package Tests.AdminTest.Users;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Users.Adminuser;
import Tests.TestBase.AdminTestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class adminusertest extends AdminTestBase {
    Adminuser user;
    AdminLoginHelper log;
    @BeforeMethod
    public void init()
    {
        user=new Adminuser(AdminDriver);
        log=new AdminLoginHelper();
    }
    @Test
    public void whenclickonuseralistwithuserscanacsseswebsitewilldisplay() throws InterruptedException {
        log.adminLogin();
        user.clickonusers();
        Thread.sleep(2000);
        Assert.assertEquals(user.Allusers,user.returntextfromallusers());
    }
    @Test
    public void whenclickonadminanadminpagewilldisplay() throws InterruptedException {
        log.adminLogin();
        user.clickonusers();
        Thread.sleep(2000);
        user.clickadminuser();
        Thread.sleep(2000);
        Assert.assertEquals(user.admin,user.returntextadmn());
    }
    @Test
    public void whenclickonsearchandentervalueforfirstnamethenclickgo() throws InterruptedException {
        log.adminLogin();
        user.clickonusers();
        Thread.sleep(2000);
        user.clickadminuser();
        Thread.sleep(2000);
        user.clickonsearch();
        Thread.sleep(1000);
        user.fillsearchfield("Super");
        Thread.sleep(1000);
        user.clickonlist();
        user.writeonlist("first");
        user.clickfirstnameonlist();
        Thread.sleep(2000);
        user.clickgobutton();
        Assert.assertEquals(user.supeR,user.returnsuper());
    }
    @Test
    public void whenclickonaddanaddadmintheaddedshouldisplayonlistthatwhenfillallrequireddata() throws InterruptedException {
        log.adminLogin();
        user.clickonusers();
        Thread.sleep(2000);
        user.clickadminuser();
        Thread.sleep(2000);
        user.clickadd();
        Thread.sleep(1000);
        user.fillfirstname("char");
        user.filllastname("dar");
        user.clickonuserlist();
        user.filluserlist("adm");
        user.clickonadmin();
        Thread.sleep(2000);
        user.clickoncuurencylist();
        user.fillcuurencylist("eu");
        user.clickoneur();
        Thread.sleep(2000);
        Thread.sleep(2000);
        user.fillemail("ziad20");
        user.fillpass("2003");
        Thread.sleep(2000);
        user.clickonsave();
        Thread.sleep(2000);
        Assert.assertEquals(user.char1,user.returndartext());
    }
@Test
    public void whendidntenetrneededvalueonaddbuttonerrormessagewilldisplay() throws InterruptedException {
        log.adminLogin();
        user.clickonusers();
        Thread.sleep(2000);
        user.clickadminuser();
        Thread.sleep(2000);
        user.clickadd();
        Thread.sleep(1000);
        user.fillfirstname("char");
        user.filllastname("dar");
        Thread.sleep(2000);
        user.clickonsave();
        Thread.sleep(1000);
        Assert.assertEquals(user.save,user.returnsave());


}
}
