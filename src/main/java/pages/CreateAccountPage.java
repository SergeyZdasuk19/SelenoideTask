package pages;

import pagesElements.Button;
import pagesElements.TextField;

import static com.codeborne.selenide.Selenide.$x;

public class CreateAccountPage {

    private TextField emailField = new TextField($x("//input[@id='email']"));
    private TextField nameField = new TextField($x("//input[@id='firstName']"));
    private TextField lastNameField = new TextField($x("//input[@id='lastName']"));
    private TextField passwordField = new TextField($x("//input[@id='password']"));
    private Button startLearningBnt = new Button($x("//button[@type='submit']"));

    public CreateAccountPage fillEmailField(String email) {
        emailField.addTextInField(email);
        return this;
    }

    public CreateAccountPage fillNameField(String name) {
        nameField.addTextInField(name);
        return this;
    }

    public CreateAccountPage fillLastNameField(String lastName) {
        lastNameField.addTextInField(lastName);
        return this;
    }

    public CreateAccountPage fillPasswordField(String password) {
        passwordField.addTextInField(password);
        return this;
    }

    public CreateAccountPage clickStartLearning() {
        startLearningBnt.pressButton();
        return this;
    }
}
