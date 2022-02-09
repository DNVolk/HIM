package com.him.google.pages;

import com.him.utilities.Base_page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GooglePage extends Base_page {

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;


    @FindBy (xpath = "//div[@class='yuRUbf']//a/h3")
    public List<WebElement> searchResults;

    @FindBy (xpath = "//div [@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
    public WebElement searchBtn;



}
