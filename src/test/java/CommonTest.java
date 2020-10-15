import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.RemoteWebDriver;
import provider.SelenoidDriverProvider;

import static com.codeborne.selenide.Selenide.*;

public abstract class CommonTest {

    protected RemoteWebDriver remoteWebDriver;

    @BeforeEach
    public void setUp() {
        Configuration.browser = SelenoidDriverProvider.class.getName();
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "http://todomvc.com/examples/vanillajs/";
        open(Configuration.baseUrl);
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
