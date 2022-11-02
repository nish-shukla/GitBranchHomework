package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class HomepageCategories {
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
// Capturing elements for main Computers Tab through full Xpath top to bottom
            String tab1 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[1]/a"))).getText();
            String tab2 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[2]/a"))).getText();
            String tab3 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[3]/a"))).getText();
            String tab4 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[4]/a"))).getText();
            String tab5 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[5]/a"))).getText();
            String tab6 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[6]/a"))).getText();
            String tab7 = driver.findElement(By.xpath(("/html/body/div[6]/div[2]/ul[1]/li[7]/a"))).getText();
// Printing captured message through sout function
            System.out.println(tab1);
            System.out.println(tab2);
            System.out.println(tab3);
            System.out.println(tab4);
            System.out.println(tab5);
            System.out.println(tab6);
            System.out.println(tab7);
            driver.quit();
        }
    }
