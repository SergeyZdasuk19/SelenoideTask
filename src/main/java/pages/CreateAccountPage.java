package pages;

import com.codeborne.selenide.Condition;
import pagesElements.Button;
import pagesElements.Header;
import pagesElements.TextField;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    private Header header = new Header($("//h1[text()='Create an Account to Get Started']"));
    private TextField emailField = new TextField($("//input[@id='email']"));
    private TextField nameField = new TextField($("//input[@id='firstName']"));
    private TextField lastNameField = new TextField($("//input[@id='lastName']"));
    private TextField passwordField = new TextField($("//input[@id='password']"));
    private Button startLearningBnt = new Button($("//button[@type='submit']"));

    public CreateAccountPage() {
        header
                .getElement()
                .shouldBe(Condition.appear);
    }

    public CreateAccountPage fillRegistrationFields() {
        emailField.addTextInField("vavolit971@dmeproject.com");
        nameField.addTextInField("NameTest");
        lastNameField.addTextInField("LastNameTest");
        passwordField.addTextInField("Password");
        return this;
    }

    public CreateAccountPage clickStartLearning() {
        startLearningBnt.pressButton();
        return this;
    }
}
