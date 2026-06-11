package orangeHrm;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {

	WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/Open%20Cart/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Login_test_case() {
		Registration r= new Registration(driver);
		r.register();
	}
	
	@AfterClass
	public void Close() {
		driver.quit();
	}
	
}
