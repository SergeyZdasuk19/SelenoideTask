package factory;

import capabilities.DesiredCapabilitiesConfig;
import enums.BrowserInfo;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class DriverFactory {

    private static RemoteWebDriver remoteWebDriver;

    public static RemoteWebDriver getDriver(BrowserInfo browserInfo) {
        try {
            remoteWebDriver = new RemoteWebDriver(
                    URI.create("http://192.168.99.100:4444/wd/hub").toURL(),
                    new DesiredCapabilitiesConfig().getCapabilities(browserInfo));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return remoteWebDriver;
    }
}
