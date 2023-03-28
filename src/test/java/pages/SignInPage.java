package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    public SignInPage verifyLoginFormIsVisible() {
        $("#login-box").shouldBe(Condition.visible);
        return this;
    }
}
