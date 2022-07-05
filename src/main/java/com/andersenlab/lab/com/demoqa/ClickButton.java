package com.andersenlab.lab.com.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClickButton {

    WebDriver driver;
    Actions actions;

    @FindBy(xpath = "//*[@id='doubleClickBtn']")
    WebElement doubleClickBtn;

    @FindBy(xpath = "//*[@id='doubleClickMessage']")
    WebElement doubleClickMessage;

    @FindBy(xpath = "//*[@id='rightClickBtn']")
    WebElement rightClickBtn;

    @FindBy(xpath = "//*[@id='rightClickMessage']")
    WebElement rightClickMessage;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    WebElement button;

    @FindBy(xpath = "//*[@id='dynamicClickMessage']")
    WebElement dynamicClickMessage;

    public ClickButton(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void doubleClickBtn(){
        actions.moveToElement(doubleClickBtn).doubleClick().build().perform();
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='doubleClickBtn']")));
//
//        actions.moveToElement(driver.findElement(By.xpath("//*[@id='doubleClickBtn']"))).doubleClick().build().perform();
    }

    public void checkDoubleClick(){
        assertEquals("You have done a double click", doubleClickMessage.getText());
    }

    public void rightClickBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='doubleClickBtn']")));
        actions.moveToElement(rightClickBtn).contextClick().build().perform();
    }

    public void checkRightClick(){
        assertEquals("You have done a right click", rightClickMessage.getText());
    }

    public void clickButton(){
        actions.moveToElement(button).click().build().perform();
    }

    public void checkClick(){
        assertTrue(dynamicClickMessage.getText().equals("You have done a dynamic click"));
    }


}
