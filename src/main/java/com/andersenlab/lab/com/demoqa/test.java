package com.andersenlab.lab.com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/buttons");


//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='doubleClickBtn']")));

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='doubleClickBtn']")))
                .doubleClick().build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='rightClickBtn']")))
                .contextClick().build().perform();
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")))
                .click().build().perform();


    }
}
