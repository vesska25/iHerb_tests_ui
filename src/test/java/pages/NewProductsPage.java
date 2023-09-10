package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NewProductsPage {
    @Step("Check categories in New Product page")
    public NewProductsPage checkCategoriesinNewProductsPage() {
        $("[data-keyword='Health Topics']").shouldBe(visible);
        $("[data-keyword=Vitamins]").shouldBe(visible);
        $("[data-keyword='Bath & Personal Care']").shouldBe(visible);
        return this;
    }
}
