package com.andersenlab.lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiaryRuTest {

    public static void main(String[] args)  {

        test1();        //Can't done, because site use captcha

    }

    public static void test1(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.diary.ru/");

        WebElement element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@class='dropdown-toggle']"))));
        element.click();

        element = (new WebDriverWait(driver, 10).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//*[@id='loginform-username']"))));
        element.sendKeys("testAndersenLab");

        driver.findElement(By.xpath("//*[@id='loginform-password']")).sendKeys("123QWE!@#");

        driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']")).click();

        driver.findElement(By.xpath("//*[@id='login_btn']")).click();

        driver.close();
    }

}
