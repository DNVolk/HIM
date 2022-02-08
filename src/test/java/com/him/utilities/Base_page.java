package com.him.utilities;

import org.openqa.selenium.support.PageFactory;

public class Base_page {
    //this is to inherit
    public Base_page (){PageFactory.initElements(Driver.getDriver(), this);}
}
