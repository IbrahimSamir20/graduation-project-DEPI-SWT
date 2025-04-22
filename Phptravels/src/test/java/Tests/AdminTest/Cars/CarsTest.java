package Tests.AdminTest.Cars;

import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Cars.Cars;
import Tests.TestBase.AdminTestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarsTest extends AdminTestBase {
    Cars car;
    AdminLoginHelper login;
    @BeforeMethod
    public void init(){
                car=new Cars(AdminDriver);
                login=new AdminLoginHelper();
    }
    @Test
    public void CheakWhenClickOnCarsCarsOptionsShowen() throws InterruptedException {
       login.adminLogin();
       Thread.sleep(2000);
        car.clickcarsbutton();
        Thread.sleep(2000);
        Assert.assertEquals(car.StringSuggestedcars,car.cheakwhenclickoncarsansugestedcarsandcarsbuttonswillshowen());
        Thread.sleep(2000);
    }
    @Test
    public void cheakwhenclickonsubbuttoncarsapagewithcarswilldisplay() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        car.clickcarsbutton();
        Thread.sleep(2000);
        car.clicksubbuttoncars();
        Thread.sleep(2000);
        Assert.assertEquals(car.Stringcars,car.cheakwhenclickonsubbuttoncarsapagewithcarswilldisplay());
    }
    @Test
    public void whenclickonaddbuttonapagewithdatatofilltoaddnewcarwilldisplay() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        car.clickcarsbutton();
        Thread.sleep(2000);
        car.clicksubbuttoncars();
        Thread.sleep(2000);
        car.clickaddbutton();
        Thread.sleep(2000);
        Assert.assertEquals(car.cardeatailsonaddbutton,car.cheakwhenclickonaddbuttonadatatofillwilldisplaytoaddnewcar());
        Thread.sleep(2000);
    }
    @Test
    public void whenclickaddandfilldatathenclicksaveacaryouaddshoulddisplayoncarswiththesamedata() throws InterruptedException {
        login.adminLogin();
        Thread.sleep(2000);
        car.clickcarsbutton();
        Thread.sleep(2000);
        car.clicksubbuttoncars();
        Thread.sleep(2000);
        car.clickaddbutton();
        Thread.sleep(2000);
        car.clickstatuslist();
        Thread.sleep(2000);
        car.clickstatuslistandchooseenabled();
        Thread.sleep(2000);
        car.clickfeatureslist();
        Thread.sleep(2000);
        car.writeyes();
        Thread.sleep(2000);
        car.clickfeatureslistandchooseyes();
        Thread.sleep(2000);
        car.enternameonnamefield("hundai");
        Thread.sleep(2000);
        car.clickremove();
        Thread.sleep(2000);
//        car.clickaddphoto();
//        Thread.sleep(2000);
        car.clickcurrency();
        Thread.sleep(2000);
        car.clickoncurrencyfield();
        Thread.sleep(2000);
        car.clickeuroncurrency();
        Thread.sleep(2000);
        car.clickonstarslist();
        Thread.sleep(2000);
        car.choose2fromstarslist();
        Thread.sleep(2000);
        car.fillprice();
        Thread.sleep(2000);
        car.clicksave();
        Thread.sleep(3000);
    }

}
