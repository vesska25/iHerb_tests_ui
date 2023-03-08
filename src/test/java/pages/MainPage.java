package pages;

import pages.components.SitePreference;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


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
        $(".shop-menu").shouldHave(text("Acquista"));
        $(".brands-menu").shouldHave(text("Marchi"));
        $(".help-with-menu").shouldHave(text("Assistenza con"));
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
}
