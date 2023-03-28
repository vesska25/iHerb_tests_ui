package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchProductsPage {

    public SearchProductsPage verifySearchResults(String searchResults) {
        $(".sub-header-title").shouldHave(text(searchResults));
        return this;
    }
    public SearchProductsPage hoverMouseOnProduct() {
        $("[itemid=pid_69610]").hover();
        return this;
    }
    public SearchProductsPage clickOnAddToCartButton() {
        $("[name=AddToCart]").click();
        return this;
    }
    public SearchProductsPage checkIfProductWasAddedToCart() {
        $(byText("Added to cart!")).shouldBe(visible);
        return this;
    }
}
