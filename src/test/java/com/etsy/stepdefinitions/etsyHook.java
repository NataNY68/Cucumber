package com.etsy.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class etsyHook {
    WebDriver driver = DriverHelper.getDriver();

//    @Before
//    public void setUp(){
//       // driver.get(ConfigReader.readProperty("etsyurl"));
//    }
//
//    @After
//    public void tearDown(Scenario scenario){
//        BrowserUtils.getScreenShotForCucumber(driver, scenario);
//        //driver.quit();
//    }
}
