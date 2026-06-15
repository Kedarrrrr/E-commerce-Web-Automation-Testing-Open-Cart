package testBase;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected WebDriver driver;
    public Logger logger;

    @BeforeClass
    public void setup() {

        logger = LogManager.getLogger(this.getClass());

        driver = new ChromeDriver();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.get("http://localhost/Open%20Cart/");
    }

    @AfterClass
    public void tear() {

        if(driver != null) {
            driver.quit();
        }
    }
}