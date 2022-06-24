package com.andersenlab.lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoqaComTest {

    public static void main(String[] args) {

        test1();
        test2();
        test3();

    }

    public static void test1(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://demoqa.com/text-box");

        WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='userName']"))));
        element.sendKeys("Dmitry Pestunov");

        driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("test@teting.ts");

        driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("poznan");

        driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Gomel");

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='submit']"))).click();

    }

    public static void test2(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");

        WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='tree-node']/ol/li/span/button"))));
        element.click();

        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/button")).click();

        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button")).click();

        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/button")).click();

        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label")).click();

        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]"))
                .click();

        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]")).click();

    }

    public static void test3() {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://demoqa.com/buttons");

        WebElement webElement = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));

        actions.moveToElement(webElement).doubleClick().build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='rightClickBtn']")))
                .contextClick().build().perform();
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")))
                .click().build().perform();

    }

}
