package pages;

import lombok.Data;
import pagesElements.Button;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class MainPage {

    private Button createAccountBtn = new Button($x("//span[text()='Create Account']/parent::button"));

    public MainPage clickCreateAccount() {
        createAccountBtn.pressButton();
        return this;
    }
}
