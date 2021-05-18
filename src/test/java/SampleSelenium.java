import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSelenium {
    WebDriver driver ;

    @Before
    public void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void driverTest() throws Exception{
        driver.get("https://facebook.com");
        Thread.sleep(5000);
    }

}
