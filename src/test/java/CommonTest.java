import enums.BrowserInfo;
import factory.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class CommonTest {

    protected RemoteWebDriver remoteWebDriver;

    @BeforeEach
    public void setUp() {
        remoteWebDriver = DriverFactory.getDriver(BrowserInfo.CHROME);

    }

    @AfterEach
    public void tearDown() {
        remoteWebDriver.quit();
    }
}
