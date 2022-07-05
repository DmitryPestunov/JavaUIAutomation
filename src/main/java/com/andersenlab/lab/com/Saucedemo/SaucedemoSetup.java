package com.andersenlab.lab.com.Saucedemo;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class SaucedemoSetup {

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeDriverManager.getInstance().setup();
    }
}
