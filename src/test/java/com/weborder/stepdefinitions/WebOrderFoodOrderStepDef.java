package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderFoodOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderFoodOrderStepDef {

    WebDriver driver = DriverHelper.getDriver();
    WebOrderFoodOrderPage webOrderFoodOrderPage = new WebOrderFoodOrderPage(driver);

    @When("User clicks Group Order and Next Button")
    public void user_clicks_group_order_and_next_button() {
        webOrderFoodOrderPage.clickGroupOrderAndNextButton();
    }

    @When("User send the word {string} for note to the Invitees Section")
    public void user_send_the_word_for_note_to_the_invitees_section(String message) {
        webOrderFoodOrderPage.sendKeysToInviteesField(message);
    }

    @When("User sends e-mails addresses which are {string} and {string} to the Invite List")
    public void user_sends_e_mails_addresses_which_are_and_to_the_invite_list(String email1, String email2) {
        webOrderFoodOrderPage.sendEmailsToInviteListField(email1, email2);
    }

    @When("User chooses the delivery address {string} and validates the address {string}")
    public void user_chooses_the_delivery_address_and_validates_the_address(String option, String expAddress) {
        webOrderFoodOrderPage.chooseAndValidateMyLocationOption(option, expAddress);
    }

    @When("User clicks the create Group Order Button")
    public void user_clicks_the_create_group_order_button() throws InterruptedException {
        webOrderFoodOrderPage.createGroupButton();
    }

    @Then("User validates the header of page {string}")
    public void user_validates_the_header_of_page(String expHeader) {
        webOrderFoodOrderPage.validateHeader(expHeader);
    }

    @Then("User validates the word {string} from description")
    public void user_validates_the_word_from_description(String text) {
        Assert.assertTrue(webOrderFoodOrderPage.validateParagraph(text));
    }

}
