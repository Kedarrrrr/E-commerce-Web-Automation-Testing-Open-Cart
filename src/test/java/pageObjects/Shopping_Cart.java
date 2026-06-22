package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Cart extends BasePage {

	public Shopping_Cart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//div[@class='table-responsive']
	//i[@class='fa fa-home']
	//html
	//div[@class='caption']//a[contains(text(),'MacBook')]
	
	//html
	//html
	//a[@title='Shopping Cart']
	//button[@id='button-cart']
	//span[normalize-space()='Shopping Cart']
	//html
	//html
	//span[normalize-space()='Shopping Cart']
	
	@FindBy(xpath="//div[@class='table-responsive']")
	WebElement table;
	
	@FindBy(xpath="//i[@class='fa fa-home']")
	WebElement homebtn;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement view_cart;
	
	@FindBy(xpath="//div[@class='caption']//a[contains(text(),'MacBook')]")
	WebElement product;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement cart_btn;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/div[1]/span[1]/button[2]")
	WebElement rmbtn;
	
	@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	WebElement empty_cart_msg;
	
	public void add_cart() {
		homebtn.click();
		product.click();
		cart_btn.click();
	}
	public boolean Table() {
		return table.isDisplayed();
	}
	public String remove_item() {
		view_cart.click();
		while(table.isDisplayed()) {
			rmbtn.click();
		}
		String txt=empty_cart_msg.getText();
		return txt;
	}
	
}
