package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    By headerHomePage = By.xpath("//h1[contains(text(), 'Dashboard')]");

    public boolean verifyHeaderIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver(), Duration.ofSeconds(15));
        WebElement element =  wait.until(ExpectedConditions
                .presenceOfElementLocated(headerHomePage));
        return element.isDisplayed();
    }
}
