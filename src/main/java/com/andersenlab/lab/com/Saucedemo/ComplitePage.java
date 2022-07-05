package com.andersenlab.lab.com.Saucedemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ComplitePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    WebElement congratulationsText;

    public ComplitePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchCongratulationsText(){
        assertTrue(congratulationsText.getText().equals("THANK YOU FOR YOUR ORDER"));
    }
}
