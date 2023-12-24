package com.mitigram.stepdefinitions;

import com.mitigram.pages.CareersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.*;

public class CareersPageStepDefs extends CareersPage {


    @Given("user clicks {string} button")
    public void user_clicks_button(String name) {
        getButton(name).click();
    }

    @Given("user clicks {string} button for selected position")
    public void user_clicks_button_for_selected_position(String name) {
        getButtonForSelected(name).click();
    }

    @When("user fills the application form")
    public void user_fills_the_application_form() {
        inputFieldFor("firstName").sendKeys("Ibrahim");
        inputFieldFor("lastName").sendKeys("Cuvoglu");
        inputFieldFor("company").sendKeys("Mitigram");
        Select select = new Select(selectCountry);
        select.selectByVisibleText("Sweden");
        inputFieldFor("email").sendKeys("icuvoglu@gmail.com");
        select = new Select(interestedIn);
        select.selectByVisibleText("Careers");
    }

    @When("User click Contact Us button")
    public void user_click_contact_us_button() {
        contactUsBtn.click();
    }

    @Then("verify success message is displayed")
    public void verify_success_message_is_displayed() {
        assertTrue(successMessage.isDisplayed());
    }
}
