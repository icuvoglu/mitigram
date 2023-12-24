package com.mitigram.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CareersPage extends BasePage {

    @FindBy(id = "ff_elem1178")
    public WebElement selectCountry;

    @FindBy(id = "ff_elem1194")
    public WebElement interestedIn;

    @FindBy(id = "bfSubmitButton")
    public WebElement contactUsBtn;

    //Assume that there is a success message on the UI
    @FindBy(id = "successMsg")
    public WebElement successMessage;

    public WebElement getButton(String name) {
        return Driver.get().findElement(By.xpath("//a[.='" + name + "']"));
    }

    public WebElement getButtonForSelected(String name) {
        return Driver.get().findElement(By.xpath("//div[@aria-hidden='false']//a[.='" + name + "']"));
    }

    public WebElement inputFieldFor(String area) {
        return Driver.get().findElement(By.xpath("//input[contains(@name,'" + area + "')]"));
    }


}
