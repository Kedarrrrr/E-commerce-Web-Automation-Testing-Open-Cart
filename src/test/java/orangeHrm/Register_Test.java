package orangeHrm;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register_Test{
	public Logger logger;
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//Logger logger = LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/Open%20Cart/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void Close() {
		driver.quit();
	}

	@Test
	public void Register_test_case() {
		Registration r= new Registration(driver);
		r.register();
		//logger.info("Registration Clicked");
		r.setName("Kulnal", "Yelole");
		r.setEmail("yleole@gmail.com");
		r.setTelephone("0900000000");
		r.setPassword("fjeijais");
		//logger.info("Details filled.");
		r.final_Reg();
		Assert.assertEquals(true, r.msg);
	}
	

	
}
