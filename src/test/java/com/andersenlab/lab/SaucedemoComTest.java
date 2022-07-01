package com.andersenlab.lab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SaucedemoComTest {

    @BeforeAll
    public static void set(){
        SettingTest.set();
    }


    @Test
    public void test() {

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://www.saucedemo.com");

        assertEquals("Swag Labs", driver.getTitle());

        WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='user-name']"))));
        element.sendKeys("standard_user");

        element.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce", Keys.ENTER);

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"))));
        element.click();

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='shopping_cart_container']")))
                .click().build().perform();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='checkout']"))));
        element.click();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='first-name']"))));
        element.sendKeys("Dmitry");

        element.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Pestunou");

        element.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("60-476");

        element.findElement(By.xpath("//*[@id='continue']")).click();

        assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='finish']"))));
        element.click();

        assertTrue(driver.findElement(By.xpath("//*[@id='checkout_complete_container']/h2"))
                .getText().equals("THANK YOU FOR YOUR ORDER"));

    }
}