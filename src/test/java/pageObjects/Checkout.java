package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Checkout {
	

	//input[@placeholder='Search']
	//button[@class='btn btn-default btn-lg']

	//a[normalize-space()='MacBook']

	//button[@id='button-cart']

	//span[normalize-space()='Checkout']

	//input[@id='input-payment-firstname']
	//input[@id='input-payment-lastname']
	//input[@id='input-payment-address-1']
	//input[@id='input-payment-city']
	//input[@id='input-payment-postcode']
	//select[@id='input-payment-country']
	//select[@id='input-payment-zone']
	//continue button//input[@id='button-payment-address']
	
	

	//textarea[@name='comment']
	//input[@name='agree']
	//input[@id='button-payment-method']
	//div[@class='alert alert-danger alert-dismissible']
	
	//label[normalize-space()='I want to use an existing address']
	//input[@value='existing']
	

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement Search_box;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement Search_Btn;
	
	@FindBy(xpath="//a[normalize-space()='MacBook']")
	WebElement MacBook;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement add_Cart_Btn;
	
	@FindBy(xpath="//span[normalize-space()='Checkout']")
	WebElement checkout_Btn;
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	WebElement first_Name;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement last_Name;
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement post_Code;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement Drp;

	@FindBy(xpath="//select[@id='input-payment-zone']")
	WebElement Zone;
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement continuebtn;
	
	@FindBy(xpath="//textarea[@name='comment']")
	WebElement text_msg;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement terms_check;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	WebElement place_Order;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement msg;
	

	public void selectCountry() {
	    Select select = new Select(Drp);
	    select.selectByVisibleText("India");
	}
	
	public void selectZone() {
	    Select select = new Select(Zone);
	    select.selectByVisibleText("Maharashtra");
	}
	
	public void add_Item() {
		
	}
	public void fill_Details() {
		
	}
	
}
