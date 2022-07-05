package com.andersenlab.lab.demoqa;

import com.andersenlab.lab.com.demoqa.ClickButton;
import com.andersenlab.lab.com.demoqa.DemoqaComSetup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ClickButtonTest {

    static WebDriver driver;
    ClickButton clickButton;
    Actions actions = new Actions(driver);

    @BeforeAll
    public static void set() {
        DemoqaComSetup.set();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/buttons");

    }

    @Test
    public void testButtons(){
       ClickButton clickButton = new ClickButton(driver);

        clickButton.doubleClickBtn();
//       // clickButton.checkDoubleClick();
//        clickButton.rightClickBtn();
//       // clickButton.checkRightClick();
//        clickButton.clickButton();
//       // clickButton.checkClick();

//        actions.moveToElement(driver.findElement(By.xpath("//*[@id='doubleClickBtn']")))
//                .doubleClick().build().perform();
//        actions.moveToElement(driver.findElement(By.xpath("//*[@id='rightClickBtn']")))
//                .contextClick().build().perform();
//        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")))
//                .click().build().perform();
    }

    @AfterAll
    public static void close(){
       // driver.close();
    }
}
