package com.tmb.tests;

import com.tmb.pages.SearchPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class GoogleSearchJavaTest extends BaseTest {

    @Test
    public void searchJavaTest() {

        SearchPage searchPage = new SearchPage();
        searchPage
                .goTo()
                .enterValueInSearchField("java");

        Assertions.assertThat(searchPage.geTitle())
                        .contains("java");
    }
}
