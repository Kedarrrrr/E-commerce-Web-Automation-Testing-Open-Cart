package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class Login_Page extends BaseClass{

	WebDriver driver;
	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement accbtn ;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement logbtn ;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_mail ;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pwd ;
	
	@FindBy(xpath="//input[@value='Login']")
	public
	WebElement logintn ;
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement verify ;
	
	public String compare_txt() {
		String txt=verify.getText();
		return txt;
	}
	
	public void start() {
		accbtn.click();
		logbtn.click();
	}
	
	public void setMail(String fn) {
		txt_mail.sendKeys(fn);
	}
	public void setPwd(String pw) {
		txt_pwd.sendKeys(pw);
	}
	public void log() {
		logintn.click();
	}
	
}
