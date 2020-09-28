import org.junit.jupiter.api.Test;

public class CustomTest extends CommonTest{

    @Test
    public void firstTest() throws InterruptedException {
        remoteWebDriver.get("http://todomvc.com/examples/vanillajs/");
        Thread.sleep(5000);
    }
}
