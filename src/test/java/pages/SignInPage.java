package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    @Step("Verify login Form is Visible")
    public SignInPage verifyLoginFormIsVisible() {
        $("#login-box").shouldBe(Condition.visible);
        return this;
    }
}
