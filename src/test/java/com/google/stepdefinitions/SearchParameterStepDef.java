package com.google.stepdefinitions;

import com.google.pages.GoogleMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SearchParameterStepDef {

    WebDriver driver = DriverHelper.getDriver();
    GoogleMainPage googleMainPage = new GoogleMainPage(driver);

    @Given("User navigates to the {string}")
    public void user_navigates_to_the(String url) {
        driver.get(url);
    }

    @When("user searches for {string}")
    public void user_searches_for(String text) {
        googleMainPage.validateHappySearch(text);
    }

    @Then("user gets more than {int} links from first page")
    public void user_gets_more_than_links_from_first_page(int link) {
        Assert.assertTrue(googleMainPage.validateNumberOfLinks(link));
    }

    @Then("User validates a number of results more than {int}")
    public void user_gets_a_number_of_results_more_than(int expResult) {
        Assert.assertTrue(googleMainPage.validateResultFromSearch(expResult));
    }

}
