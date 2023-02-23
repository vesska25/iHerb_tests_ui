package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NewProductsPage {

    public NewProductsPage checkCategoriesinNewProductsPage() {
        $("[data-keyword='Health Topics']").shouldBe(visible);
        $("[data-keyword=Vitamins]").shouldBe(visible);
        $("[data-keyword='Bath & Personal Care']").shouldBe(visible);
        $("[data-keyword='iHerb Brands']").shouldBe(visible);
        return this;
    }
}
