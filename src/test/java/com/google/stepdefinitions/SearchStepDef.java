package com.google.stepdefinitions;

import com.google.pages.GoogleMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.ConfigReader;
import utils.DriverHelper;

public class SearchStepDef {

    WebDriver driver = DriverHelper.getDriver();
    GoogleMainPage googleMainPage = new GoogleMainPage(driver);

    @Given("User navigate to the Google")
    public void user_navigate_to_the_google() {
        driver.get(ConfigReader.readProperty("googleurl"));
    }

    @When("user searches for CodeFish")
    public void user_searches_for_code_fish() {
        googleMainPage.validateHappySearch("CodeFish");
    }

    @Then("user gets more than ten links on the first page")
    public void user_gets_more_than_ten_links_on_the_first_page() {
        Assert.assertTrue(googleMainPage.validateNumberOfLinks(10));
    }

    @When("User search for Kyrgyz food in USA")
    public void user_search_for_kyrgyz_food_in_usa() {
        googleMainPage.validateHappySearch("Kyrgyz food in USA");
    }

    @Then("User gets a number of results more than one hundred million result")
    public void user_gets_a_number_of_results() {
      googleMainPage.validateResultFromSearch(10000000);
       // googleMainPage.validateNumberOfResult();
    }

    @When("User searches for Turkish Baklava")
    public void user_searches_for_turkish_baklava() {
        googleMainPage.validateHappySearch("Turkish Baklava");
    }
    @Then("User validates searches is done less than one sec")
    public void user_validates_searches_is_done_less_than_one_sec() {

    }


}
