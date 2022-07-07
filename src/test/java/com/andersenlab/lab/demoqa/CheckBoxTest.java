package com.andersenlab.lab.demoqa;

import com.andersenlab.lab.com.demoqa.CheckBox;
import com.andersenlab.lab.com.demoqa.DemoqaComSetup;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

@DisplayName("Check Box")
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

    @DisplayName("Check Box")
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

    @AfterEach
    public void tearDown() throws IOException {
        LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0 ) {
            OutputStream f = new FileOutputStream("BrowserLogs.txt", true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            for(int i = 0; i < allLogRows.size(); i++) {
                out.write(String.valueOf(allLogRows.get(i)) + "\n");
                out.flush();
            }
        }
    }

    @AfterAll
    public static void close(){
        driver.close();
    }
}
