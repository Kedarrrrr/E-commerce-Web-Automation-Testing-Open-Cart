package orangeHrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration extends BaseClass {
	
	public Registration(WebDriver driver) {
		//super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement accBtn;
	

	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement regBtn;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement eMail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement cnfpwd;
	
	//Radio button
	@FindBy(xpath="//input[@value='0']")
	WebElement subs;
	
	//checkbox
	@FindBy(xpath="//input[@name='agree']")
	WebElement policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement cntBtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msg;
	
	
	//Action methods
	public void register() {
		accBtn.click();
		regBtn.click();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
	}
	
	public void setName(String name, String lastname) {
		
		firstName.sendKeys(name);
		lastName.sendKeys(lastname);
		
	}
	
	public void setEmail(String mail) {
		
		eMail.sendKeys(mail);
		
	}
	
	public void setTelephone(String phone) {
		
		telephone.sendKeys(phone);
	}
	
	public void setPassword(String pass) {
		
		pwd.sendKeys(pass);
		cnfpwd.sendKeys(pass);
	}
	
	public void final_Reg() {
		
		subs.click();
		policy.click();
		cntBtn.click();
		
	}
	
}
