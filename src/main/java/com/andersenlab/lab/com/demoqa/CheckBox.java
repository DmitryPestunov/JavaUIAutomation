package com.andersenlab.lab.com.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckBox {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/span/button")
    WebElement openMergeButton;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[3]/span/button")
    WebElement lastMergeButton;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[2]/span/button")
    WebElement secondMergeButton;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/span/button")
    WebElement secondLastMergeButton;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[3]/span/label")
    WebElement labelDownloads;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]")
    WebElement labelGeneral;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]")
    WebElement labelWorkSpace;

    @FindBy(xpath = "//*[@id='result']/span[2]")
    WebElement findResult;

    public CheckBox(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.demoqa.com/checkbox");
    }

    public void openFirstMerge(){
        openMergeButton.click();
    }

    public void lastMergeButton(){
        lastMergeButton.click();
    }

    public void secondMergeButton(){
        secondMergeButton.click();
    }

    public void secondLastMergeButton(){
        secondLastMergeButton.click();
    }

    public void labelDownloads(){
        labelDownloads.click();
    }

    public void labelWorkSpace(){
        labelWorkSpace.click();
    }

    public void labelGeneral(){
        labelGeneral.click();
    }

    public void checkResult(){
        assertTrue(findResult.getText().equals("workspace"));
    }
}
