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
	By txt_profile_loc=By.xpath("//img[@alt='client brand banner']");



	//Actions
	public void Login(String user, String pwd) {
		driver.findElement(txt_user_loc).sendKeys(user);
		driver.findElement(txt_password_loc).sendKeys(pwd);
		driver.findElement(txt_login_loc).click();
		}
	public boolean ProfilePicture() {
		boolean pic=driver.findElement(txt_profile_loc).isDisplayed();
		return pic;
	}
	
}
