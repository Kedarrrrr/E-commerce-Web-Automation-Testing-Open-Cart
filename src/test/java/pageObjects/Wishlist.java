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
	
	@FindBy(xpath="//span[normalize-space()='Wish List (1)']")
	WebElement heartbtn;

	@FindBy(xpath="//p[normalize-space()='Your wish list is empty.']")
	WebElement empty_msg;
	
	@FindBy(xpath="//div[@class='table-responsive']")
	WebElement item;
	
	@FindBy(xpath="//a[@class='btn btn-danger']")
	WebElement rmbtn;
	
	
	//div[@class='table-responsive']

	//i[@class='fa fa-heart']
	//i[@class='fa fa-heart']
	//i[@class='fa fa-heart']
	//a[normalize-space()='MacBook']
	
	public void search(String product_name) {
		srh.sendKeys(product_name);
		srhbtn.click();
	}
	public void wishlist_item() throws InterruptedException {
		macBook.click();
		whishbtn.click();
		accbtn.click();
		heartbtn.click();
		whishlistbtn.click();
	}
	public String wish_list() {
		whishlistbtn.click();
		boolean i=item.isDisplayed();
		if(i) {
			rmbtn.click();
			//p[normalize-space()='Your wish list is empty.']
			String txt=empty_msg.getText();
			return txt;
			}else {
				String msg="No item was added to wishlist";
				return msg;
			}
		}
		
	public String check_item() {
		//MacBook
		String txt=verify_product.getText();
		return txt;
	}


	
}
