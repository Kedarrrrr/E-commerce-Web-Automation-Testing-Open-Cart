package testBase;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

    protected WebDriver driver;
    public Logger logger;

    @BeforeClass
    @Parameters({"os", "browser"})
    public void setup(String os, String br) {

    	switch(br.toLowerCase()) {
    	
    	case "chrome" : driver =new ChromeDriver();break;
    	case "edge" : driver= new EdgeDriver(); break;
    	case "firefox" : driver=new FirefoxDriver(); break;
    	default : System.out.println("Invalid browser name..");return;
    	
    	}
    	
        logger = LogManager.getLogger(this.getClass());

        //driver = new ChromeDriver();

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