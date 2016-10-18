package net.stefankrause;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class RemoteChromedriverTest {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"), DesiredCapabilities.chrome());
        driver.get("http://www.google.com/ncr");
        WebElement searchBox = driver.findElement(By.id("lst-ib"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}