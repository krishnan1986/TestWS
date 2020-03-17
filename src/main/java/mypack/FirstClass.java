package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstClass
{
   // DefaultSelenium selenium;
  // Selenium selenium;
   WebDriver driver = new SafariDriver();

    //Constructor method
    public FirstClass(String host, int port, String browser, String baseURL)
    {
//        this.selenium = new DefaultSelenium(host, port, browser, baseURL);
//        this.selenium.start();

        driver.navigate().to(baseURL);
        // selenium= new WebDriverBackedSelenium(driver, baseURL);
    }

    public boolean open(String URL) {
       // this.selenium.open(URL);
        driver.navigate().to(URL);
        return true;
    }

//    public boolean type(String locator, String value) {
//        boolean elementFound = this.selenium.isElementPresent(locator);
//        if (elementFound) {
//            this.selenium.type(locator, value);
//        }
//        return elementFound;
//    }
//    public boolean click(String locator) {
//        boolean elementFound = this.selenium.isElementPresent(locator);
//        if (elementFound) {
//            this.selenium.click(locator);
//        }
//        return elementFound;
//    }
//    public boolean verifyResultPage(String locator) {
//        boolean elementFound = this.selenium.isElementPresent(locator);
//        return elementFound;
//    }

    public boolean close() {
       // this.selenium.close();
        driver.close();
        return true;
    }
//    public boolean stop() {
//        this.selenium.stop();
//        return true;
//    }


}