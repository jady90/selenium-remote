package com.tmb.pages;

import com.tmb.drivers.DriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver() {
        return DriverManager.getDriver();
    }

    public String geTitle() {
        return driver().getTitle();
    }

}
