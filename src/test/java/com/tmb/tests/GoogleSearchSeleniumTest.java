package com.tmb.tests;

import com.tmb.pages.SearchPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class GoogleSearchSeleniumTest extends BaseTest {

    @Test
    public void searchSeleniumTest() {

        SearchPage searchPage = new SearchPage();
        searchPage
                .goTo()
                .enterValueInSearchField("selenium");

        Assertions.assertThat(searchPage.geTitle())
                        .contains("selenium");
    }
}
