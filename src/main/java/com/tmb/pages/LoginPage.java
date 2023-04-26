package com.tmb.pages;

import com.tmb.reports.ExtentLogger;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    By txtUsername = By.id("Email");
    By txtPassword = By.id("Password");
    By btnLogin = By.xpath("//button[@type='submit']");

    public LoginPage goTo() {
        driver().get("https://admin-demo.nopcommerce.com/admin/");
       ExtentLogger.pass("Launched the Url");
        return this;
    }

    public LoginPage enterUsername(String username) {
        driver().findElement(txtUsername).clear();
        driver().findElement(txtUsername).sendKeys(username);
        ExtentLogger.pass(username + " entered in username Text Field");
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver().findElement(txtPassword).clear();
        driver().findElement(txtPassword).sendKeys(password);
        ExtentLogger.pass(password + " entered in username Text Field");
        return this;
    }

    public HomePage clickOnLogin() {
        driver().findElement(btnLogin).click();
        ExtentLogger.pass("Login Button Clicked");
        return new HomePage();
    }
}
