package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SpecialProductsPage {

    public SpecialProductsPage openPage() {
        open("specials");
        $("#truste-consent-button").click();
        return this;
    }

    public SpecialProductsPage clickOnCarouselArrow() {
        $("[data-ga-event-name=carousel_pagination]").click();
        return this;
    }
    public SpecialProductsPage verifyHiddenTitleIsNowVisible() {
        $(".img-wrapper").$("[title=Pets]").shouldBe(visible);
        return this;
    }
}
