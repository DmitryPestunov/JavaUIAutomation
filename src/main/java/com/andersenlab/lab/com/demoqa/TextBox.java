package com.andersenlab.lab.com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextBox {

    WebDriver driver;
    Actions actions;

    @FindBy(xpath = "//*[@id='userName']")
    WebElement userName;

    @FindBy(xpath = "//*[@id='userEmail']")
    WebElement userEmail;

    @FindBy(xpath = "//*[@id='currentAddress']")
    WebElement currentAddress;

    @FindBy(xpath = "//*[@id='permanentAddress']")
    WebElement permanentAddress;

    @FindBy(xpath = "//*[@id='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id='output']")
    WebElement outputTable;

    public TextBox(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterName (String arg){
        userName.sendKeys(arg);
    }

    public void enterEmail(String arg){
        userEmail.sendKeys(arg);
    }

    public void enterCurrentAddress(String arg){
        currentAddress.sendKeys(arg);
    }

    public void enterPermanentAddress(String arg){
        permanentAddress.sendKeys(arg);
    }

    public void submitButton(){
        actions.moveToElement(submitButton).click();
    }

    public void checkEnter(){
        assertTrue(outputTable.getAttribute("id").equals("output"));
    }
}
