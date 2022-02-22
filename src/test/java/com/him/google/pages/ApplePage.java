package com.him.google.pages;

import com.him.utilities.Base_page;
import com.him.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplePage extends Base_page {

    @FindBy(xpath = "//ul[@class='ac-gn-list']//li/a/span")
    public List<WebElement> menuItems;
    @FindBy(xpath = "//ul[@class='ac-gn-list']")
    public WebElement parentOfMenuItems;
    @FindBy (xpath= "//ul/li/a[@data-analytics-title='buy -  iphone 13 pro']")
    public WebElement buyIphone13ProBtn;
    @FindBy(xpath="//div/div/fieldset[@class='rc-dimension rf-flagship-productselection-dimension rf-flagship-productselection-dimensionscreensize']" )
    WebElement capacityOptions;

    public WebElement getMenuItem(String menuItem) {
        return parentOfMenuItems.findElement(By.xpath(".//li/a[ ./span[.='" + menuItem + "'] ]" ));

    }

//    public WebElement getCapacityOptions13Pro(String capacity13Pro){
//        return capacityOptions.findElement(By.xpath(""))
//    }


}
