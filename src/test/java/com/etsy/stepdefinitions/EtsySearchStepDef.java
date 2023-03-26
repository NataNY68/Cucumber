package com.etsy.stepdefinitions;

import com.etsy.pages.EtsyMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsySearchStepDef {
    WebDriver driver = DriverHelper.getDriver();
    EtsyMainPage etsyMainPage = new EtsyMainPage(driver);

    @Given("User searches for {string} for Etsy WebPage")
    public void user_searches_for_for_etsy_web_page(String searchItem) {
        etsyMainPage.searchingItem(searchItem);
    }

    @Then("User validates the Title {string} from Etsy")
    public void user_validates_the_title_from_etsy(String title) {
        Assert.assertEquals(title, driver.getTitle().trim());
    }
}
