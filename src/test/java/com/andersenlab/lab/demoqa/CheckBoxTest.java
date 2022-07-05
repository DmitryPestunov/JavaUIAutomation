package com.andersenlab.lab.demoqa;

import com.andersenlab.lab.com.demoqa.CheckBox;
import com.andersenlab.lab.com.demoqa.DemoqaComSetup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest {

    static WebDriver driver;
    CheckBox checkBox;

    @BeforeAll
    public static void set(){
        DemoqaComSetup.set();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/checkbox");
    }

    @Test
    public void checkBoxTest(){
        checkBox = new CheckBox(driver);
        checkBox.openFirstMerge();
        checkBox.lastMergeButton();
        checkBox.secondMergeButton();
        checkBox.secondLastMergeButton();
        checkBox.labelDownloads();
        checkBox.labelWorkSpace();
        checkBox.labelGeneral();
        checkBox.checkResult();
    }

    @AfterAll
    public static void close(){
       // driver.close();
    }
}
