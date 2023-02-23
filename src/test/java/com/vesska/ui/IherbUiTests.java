package com.vesska.ui;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.vesska.ui.TestData.*;

public class IherbUiTests extends TestBase{


    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Switch website language to Italian")
    void switchLanguageToItalianTest() {
        mainPage.openPage()
                .clickOnSitePreference()
                .SelectLanguage(language)
                .verifySelectedLanguage();
    }

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
    @DisplayName("Search for Soglar productions test")
    void searchSoglarTest()  {

        mainPage.openPage()
                .clickOnSearchField()
                .inputProductName(productName1)
                .clickOnSearchButton();
        searchProductsPage.verifySearchResults(productName1);
    }
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

    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Check carousel of categories in Special products page")
    void checkCarouselInSpecialPageTest() {
        specialProductsPage.openPage()
                .clickOnCarouselArrow()
                .verifyHiddenTitleIsNowVisible();
    }

//    @Test
//    @Tag("prod")
//    @Owner("s.savich")
//    @DisplayName("Switch website language to Italian")
//    void switchLanguageToItalianTest() {
//
//        open("https://uk.iherb.com/");
//        $("#truste-consent-button").click();
//        $(".selected-country-wrapper").click();
//        $(".select-language").click();
//        $(byText("Italiano")).click();
//        $(byText("Salva")).click();
//        $(".shop-menu").shouldHave(text("Acquista"));
//        $(".brands-menu").shouldHave(text("Marchi"));
//        $(".help-with-menu").shouldHave(text("Assistenza con"));
//    }

//    @Test
//    @Tag("prod")
//    @Owner("s.savich")
//    @DisplayName("Check categories in a new products page")
//    void checkCategoriesinNewProductsPage() {
//
//        open("https://uk.iherb.com/");
//        $("#truste-consent-button").click();
//        $(".iherb-header-search-input").click();
//        $(".categories").$(byText("New")).click();
//        $("[data-keyword=Supplements]").shouldBe(visible);
//        $("[data-keyword='Health Topics']").shouldBe(visible);
//        $("[data-keyword=Vitamins]").shouldBe(visible);
//        $("[data-keyword='Bath & Personal Care']").shouldBe(visible);
//        $("[data-keyword='iHerb Brands']").shouldBe(visible);
//    }

//    @Test
//    @Tag("prod")
//    @Owner("s.savich")
//    @DisplayName("Search for Soglar productions test")
//    void searchSoglarTest() {
//
//        open("https://uk.iherb.com/");
//        $("#truste-consent-button").click();
//        $(".iherb-header-search-input").sendKeys("Solgar");
//        $("#searchBtn").click();
//        $(".sub-header-title").shouldHave(text("Search Results for \"Solgar\""));
//    }

//    @Test
//    @Tag("prod")
//    @Owner("s.savich")
//    @DisplayName("Add item to Cart test")
//    void addToCartTest() {
//
//        open("https://uk.iherb.com/");
//        $("#truste-consent-button").click();
//        $(".iherb-header-search-input").sendKeys("Solgar Vitamin C");
//        $("#searchBtn").click();
//        $("#pid_69610").hover();
//        $("[name=AddToCart]").click();
//        $(byText("Added to cart!")).shouldBe(visible);
//    }

//    @Test
//    @Tag("prod")
//    @Owner("s.savich")
//    @DisplayName("Check carousel of categories in Special products page")
//    void checkCarouselinSpecialPageTest() {
//
//        open("specials");
//        $("#truste-consent-button").click();
//        $("[data-ga-event-name=carousel_pagination]").click();
//        $(".img-wrapper").$("[title=Pets]").shouldBe(visible);
//    }
}
