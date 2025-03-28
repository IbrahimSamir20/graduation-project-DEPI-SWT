package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.phpfirstpage;
import pages.tourspage;

public class phptest extends testbase{
    phpfirstpage obj;
    tourspage obj1;
    @BeforeMethod
    public void init()
    {
        obj=new phpfirstpage(driver);
        obj1=new tourspage(driver);
    }
    @Test
    public void observeNoFoundtextwhenenteracitynotfounded() throws InterruptedException {
        obj.clicktoursbutton();
        obj.setClicksearchbycity();
        obj.fillsearchbycity("jad");
        Thread.sleep(4000);
        Assert.assertEquals(obj.noresultfoundtext,obj.gettextfromnosearchfoundelement());
    }
    @Test
    public void cheakifthelistofpopulartoursopenwhenclick() throws InterruptedException {
        obj.clicktoursbutton();
        obj.setClicksearchbycity();
        Thread.sleep(4000);
        Assert.assertEquals(obj.mostpopulartourtext,obj.gettextfrommostpopulartourelemnt());
    }
    @Test
    public void whenclicksearchwithvaliddatawewillgototourspage() throws InterruptedException {
        obj.clicktoursbutton();
        obj.clickdatefield();
        obj.Movethedatelisttorightonetime();
        obj.choosedatefromdatefield();
        obj.setClicksearchbycity();
        obj.fillsearchbycity("jed");
        obj.choosejeddahfromlistofpopulartours();
        obj.clickonblueiconsearchbutton();
        Thread.sleep(5000);
        Assert.assertEquals(obj1.starratingonleftbar,obj1.starelemntratinggettext());
    }
    @Test
    public void changenaumberoftravllerwilldisplayonthebox() throws InterruptedException {
        obj.clicktoursbutton();
        obj.clicktravllernumberbutton();
        for(int x=0;x<3;x++) {
            obj.increasenumberofadulttravllerby1();
        }
        Thread.sleep(5000);
        Assert.assertEquals(obj.getnumberofadulttravllers(),obj.getnumberoftravlersonlist());
    }
    @Test
    public void enterzeronumberoftravllerandclicksearch() throws InterruptedException {
        obj.clicktoursbutton();
        obj.clicktravllernumberbutton();
        obj.decreasethenumberofadulttravller();
        obj.clickonblueiconsearchbutton();
        Thread.sleep(5000);
    }


}
