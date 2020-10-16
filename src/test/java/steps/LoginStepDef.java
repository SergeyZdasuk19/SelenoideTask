package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CreateAccountPage;
import pages.MainPage;

public class LoginStepDef {

    @Then("click create account")
    public void clickCreateAccount() {
        new MainPage().clickCreateAccount();
    }

    @Then("click start learning")
    public void clickStartLearning() {
        new CreateAccountPage().clickStartLearning();
    }

    @And("fill email field as {string}")
    public void fillEmailFieldAs(String email) {
        new CreateAccountPage().fillEmailField(email);
    }

    @And("fill name field as {string}")
    public void fillNameFieldAs(String name) {
        new CreateAccountPage().fillNameField(name);
    }

    @And("fill last name field as {string}")
    public void fillLastNameFieldAs(String lastName) {
        new CreateAccountPage().fillLastNameField(lastName);
    }

    @And("fill password field as {string}")
    public void fillPasswordFieldAs(String password) {
        new CreateAccountPage().fillPasswordField(password);
    }
}
