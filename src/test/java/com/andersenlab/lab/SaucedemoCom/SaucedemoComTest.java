package com.andersenlab.lab.SaucedemoCom;

import com.andersenlab.lab.com.Saucedemo.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SaucedemoComTest {


    SignUpPage signUpPage;
    SelectItem selectItem;
    CheckCart checkCart;
    EnterInformatonClient enterInformatonClient;
    VerificationOrder verificationOrder;
    ComplitePage complitePage;

    static WebDriver driver;

    @BeforeAll
    public static void set(){
        SaucedemoSetup.setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @Order(1)
    @Test
    public void signUpTest() {
        signUpPage = new SignUpPage(driver);
        signUpPage.enterUserName("standard_user");
        signUpPage.enterPassword("secret_sauce");
        signUpPage.loginButton();
    }

    @Order(2)
    @Test
    public void selectItemTest(){
        selectItem = new SelectItem(driver);
        selectItem.addItem();
        selectItem.clickButtonShoppingCart();
    }

    @Order(3)
    @Test
    public void cartTest(){
        checkCart = new  CheckCart(driver);
        checkCart.checkAdd();
        checkCart.checkoutButton();
    }

    @Order(4)
    @Test
    public void enterInformatonClientTest(){
        enterInformatonClient = new EnterInformatonClient(driver);
        enterInformatonClient.enterFirstName("Dmitry");
        enterInformatonClient.enterLastName("Pestunov");
        enterInformatonClient.enterPostCode("60-476");
        enterInformatonClient.clickContinieButton();
    }

    @Order(5)
    @Test
    public void verificationOrderTest(){
        verificationOrder = new VerificationOrder(driver);
        verificationOrder.finishButton();
    }

    @Order(6)
    @Test
    public void complitePageTest(){
        complitePage = new ComplitePage(driver);
        complitePage.searchCongratulationsText();
    }

    @AfterAll
    public static void close(){
        driver.close();
    }
}