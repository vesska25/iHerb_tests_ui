package com.vesska.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.vesska.testdata.TestData.productName1;

public class SearchTests extends TestBase{

    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Search for Soglar productions test")
    void searchSoglarTest()  {

        mainPage.openPage()
                .clickOnSearchField()
                .inputProductName(productName1)
                .clickOnSearchButton();
        searchProductsPage.verifySearchResults(productName1);
    }
}
