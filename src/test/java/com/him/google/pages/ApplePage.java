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


    public WebElement getMenuItem(String menuItem) {
        return parentOfMenuItems.findElement(By.xpath(".//li/a[ ./span[.='" + menuItem + "'] ]" ));

    }


}
