package com.andersenlab.lab.demoqa;

import com.andersenlab.lab.com.demoqa.DemoqaComSetup;
import com.andersenlab.lab.com.demoqa.TextBox;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@DisplayName("Text box")
public class TextBoxTest {

    static WebDriver driver;

    TextBox textBox;

    @BeforeAll
    public static void set(){
        DemoqaComSetup.set();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/text-box");
    }

    @DisplayName("Entering text in a field")
    @Test
    public void test1(){
        textBox = new TextBox(driver);
        textBox.enterName("Dmitry Pestunov");
        textBox.enterEmail("pestynoff@gmail.com");
        textBox.enterCurrentAddress("Poznan");
        textBox.enterPermanentAddress("Gomel");
        textBox.submitButton();
        textBox.checkEnter();

    }

    @AfterAll
    public static void close(){
        driver.close();
    }

}
