package com.andersenlab.lab.com.Saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {

    WebDriver driver;


    @FindBy(xpath = "//*[@id='user-name']")
    WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName (String arg){
        userName.sendKeys(arg);
    }

    public void enterPassword(String arg){
        password.sendKeys(arg);
    }

    public void loginButton(){
        loginButton.click();
    }

}
