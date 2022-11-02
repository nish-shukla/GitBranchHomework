package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewsDetails
{
// Initialising Web Driver
    protected static WebDriver driver;

    public static void main(String[] args)
    {
// Initialising Chrome Driver path
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
// Just to Maximize window
        driver.manage().window().maximize();
// Capturing URL data
        driver.get("https://demo.nopcommerce.com");
// Capturing elements for Details tab under News
        driver.findElement(By.xpath("//a[contains(@href,\"release\") and contains(@class,\"read\")]")).click();
// Capturing elements of Title table and sendkeys for Data to enter
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Mr.");
// Time pause of 2 second so we can see clearly
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("This is good website");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class=\"buttons\"]/button")).click();
// Time Pause
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        driver.quit();

    }
}