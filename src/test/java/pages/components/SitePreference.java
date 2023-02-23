package pages.components;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SitePreference {

    public void selectLanguage(String language) {
        $(".select-language").click();
        $(byText(language)).click();

    }
    public void saveSelectedLanguage() {
        $(byText("Salva")).click();

    }
}
