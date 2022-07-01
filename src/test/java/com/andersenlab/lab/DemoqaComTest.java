package com.andersenlab.lab;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoqaComTest {


    @BeforeAll
    public static void set(){
        SettingTest.set();
    }


    @Test
    public void test1(){

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://demoqa.com/text-box");
        assertEquals("ToolsQA", driver.getTitle());

        WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='userName']"))));
        element.sendKeys("Dmitry Pestunov");

        driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("test@teting.ts");

        driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("poznan");

        driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Gomel");

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='submit']"))).click();

        assertTrue(driver.findElement(By.xpath("//*[@id='output']")).getAttribute("id").equals("output"));
    }

    @Test
    public void test2(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        assertEquals("ToolsQA", driver.getTitle());

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

        assertTrue(driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText().equals("workspace"));

    }

    @Test
    public void test3() {

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://demoqa.com/buttons");
        assertEquals("ToolsQA", driver.getTitle());

        WebElement webElement = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));

        actions.moveToElement(webElement).doubleClick().build().perform();
        assertEquals("You have done a double click",
                driver.findElement(By.xpath("//*[@id='doubleClickMessage']")).getText());

        actions.moveToElement(driver.findElement(By.xpath("//*[@id='rightClickBtn']")))
                .contextClick().build().perform();
        assertEquals("You have done a right click",
                driver.findElement(By.xpath("//*[@id='rightClickMessage']")).getText());

        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")))
                .click().build().perform();

        assertTrue(driver.findElement(By.xpath("//*[@id='dynamicClickMessage']"))
                .getText().equals("You have done a dynamic click"));


    }

}