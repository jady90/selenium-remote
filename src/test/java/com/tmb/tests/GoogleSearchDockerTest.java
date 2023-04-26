package com.tmb.tests;

import com.tmb.pages.SearchPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class GoogleSearchDockerTest extends BaseTest {

    @Test
    public void searchDockerTest() {

        SearchPage searchPage = new SearchPage();
        searchPage
                .goTo()
                .enterValueInSearchField("docker");

        Assertions.assertThat(searchPage.geTitle())
                        .contains("docker");
    }
}
