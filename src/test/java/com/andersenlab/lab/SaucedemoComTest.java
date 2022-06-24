package com.andersenlab.lab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SaucedemoComTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='user-name']"))));
        element.sendKeys("standard_user");

        element.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce", Keys.ENTER);

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"))));
        element.click();

        element.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span")).click();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='checkout']"))));
        element.click();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='first-name']"))));
        element.sendKeys("Dmitry");

        element.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Pestunou");

        element.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("60-476");

        element.findElement(By.xpath("//*[@id='continue']")).click();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='finish']"))));
        element.click();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='checkout_complete_container']/h2"))));
        if(element != null){
            System.out.println("test - done!");
        }

        driver.close();

    }
}
