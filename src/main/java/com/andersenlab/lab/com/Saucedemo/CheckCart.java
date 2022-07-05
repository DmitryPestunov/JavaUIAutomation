package com.andersenlab.lab.com.Saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckCart {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='checkout']")
    WebElement checkoutButton;

    @FindBy(className = "cart_quantity")
    WebElement tableCart;

    public CheckCart(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkAdd(){
        assertTrue(tableCart.getText().equals("1"));
    }

    public void checkoutButton(){
        checkoutButton.click();
    }

}
