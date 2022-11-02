package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products
{
// Initialising Web Driver
    protected static WebDriver driver;
    public static void main(String[] args)
    {
// Initialising Chrome Driver path
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
// Just to Maximize window
        driver.manage().window().maximize();
// Capturing URL data
        driver.get("https://demo.nopcommerce.com");
// Capturing elements for main Computers Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click();
// Capturing elements for Desktop option
        driver.findElement(By.xpath("//ul[@class='sublist']/li[1]/a")).click();
// Capturing & Storing results in Msg Objects & Printing with sout function
        String Msg1 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[1]//h2/a"))).getText();
        System.out.println("First Item is " + Msg1);
        String Msg2 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[2]//h2/a"))).getText();
        System.out.println("Second Item is " + Msg2);
        String Msg3 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[3]//h2/a"))).getText();
        System.out.println("Third Item is " + Msg3);
// To close all the windows
        driver.quit();

    }
}
