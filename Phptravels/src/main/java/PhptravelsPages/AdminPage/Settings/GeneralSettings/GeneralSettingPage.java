package PhptravelsPages.AdminPage.Settings.GeneralSettings;
import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GeneralSettingPage extends PageBase {
    //************************ Main Settings & Website Theme ******************************
    By BusinessName =By.xpath("(//*[@class=\"form-control\"])[1]");
    By DomainName =By.xpath("(//*[@class=\"form-control\"])[2]");
    By LicenseKey =By.xpath("(//*[@class=\"form-control\"])[3]");
    By WebsiteOfflineDropList =By.xpath("//*[@class=\"form-select site_offline\"]");
    By WebsiteOfflineOption =By.xpath("(//*[@value=\"1\"])[1]");
    By DefaultColor =By.xpath("(//*[@class=\"form-control\"])[5]");
    By ThemeNameDropList =By.xpath("(//*[@class=\"form-select\"])[1]");
    By ThemeNameOption =By.xpath("//*[@value=\"airbnb\"]");
    By UpdatingSettingButton1 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[1]");
    //**************************************** SEO ****************************************
    By MetaTitle =By.xpath("(//*[@class=\"form-control\"])[6]");
    By MetaDescription =By.xpath("(//*[@class=\"form-control\"])[7]");
    By XMLSitemap =By.xpath("//*[@class=\"btn-block btn btn-warning w-100\"]");
    By UpdatingSettingButton2 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[2]");
    //************************************* Accounts **************************************
    By GuestBookingDropList =By.xpath("//*[@class=\"form-select guest_booking\"]");
    By GuestBookingOption =By.xpath("(//*[@value=\"1\"])[2]");
    By UsersRegistrationDropList =By.xpath("(//*[@class=\"form-select\"])[2]");
    By UsersRegistrationOption =By.xpath("(//*[@value=\"1\"])[3]");
    By SuppliersRegistrationDropList =By.xpath("(//*[@class=\"form-select\"])[3]");
    By SuppliersRegistrationOptions =By.xpath("(//*[@value=\"1\"])[4]");
    By AgentsRegistrationDropList =By.xpath("(//*[@class=\"form-select\"])[4]");
    By AgentsRegistrationOptions =By.xpath("(//*[@value=\"1\"])[5]");
    By UpdatingSettingButton3 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[3]");
    //********************************** System Settings **********************************
    By TrackingAndAnalytics =By.xpath("(//*[@class=\"form-control\"])[8]");
    By UpdatingSettingButton4 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[4]");
    //************************************* Contact ***************************************
    By Address =By.xpath("(//*[@class=\"form-control\"])[9]");
    By AddressOnMap =By.xpath("(//*[@class=\"form-control\"])[10]");
    By ContactEmail =By.xpath("(//*[@class=\"form-control\"])[11]");
    By ContactPhone =By.xpath("(//*[@class=\"form-control\"])[12]");
    By UpdatingSettingButton5 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[5]");
    //********************************* App Stores Links **********************************
    By AndroidStoreLink =By.xpath("(//*[@class=\"form-control\"])[13]");
    By IOSStoreLink =By.xpath("(//*[@class=\"form-control\"])[14]");
    By ShowAppsDropList =By.xpath("(//*[@class=\"form-select\"])[5]");
    By ShowAppsOption =By.xpath("(//*[@value=\"1\"])[6]");
    By UpdatingSettingButton6 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[6]");
    //************************************ Branding And Favicon  ***************************************
    By BusinessLogo =By.xpath("(//*[@class=\"btn btn-light\"])[1]");
    By Favicon =By.xpath("(//*[@class=\"btn btn-light\"])[2]");
    By UpdatingSettingButton7 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[7]");
    //************************************ Homepage Cover ****************************************
    By HomepageCover =By.xpath("(//*[@class=\"btn btn-light\"])[3]");
    By UpdatingSettingButton8 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[8]");
    //****************************** Language & Currencies ********************************
    By MultiLanguageDropList =By.xpath("(//*[@class=\"form-select\"])[6]");
    By MultiLanguageOption =By.xpath("(//*[@value=\"1\"])[7]");
    By MultiCurrencyDropList =By.xpath("(//*[@class=\"form-select\"])[7]");
    By MultiCurrencyOption =By.xpath("(//*[@value=\"1\"])[8]");
    By UpdatingSettingButton9 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[9]");
    //********************************** Social Links *************************************
    By FaceBook =By.xpath("(//*[@class=\"form-control\"])[15]");
    By Twitter =By.xpath("(//*[@class=\"form-control\"])[16]");
    By Linkedin =By.xpath("(//*[@class=\"form-control\"])[17]");
    By Instagram =By.xpath("(//*[@class=\"form-control\"])[18]");
    By Google =By.xpath("(//*[@class=\"form-control\"])[19]");
    By Youtube =By.xpath("(//*[@class=\"form-control\"])[20]");
    By WhatsApp =By.xpath("(//*[@class=\"form-control\"])[21]");
    By UpdatingSettingButton10 =By.xpath("(//*[@class=\"btn-block btn btn-primary\"])[10]");
    //***************************************************************************************
    By BackButton =By.xpath("//*[@class=\"loading_effect btn btn-warning\"]");
    public GeneralSettingPage(WebDriver driver) {
        super(driver);
    }
    //************************ Main Settings & Website Theme ******************************
    public void BusinessName(String name){
        sendKeys(BusinessName,name);
    }
    public void DomainName(String name){
        sendKeys(DomainName,name);
    }
    public void LicenseKey (String key){
        sendKeys(LicenseKey,key);
    }
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    public void upDateMainSettings (){
        clickOnElement(UpdatingSettingButton1);
    }
    //**************************************** SEO ****************************************
    public void  MetaTitle (String title){
        sendKeys(MetaTitle,title);
    }
    public void MetaDescription(String description){
        sendKeys(MetaDescription,description);
    }
    public void XMLSitemap(){
        clickOnElement(XMLSitemap);
    }
    public void upDateSEO(){
        clickOnElement(UpdatingSettingButton2);
    }
    //************************************* Accounts **************************************
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    public void upDateAccounts(){
        clickOnElement(UpdatingSettingButton3);
    }
    //********************************** System Settings **********************************
    public void trackingAndAnalytics(String code){
        sendKeys(TrackingAndAnalytics,code);
    }
    public void upDateSystemSettings (){
        clickOnElement(UpdatingSettingButton4);
    }
    //************************************* Contact ***************************************
    public void address(String address){
        sendKeys(Address,address);
    }
    public void addressOnMap (String address){
        sendKeys(AddressOnMap,address);
    }
    public void contactEmail(String email){
        sendKeys(ContactEmail,email);
    }
    public void contactPhone(String phone){
        sendKeys(ContactPhone,phone);
    }
    public void ubDateContact(){
        clickOnElement(UpdatingSettingButton5);
    }
    //********************************* App Stores Links **********************************
    public void androidStoreLink(String link){
        sendKeys(AndroidStoreLink,link);
    }
    public void iosStoreLink(String link){
        sendKeys(IOSStoreLink,link);
    }
    //public void (){}
    //public void (){}
    public void upDateAppStoresLinks(){
        clickOnElement(UpdatingSettingButton6);
    }
    //************************************ Branding And Favicon  ***************************************
    public void businessLogo(){
        clickOnElement(BusinessLogo);
    }
    public void favicon(){
        clickOnElement(Favicon);
    }
    public void upDateBrandingAndFavicon(){
        clickOnElement(UpdatingSettingButton7);
    }
    //************************************ Homepage Cover ****************************************
    public void homepageCover(){
        clickOnElement(HomepageCover);
    }
    public void upDateHomepageCover(){
        clickOnElement(UpdatingSettingButton8);
    }
    //****************************** Language & Currencies ********************************
    //public void (){}
    //public void (){}
    //public void (){}
    //public void (){}
    public void upDateLanguageAndCurrencies (){
        clickOnElement(UpdatingSettingButton9);
    }
    //********************************** Social Links *************************************
    public void faceBookLink(String link){
        sendKeys(FaceBook,link);
    }
    public void twitterLink(String link){
        sendKeys(Twitter,link);
    }
    public void linkedinLink(String link){
        sendKeys(Linkedin,link);
    }
    public void googleLink(String link){
        sendKeys(Google,link);
    }
    public void youtubeLink(String link){
        sendKeys(Youtube,link);
    }
    public void whatsAppLink(String link){
        sendKeys(WhatsApp,link);
    }
    public void updateSocialLinks(){
        clickOnElement(UpdatingSettingButton10);
    }
}