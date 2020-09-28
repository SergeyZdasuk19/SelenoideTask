package capabilities;

import enums.BrowserInfo;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesConfig {

    private DesiredCapabilities capabilities;

    public DesiredCapabilities getCapabilities(BrowserInfo browserInfo) {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserInfo.getName());
        capabilities.setCapability("browserVersion", browserInfo.getVersion());
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }
}
