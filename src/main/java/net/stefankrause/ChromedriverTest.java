package net.stefankrause;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ChromedriverTest {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "node_modules/chromedriver/lib/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/ncr");
        WebElement searchBox = driver.findElement(By.id("lst-ib"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}