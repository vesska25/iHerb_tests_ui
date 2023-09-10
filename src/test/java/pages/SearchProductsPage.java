package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchProductsPage {
    @Step("Verify search results")
    public SearchProductsPage verifySearchResults(String searchResults) {
        $(".sub-header-title").shouldHave(text(searchResults));
        return this;
    }
    @Step("Hover mouse on product")
    public SearchProductsPage hoverMouseOnProduct() {
        $("[itemid=pid_69610]").hover();
        return this;
    }
    @Step("Click on Add To Cart button")
    public SearchProductsPage clickOnAddToCartButton() {
        $("[name=AddToCart]").click();
        return this;
    }
    @Step("Check if the product was added to cart")
    public SearchProductsPage checkIfProductWasAddedToCart() {
        $(byText("Added to cart!")).shouldBe(visible);
        return this;
    }
}
