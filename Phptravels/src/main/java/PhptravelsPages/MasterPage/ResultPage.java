/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhptravelsPages.MasterPage;

import PhptravelsPages.PageBase.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Basmala
 */
public class ResultPage extends PageBase{
     By flightWay=By.xpath("//*[@class=\"logo p-1 rounded\"]");
    public ResultPage(WebDriver driver) {
        super(driver);
    }
    public boolean isAppeared(){
        if(isAPPeared(flightWay)){
            return true;
        }
        return false;
    }
}
