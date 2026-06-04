package orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By txt_user_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By txt_login_loc=By.xpath("//button[normalize-space()='Login']");

	//Actions
	public void Login(String user, String pwd) {
		txt_user_loc.s
	}
	
}
