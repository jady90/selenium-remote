package com.tmb.drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> driverThreadLocal =  new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }
    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }
    public static void unloadDriver() {
        driverThreadLocal.remove();
    }
}
