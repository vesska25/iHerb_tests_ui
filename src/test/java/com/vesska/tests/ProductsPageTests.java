package com.vesska.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.vesska.testdata.TestData.link;

public class ProductsPageTests extends TestBase {

    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Check categories in a new products page")
    void checkCategoriesinNewProductsPage() {
        mainPage.openPage()
                .clickOnSearchField()
                .clickOnNewProductsLink(link);
        newProductsPage.checkCategoriesinNewProductsPage();
    }
    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Check carousel of categories in Special products page")
    void checkCarouselInSpecialPageTest() {
        specialProductsPage.openPage()
                .clickOnCarouselArrow()
                .verifyHiddenTitleIsNowVisible();
    }
}
