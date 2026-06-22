package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Page extends BasePage{

	public Contact_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//span[normalize-space()='123456789']
	//i[@class='fa fa-phone']
	//i[@class='fa fa-phone']
	//html
	//input[@id='input-name']
	//input[@id='input-email']
	//textarea[@id='input-enquiry']
	
	//input[@value='Submit']
	//input[@value='Submit']
	//html
	//html
	//input[@value='Submit']
	//input[@value='Submit']
	//body
	
	//p[contains(text(),'Your enquiry has been successfully sent to the sto')]
	//p[contains(text(),'Your enquiry has been successfully sent to the sto')]

	@FindBy(xpath="//i[@class='fa fa-phone']")
	WebElement contactbtn;
	
	@FindBy(xpath="//input[@id='input-name']")
	WebElement contact_name;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement contact_email;
	
	@FindBy(xpath="//textarea[@id='input-enquiry']")
	WebElement enquiery;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submitbtn;
	
	@FindBy(xpath="//p[contains(text(),'Your enquiry has been successfully sent to the sto')]")
	WebElement display_txt;
	
	@FindBy(xpath="//div[@class='text-danger']")
	WebElement danger_txt;
	
	
	public void contact(String name, String email) {
		contactbtn.click();
		contact_name.sendKeys(name);
		contact_email.sendKeys(email);
	}
	
	public String enquiery_msg(String msg) {
		enquiery.sendKeys(msg);
		submitbtn.click();
		return display_txt.getText();
		//Your enquiry has been successfully sent to the store owner
	}

	public String danger_msg(String msg) {
		enquiery.sendKeys(msg);
		submitbtn.click();
		return danger_txt.getText();
		//Your enquiry has been successfully sent to the store owner
	}

	
}
