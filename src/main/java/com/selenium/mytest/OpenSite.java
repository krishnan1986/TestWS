package com.selenium.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OpenSite {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String open()
    {

        return openWebSite(name);
    }

    public String isLoggedIn()
    {

        return login();
    }
 // to be used
    private String login() {
        String isLoggedIn="no";
        try {
            Properties props =  new Properties();
            props.load(new FileInputStream(new File("./src/main/resources/gmail.properties")));
            //WebDriver driver = new SafariDriver();

            System.setProperty("webdriver.chrome.driver", "/Users/krishnan/Downloads/chromedriver-3");
            System.setProperty("webdriver.chrome.logfile","/Users/krishnan/Downloads/chromedriver.log");
            WebDriver driver= new ChromeDriver();
           // WebDriver driver = new SafariDriver();

            driver.get(name);

            // provide credentials //*[@id="password"]/div[1]/div/div[1]/input

           driver.findElement(By.id("identifierId")).sendKeys(props.getProperty("username"));
           Thread.sleep(10000);
           driver.findElement(By.id("identifierNext")).click();
            Thread.sleep(4000);
           driver.findElement(By.id("password")).sendKeys(props.getProperty("password"));
            Thread.sleep(4000);
           driver.findElement(By.id("passwordNext")).click();

            isLoggedIn="Yes";
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return isLoggedIn;
    }

// not to be used only for testing purpose
    private String openWebSite(String name) {
        String isOpen="no";
        try {
            System.setProperty("webdriver.chrome.driver", "/Users/krishnan/Downloads/chromedriver-3");
            System.setProperty("webdriver.chrome.logfile","/Users/krishnan/Downloads/chromedriver.log");

            WebDriver driver = new SafariDriver();

            driver.get(name);
            isOpen="Yes";
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return isOpen;


    }


}
