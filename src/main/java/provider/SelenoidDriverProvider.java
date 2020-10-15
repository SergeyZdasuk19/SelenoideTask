package provider;

import capabilities.DesiredCapabilitiesConfig;
import com.codeborne.selenide.WebDriverProvider;
import enums.BrowserInfo;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class SelenoidDriverProvider implements WebDriverProvider {

    @SneakyThrows(MalformedURLException.class)
    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        return
                new RemoteWebDriver(
                        URI.create("http://192.168.99.100:4444/wd/hub").toURL(),
                        new DesiredCapabilitiesConfig().getCapabilities(BrowserInfo.CHROME));
    }
}
