package steps;

import io.cucumber.java.en.Then;
import pages.CreateAccountPage;
import pages.MainPage;

public class LoginStepDef {

    @Then("click create account")
    public void clickCreateAccount() {
        new MainPage().clickCreateAccount();
    }

    @Then("fill registration fields")
    public void fillRegistrationFields() {
        new CreateAccountPage().fillRegistrationFields();
    }

    @Then("click start learning")
    public void clickStartLearning() {
        new CreateAccountPage().clickStartLearning();
    }
}
