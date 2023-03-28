package com.vesska.tests;


import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;
import pages.NewProductsPage;
import pages.SearchProductsPage;
import pages.SpecialProductsPage;
import pages.SignInPage;

import static com.codeborne.selenide.Selenide.closeWindow;


public class TestBase {
    MainPage mainPage = new MainPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    SearchProductsPage searchProductsPage = new SearchProductsPage();
    SpecialProductsPage specialProductsPage = new SpecialProductsPage();
    SignInPage signInPage = new SignInPage();

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWindow();
//        clearBrowserCookies();
    }
}
