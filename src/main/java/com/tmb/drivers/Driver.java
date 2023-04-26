package com.tmb.drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    public static void initDriver() {
        String browser = "chrome";
        //System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        if(browser.equalsIgnoreCase("chrome")){
            try {
                DriverManager.setDriver(new RemoteWebDriver
                        (new URL("http://192.168.2.17:4444"), new ChromeOptions()));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else if(browser.equalsIgnoreCase("edge")){
            try {
                DriverManager.setDriver(new RemoteWebDriver
                        (new URL("http://192.168.2.17:4444"), new EdgeOptions()));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else {
           // System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            DriverManager.setDriver(new ChromeDriver());
        }
    }

    public static void closeDriver() {
        DriverManager.getDriver().quit();
    }
}
