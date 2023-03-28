package pages;

import com.codeborne.selenide.Condition;
import pages.components.SitePreference;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.vesska.testdata.TestData.*;


public class MainPage {

    SitePreference sitePreference = new SitePreference();

    public MainPage openPage() {
        open("https://uk.iherb.com/");
        $("#truste-consent-button").click();
        return this;
    }

    public MainPage clickOnSitePreference() {
        $(".selected-country-wrapper").click();
        return this;
    }
    public MainPage SelectLanguage(String language) {
        sitePreference.selectLanguage(language);
        sitePreference.saveSelectedLanguage();
        return this;
    }

    public void verifySelectedLanguage() {
        $(".shop-menu").shouldHave(text(shopMenuNameItalian));
        $(".brands-menu").shouldHave(text(brandMenuInItalian));
        $(".help-with-menu").shouldHave(text(helpWithMenuInIntalian));
    }

    public MainPage clickOnSearchField() {
        $(".iherb-header-search-input").click();
        return this;
    }

    public MainPage clickOnNewProductsLink(String link) {
        $(".categories").$(byText(link)).click();
        return this;
    }

    public MainPage inputProductName(String productName1) {
        $(".iherb-header-search-input").sendKeys(productName1);
        return this;
    }
    public MainPage clickOnSearchButton() {
        $("#searchBtn").click();
        return this;
    }
    public MainPage clickOnShareButton() {
        $("[sbid='gh0']").click();
        return this;
    }
    public MainPage verifyShareWidgetIsVisible() {
        $(".sc-share-widget-desktop").shouldBe(Condition.visible);
        return this;
    }
    public MainPage clickOnMyAccount() {
        $(".iherb-header-account-sign-in").hover();
        $("#menu-myaccount").click();
        return this;
    }

    public MainPage verifySaleCategoryIsVisible() {
        $("[data-ga-event-category=promotions]").shouldBe(visible);
        return this;
    }

}
