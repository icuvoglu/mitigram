package com.mitigram.stepdefinitions;

import com.mitigram.pages.LoginPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static org.testng.Assert.*;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user clicks login button")
    public void clickLoginButton() {

        loginPage.loginButtoninNav.click();
        BrowserUtils.waitForUrlContains("Login");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        loginPage.email.sendKeys(ConfigurationReader.get("email"));
        loginPage.password.sendKeys(ConfigurationReader.get("password"));
    }

    @And("user clicks Log in button in Login page")
    public void userClicksLogInButtonInLoginPage() {
        loginPage.loginButtoninPage.click();
    }

    @Then("verify user navigated to home page")
    public void verifyUserNavigatedToHomePage() {
        //Assume that URL contains "home" after logged in
        assertTrue(Driver.get().getCurrentUrl().contains("home"));
    }

    @When("user enters invalid credentials as follows")
    public void userEntersAnd(Map<String, String> data) {
        loginPage.email.sendKeys(data.get("email"));
        loginPage.password.sendKeys(data.get("password"));
    }

    @Then("verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {
    }
}
