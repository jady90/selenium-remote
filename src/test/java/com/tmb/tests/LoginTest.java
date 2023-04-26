package com.tmb.tests;

import com.tmb.pages.LoginPage;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "getData")
    public void loginTest(String username, String password) {

        LoginPage loginPage = new LoginPage();
        boolean homePageIsDisplayed = loginPage
                .goTo()
                .enterPassword(username)
                .enterPassword(password)
                .clickOnLogin()
                        .verifyHeaderIsDisplayed();

        Assert.assertTrue(homePageIsDisplayed);
        Assertions.assertThat(loginPage.geTitle())
                .contains("Dashboard");
    }

    @DataProvider(parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {"admin@yourstore.com", "admin"},
                {"admin@yourstore.com", "admin"},
               /* {"admin@store", "wrong"},
                {"admin@yourstore.com", "admin"},
                {"admin@yourstore.com", "admin"},
                {"admin@store", "wrong"},
                {"admin@yourstore.com", "admin"},
                {"admin@yourstore.com", "admin"},
                {"admin@store", "wrong"}*/

        };
    }
}
