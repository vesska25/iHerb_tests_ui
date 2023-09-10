package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.components.SitePreference;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.vesska.testdata.TestData.*;


public class MainPage {

    SitePreference sitePreference = new SitePreference();
    @Step("Open main page")
    public MainPage openPage() {
        open("https://uk.iherb.com/");
        $("#truste-consent-button").click();
        return this;
    }
    @Step("Click on site preference")
    public MainPage clickOnSitePreference() {
        $(".selected-country-wrapper").click();
        return this;
    }
    @Step("Select language")
    public MainPage SelectLanguage(String language) {
        sitePreference.selectLanguage(language);
        sitePreference.saveSelectedLanguage();
        return this;
    }
    @Step("Verify selected language")
    public void verifySelectedLanguage() {
        $(".shop-menu").shouldHave(text(shopMenuNameItalian));
        $(".brands-menu").shouldHave(text(brandMenuInItalian));
        $(".help-with-menu").shouldHave(text(helpWithMenuInIntalian));
    }
    @Step("Click on search field")
    public MainPage clickOnSearchField() {
        $(".iherb-header-search-input").click();
        return this;
    }
    @Step("Click on new products link")
    public MainPage clickOnNewProductsLink(String link) {
        $(".categories").$(byText(link)).click();
        return this;
    }
    @Step("Input product name")
    public MainPage inputProductName(String productName1) {
        $(".iherb-header-search-input").sendKeys(productName1);
        return this;
    }
    @Step("Click on search button")
    public MainPage clickOnSearchButton() {
        $("#searchBtn").click();
        return this;
    }
    @Step("Click on share button")
    public MainPage clickOnShareButton() {
        $("[sbid='gh0']").click();
        return this;
    }
    @Step("verify share widget is visible")
    public MainPage verifyShareWidgetIsVisible() {
        $(".sc-share-widget-desktop").shouldBe(Condition.visible);
        return this;
    }
    @Step("Click on my account")
    public MainPage clickOnMyAccount() {
        $(".iherb-header-account-sign-in").hover();
        $("#menu-myaccount").click();
        return this;
    }
    @Step("Verify sale category is visible")
    public MainPage verifySaleCategoryIsVisible() {
        $("[data-ga-event-category=promotions]").shouldBe(visible);
        return this;
    }

}
