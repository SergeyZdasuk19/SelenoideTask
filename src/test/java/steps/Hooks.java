package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import provider.SelenoidDriverProvider;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void setUp() {
        Configuration.browser = SelenoidDriverProvider.class.getName();
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://grinfer.com/";
        open(Configuration.baseUrl);
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
