package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Login_Page;

public class Login_Test {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/Open%20Cart/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tear() {
		driver.quit();
	}
	
	@Test
	public void TC_02() {
		Login_Page lt = new Login_Page(driver);
		lt.start();
		lt.setMail("gadhaelectronics@gmail.com");
		lt.setPwd("tapukepapa");
		lt.logintn.click();
		
		Assert.assertEquals("My Account", lt.compare_txt());
	}
}
