package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class FirstMaven
{
    protected static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Nishant");
// Giving 100 ml pause between 2 action
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("LastName")).sendKeys("Shukla");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("Email")).sendKeys("Nish"+timeStamp+"@gmail.com" );
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("Password")).sendKeys("Test1234*");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test1234*");
        driver.findElement(By.id("register-button")).click();

        String regMsg= driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);

        driver.quit();
    }

}
