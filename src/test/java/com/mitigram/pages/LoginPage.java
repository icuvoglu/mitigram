package com.mitigram.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//section[@id='g-navigation']//a[.='Log in']")
    public WebElement loginButtoninNav;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;
//    @FindBy(xpath = "//input[@id='Email']")
//    public WebElement email;
//
//    @FindBy(xpath = "//input[@id='Password']")
//    public WebElement password;

    @FindBy(id = "loginBtn")
    public WebElement loginButtoninPage;

    @FindBy(className = "noty_body")
    public WebElement errorNoty;


}
