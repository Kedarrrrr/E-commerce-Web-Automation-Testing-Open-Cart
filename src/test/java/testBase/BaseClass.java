package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

    protected WebDriver driver;
    public Logger logger;
    public Properties p;

    @SuppressWarnings("deprecation")
	@BeforeClass
    @Parameters({"os", "browser"})
    public void setup(String os, String br) throws IOException {

    	FileReader fi=new FileReader("/Web_Testing/src/test/resources/Config.properties");
    	p=new Properties();
    	p.load(fi);
    	logger=LogManager.getLogger(this.getClass() );
    	
    	if(p.getProperty("environment").equalsIgnoreCase("remote")) {
    		DesiredCapabilities cap= new DesiredCapabilities();
    		
    		if(os.equalsIgnoreCase("windows")) {
    			cap.setPlatform(Platform.WIN11);
    		}else if(os.equalsIgnoreCase("linux")) {
    			cap.setPlatform(Platform.LINUX);
    		}else if(os.equalsIgnoreCase("mac")) {
    			cap.setPlatform(Platform.MAC);
    		}else {
    			System.out.println("NO such Operating System exists.");
    		}
    		switch(br.toLowerCase()) {
        	case "chrome": cap.setBrowserName("chrome");break;
        	case "edge": cap.setBrowserName("MicrosoftEdge");break;
        	case "firefox": cap.setBrowserName("firefox");break;
        	}
    		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
    		
    	}
    	if(p.getProperty("environment").equalsIgnoreCase("local")) {
    		switch(br.toLowerCase()) {
        	case "chrome":driver=new ChromeDriver();
        	case "edge": driver=new EdgeDriver();
        	case "firefox": driver=new FirefoxDriver();
        	}
    	}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("URL")); // reading url from properties file.
		driver.manage().window().maximize();
    	
    }

    @AfterClass
    public void tear() {

        if(driver != null) {
            driver.quit();
        }
    }
}