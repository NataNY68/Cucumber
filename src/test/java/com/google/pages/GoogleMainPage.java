package com.google.pages;

import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.junit.internal.runners.statements.FailOnTimeout;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class GoogleMainPage {

    public GoogleMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='Search']")
    WebElement searchBar;

    @FindBy(xpath = "//a//h3")
    List<WebElement> allLinks;

    @FindBy(xpath = "//div[@id='result-stats']")
    WebElement resultsMessage;

    @FindBy(xpath = "//div//nobr")
    WebElement searchTiming;

    public void validateHappySearch(String text){
        searchBar.sendKeys(text, Keys.ENTER);
    }

    public boolean validateNumberOfLinks(int number){
        return (allLinks.size()>number);
    }

//    public void validateNumberOfResult(){
//        String res = BrowserUtils.getText(resultsMessage);
//        String num="";
//        for (int i=0; i<res.length(); i++){
//            if (Character.isDigit(res.charAt(i))){
//               num+=res.charAt(i);
//            }else {
//                res = res.replace(res.substring(i,i+1), "");
//            }
//        }
//        int result = Integer.parseInt(num);
//        System.out.println(result);
//       // Assert.assertTrue(result==1810000004);
//    }

    public boolean  validateResultFromSearch(int number){
        String[] result = BrowserUtils.getText(resultsMessage).split(" ");
        return Double.parseDouble(result[1].replace(",",""))>number;
    }

    public boolean validateSearchingTime(){
        String[] time = BrowserUtils.getText(searchTiming).split(" "); //(0.47; seconds)
        return Double.parseDouble(time[0].substring(1))<1.0;
    }


}
