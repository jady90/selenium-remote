package com.tmb.pages;

import com.tmb.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends BasePage {

    By txtSearch = By.name("q");

    public SearchPage goTo() {
        driver().get("https://www.google.com");
        ExtentLogger.pass("Url is launched");
        return this;
    }

    public void enterValueInSearchField(String value) {
        driver().findElement(txtSearch).sendKeys(value, Keys.ENTER);
        ExtentLogger.pass(value + " entered in Search Text Field");

    }
}
