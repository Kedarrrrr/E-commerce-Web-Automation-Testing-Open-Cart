package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wishlist extends BasePage{

	public Wishlist(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//span[normalize-space()='My Account']
	//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']
	//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']
	//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']
	//a[@class='list-group-item'][normalize-space()='Wish List']
	//a[@class='list-group-item'][normalize-space()='Wish List']
	//a[@class='list-group-item'][normalize-space()='Wish List']
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement srh;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement srhbtn;
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[1]//h4[1]//a[1]")
	WebElement macBook;
	
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']")
	WebElement whishbtn;
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
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
	
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement success;


	//span[normalize-space()='Shopping Cart']"//i[@class='fa fa-heart']"undefined
	//div[@class='table-responsive']
	//span[normalize-space()='Shopping Cart']"//a[@class='list-group-item'][normalize-space()='Wish List']"undefined
	//i[@class='fa fa-heart']
	//i[@class='fa fa-heart']
	//i[@class='fa fa-heart']
	//a[normalize-space()='MacBook']
	//div[@id='product-product']//div[@class='btn-group']//button[1]
	//div[@id='product-product']//div[@class='btn-group']//button[1]
	//button[@type='button']//i[@class='fa fa-heart']
	//div[@id='content']//div[1]//div[1]//div[2]//div[1]//h4[1]//a[1]
	//div[@class='alert alert-success alert-dismissible']
	//div[@id='content']//div[1]//div[1]//div[2]//div[1]//h4[1]//a[1]
	
	public void search(String product_name) {
		srh.sendKeys(product_name);
		srhbtn.click();
	}
	public void wishlist_item() throws InterruptedException {
		macBook.click();
		whishbtn.click();
		accbtn.click();
		drpmyacc.click();
		whishlistbtn.click();
	}
	public String wish_list() {
		//whishlistbtn.click();
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
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement txt=mywait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//div[contains(@class,'alert-success')]")
			));
		String msg=txt.toString();
		return msg;
	}

	
}
