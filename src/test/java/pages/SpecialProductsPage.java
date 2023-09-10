package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SpecialProductsPage {
    @Step("Open page")
    public SpecialProductsPage openPage() {
        open("specials");
        $("#truste-consent-button").click();
        return this;
    }
    @Step("Click on carousel arrow")
    public SpecialProductsPage clickOnCarouselArrow() {
        $("[data-ga-event-name=carousel_pagination]").click();
        return this;
    }
    @Step("Verify hidden title is now visible")
    public SpecialProductsPage verifyHiddenTitleIsNowVisible() {
        $(".img-wrapper [title=Pets]").shouldBe(visible);
        return this;
    }
}
