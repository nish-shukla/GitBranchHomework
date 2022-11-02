package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailAFriend {
    // Initialising Web Driver
    protected static WebDriver driver;

    public static void main(String[] args) {
// Initialising Chrome Driver path
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
// Just to Maximize window
        driver.manage().window().maximize();
// Capturing URL data
        driver.get("https://demo.nopcommerce.com");
// Capturing elements through XPath
        driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]//h2/a")).click();
        driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("FriendEmail")).sendKeys("Friend@gmail.com");
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("YourEmailAddress")).sendKeys("Nish123@test.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("This is very good Product");
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/button")).click();
// Closing all windows
        driver.quit();
    }
}