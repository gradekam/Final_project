package selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SdaBaseTest {

    protected WebDriver driver;

    @BeforeAll
    public static void setUpEnv() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anna\\Documents\\Tester_materialy\\chromedriver.exe");
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void cleanUp() {
        driver.quit();
    }


}
