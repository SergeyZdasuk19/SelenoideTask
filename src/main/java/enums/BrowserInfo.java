package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BrowserInfo {

    CHROME("chrome", "85.0"),
    FIREFOX("firefox", "79.0"),
    OPERA("opera", "70.0");

    private String name;
    private String version;
}
