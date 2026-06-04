package orangeHrm;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {

	WebDriver driver;
	
	@BeforeClass
	void Setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void Login_test_case() {
		LoginPage lp = new LoginPage(driver);
		lp.Login("Admin", "admin123");
		Assert.assertTrue(lp.ProfilePicture());
	}
	
	@AfterClass
	void Close() {
		driver.quit();
	}
	
}
