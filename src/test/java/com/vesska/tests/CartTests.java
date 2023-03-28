package com.vesska.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.vesska.testdata.TestData.productName2;

public class CartTests extends TestBase{

    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Add item to Cart test")
    void addToCartTest() {

        mainPage.openPage()
                .clickOnSearchField()
                .inputProductName(productName2)
                .clickOnSearchButton();
        searchProductsPage.hoverMouseOnProduct()
                .clickOnAddToCartButton()
                .checkIfProductWasAddedToCart();
    }
}
