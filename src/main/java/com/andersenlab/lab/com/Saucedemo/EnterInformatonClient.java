package com.andersenlab.lab.com.Saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterInformatonClient {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='first-name']")
    WebElement firstName;

    @FindBy(xpath = "//*[@id='last-name']")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='postal-code']")
    WebElement postCode;

    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButton;

    public EnterInformatonClient (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String arg){
        firstName.sendKeys(arg);
    }

    public void enterLastName(String arg){
        lastName.sendKeys(arg);
    }

    public void enterPostCode(String arg){
        postCode.sendKeys("arg");
    }

    public void clickContinieButton(){
        continueButton.click();
    }

}
