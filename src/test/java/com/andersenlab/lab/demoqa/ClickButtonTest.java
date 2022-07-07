package com.andersenlab.lab.demoqa;

import com.andersenlab.lab.com.demoqa.ClickButton;
import com.andersenlab.lab.com.demoqa.DemoqaComSetup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.concurrent.TimeUnit;

@DisplayName("Click button")
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

    @DisplayName("Click all button")
    @Test
    public void testButtons(){
       clickButton = new ClickButton(driver);

        clickButton.doubleClickBtn();
        clickButton.checkDoubleClick();
        clickButton.rightClickBtn();
        clickButton.checkRightClick();
        clickButton.clickButton();
        clickButton.checkClick();
    }

    @AfterAll
    public static void close(){
        driver.close();
    }
}
