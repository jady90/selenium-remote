package com.tmb.tests;

import com.tmb.drivers.Driver;
import com.tmb.drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        Driver.initDriver();
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }

    public WebDriver driver() {
        return DriverManager.getDriver();
    }

}
