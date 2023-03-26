package com.weborder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.security.PublicKey;

public class WebOrderFoodOrderPage {

    public WebOrderFoodOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='custom-control custom-checkbox']")
    WebElement groupOrder;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement nextButton;

    @FindBy(css = "#InviteNote")
    WebElement inviteesField;

    @FindBy(css = "#InviteList")
    WebElement inviteListField;

    @FindBy (css ="#ConfirmAddressID")
    WebElement myLocation;

    @FindBy (css = "#addressPreview")
    WebElement address;

    @FindBy(css = "#createGroupOrder")
    WebElement createGroupButton;

    @FindBy (tagName = "h1")
    WebElement header;

    @FindBy (xpath = "//p[1]")
    WebElement paragraph;

    public void clickGroupOrderAndNextButton() {
        groupOrder.click();
        nextButton.click();
    }

    public void sendKeysToInviteesField(String message){
        inviteesField.sendKeys(message);
    }

    public void sendEmailsToInviteListField(String email1, String email2){
        inviteListField.sendKeys(email1 + " , "+email2);
    }

    public void chooseAndValidateMyLocationOption(String option, String expAddress){
        BrowserUtils.selectBy(myLocation, option, "text");
        Assert.assertTrue(BrowserUtils.getText(address).contains(expAddress));
    }

    public void createGroupButton() throws InterruptedException {
        createGroupButton.click();
        Thread.sleep(1000);
    }

    public void validateHeader(String expHeader){
        Assert.assertEquals(expHeader, BrowserUtils.getText(header));
    }

    public boolean validateParagraph(String text){
        return BrowserUtils.getText(paragraph).contains(text);
    }
}
