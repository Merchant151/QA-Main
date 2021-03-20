package org.example;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HelloSelenium {

    private static WebDriver driver;

    @BeforeClass
    public static void setUpChrome(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        //ChormeOptions options = new ChromeOptions(); (Chrome Options doesn't work)
        //options.addArguments("headless");
        //driver = new ChromeDriver(options); //This is for headless mode or no gui
        driver = new ChromeDriver();

    }

    @Test
    public void testReddit() {
        driver.get("https://www.google.com");
        WebElement qBox = driver.findElement(By.name("q"));
        qBox.clear();
        qBox.sendKeys("GGC");
        qBox.submit();
        Assert.assertTrue(driver.getTitle().contains("GGC"));


        //driver.get("Https")
    }

    @Test
    public void testJobDescriptionGoogle() {
        driver.get("https://www.google.com");
        WebElement qBox = driver.findElement(By.name("q"));
        qBox.clear();
        qBox.sendKeys("Joshua Miller linkedin");
        qBox.submit();
        List<WebElement> headings = driver.findElements(By.tagName("h3"));
        //System.out.println(headings.get(0).getText());
        for(int i = 0; i < headings.size();i++){
            System.out.println(headings.get(i).getText());
        }
    }

    @AfterClass
    public static void cleanUp() throws Exception {
        Thread.sleep(33000);
        driver.close();
    }
}
