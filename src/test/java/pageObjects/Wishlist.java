package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlist extends BasePage{

	public Wishlist(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement srh;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement srhbtn;
	
	@FindBy(xpath="//a[normalize-space()='MacBook']")
	WebElement macBook;
	
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
	WebElement whishbtn;
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement accbtn;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
	WebElement drpmyacc;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Wish List']")
	WebElement whishlistbtn;
	
	@FindBy(xpath="//a[normalize-space()='MacBook']")
	WebElement verify_product;
	
	public void search(String product_name) {
		srh.sendKeys(product_name);
		srhbtn.click();
	}
	public void wishlist_item() {
		macBook.click();
		whishbtn.click();
		accbtn.click();
		drpmyacc.click();
		whishlistbtn.click();
	}
	public String check_item() {
		//MacBook
		String txt=verify_product.getText();
		return txt;
	}


	
}
