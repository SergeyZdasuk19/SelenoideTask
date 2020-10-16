package pages;

import com.codeborne.selenide.Condition;
import lombok.Data;
import pagesElements.Button;

import static com.codeborne.selenide.Selenide.$;

@Data
public class MainPage {

    private Button createAccountBtn = new Button($("//span[text()='Create Account']"));

    public MainPage() {
        createAccountBtn
                .getElement()
                .shouldBe(Condition.visible);
    }

    public MainPage clickCreateAccount() {
        createAccountBtn.pressButton();
        return this;
    }
}
