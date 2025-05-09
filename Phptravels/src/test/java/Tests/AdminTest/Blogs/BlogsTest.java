package Tests.AdminTest.Blogs;
import Helper.AdminLoginHelper;
import PhptravelsPages.AdminPage.Blogs.BlogsBase;
import Tests.TestBase.AdminTestBase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import PhptravelsPages.AdminPage.AdminLoginPage.AdminLoginPage;
import utils.DriverManager;

import java.sql.DriverManager;

public class BlogsTest extends AdminTestBase {
BlogsBase blogcat;
    AdminLoginHelper login;
    @BeforeMethod
    public void init(){
        blogcat=new BlogsBase(AdminDriver);
        login =new AdminLoginHelper();
    }
    @Test
    public void addCategoryWithValidData() throws InterruptedException {
        login.adminLogin();
blogcat.clickOnBlog();
blogcat.clickOnBlogCat();
blogcat.clickAddButton();
blogcat.fillCatNameField("hello");
blogcat.fillCatSlugField("hello");
blogcat.clicksavebutton();

    }
    @Test
    public void addCategoryWithoutData() throws InterruptedException {
        login.adminLogin();
        blogcat.clickOnBlog();
        blogcat.clickOnBlogCat();
        blogcat.clickAddButton();
        blogcat.fillCatNameField("");
        blogcat.fillCatSlugField("");
        blogcat.clicksavebutton();

    }

}