package org.example;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

    private static WebDriver driver;

    @BeforeClass
    public static void setUpChrome(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testReddit() {
        driver.get("https://www.reddit.com");
        WebElement qBox = driver.findElement(By.name("q"));
        qBox.clear();
        qBox.sendKeys("GGC");
        qBox.submit();
        Assert.assertEquals("GGC",driver.getTitle().contains("GGC"));
    }


    @AfterClass
    public static void cleanUp() throws Exception {
        Thread.sleep(500);
        driver.close();
    }
}
