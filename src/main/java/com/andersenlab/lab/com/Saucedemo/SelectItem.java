package com.andersenlab.lab.com.Saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectItem {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addFirstItem;

    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    WebElement buttonShoppingCart;

    public SelectItem(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addItem(){
        addFirstItem.click();
    }

    public void clickButtonShoppingCart(){
        buttonShoppingCart.click();
    }

}
