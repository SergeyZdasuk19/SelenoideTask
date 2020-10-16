package pages;

import com.codeborne.selenide.Condition;
import lombok.Data;
import pagesElements.Button;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class MainPage {

    private Button createAccountBtn = new Button($x("//span[text()='Create Account']/parent::button"));

    public MainPage() {
        createAccountBtn
                .getElement()
                .shouldBe(Condition.appear);
    }

    public MainPage clickCreateAccount() {
        createAccountBtn.pressButton();
        return this;
    }
}
