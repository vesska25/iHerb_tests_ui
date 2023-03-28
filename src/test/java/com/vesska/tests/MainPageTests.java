package com.vesska.tests;


import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.vesska.testdata.TestData.*;

public class MainPageTests extends TestBase{

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
    @DisplayName("Check that share widget opens")
    void CheckThatShareWidgetOpens() {
        mainPage.openPage()
                .clickOnShareButton()
                .verifyShareWidgetIsVisible();
    }

    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Check that if an unauthorized person clicks on 'My account', a login form will open")
    void CheckLoginFormOpensIfUnauthorizedClickOnMyAccount() {
        mainPage.openPage()
                .clickOnMyAccount();
        signInPage.verifyLoginFormIsVisible();
    }

    @Test
    @Tag("prod")
    @Owner("s.savich")
    @DisplayName("Check that Sales & Offers category in Search is visible")
    void CheckIfSaleCategoryIsVisible() {
        mainPage.openPage()
                .clickOnSearchField()
                .verifySaleCategoryIsVisible();
    }

}
