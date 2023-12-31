package com.mitigram.pages;


import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//section[@id='g-navigation']//a[.='Log in']")
    public WebElement loginButtoninNav;

}