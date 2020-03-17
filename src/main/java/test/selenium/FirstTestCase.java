package test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTestCase {

    public static void main(String[] args) throws Exception{
        WebDriver driver = new SafariDriver();

        driver.get("http://www.shop.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        //Wait for 5 Sec
        Thread.sleep(5000);

        // Close the driver
        driver.quit();
    }
}
