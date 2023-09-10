package pages.components;


import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SitePreference {
    @Step("Select language")
    public void selectLanguage(String language) {
        $(".select-language").click();
        $(byText(language)).click();

    }
    @Step("Save selected language")
    public void saveSelectedLanguage() {
        $(byText("Salva")).click();

    }
}
