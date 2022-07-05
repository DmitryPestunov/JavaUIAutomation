package com.andersenlab.lab.com.demoqa;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class DemoqaComSetup {


    public static void set(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeDriverManager.getInstance().setup();
    }



}
