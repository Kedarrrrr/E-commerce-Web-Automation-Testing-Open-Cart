package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends BasePage{

	public Search(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement sb;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement txt;
	

	
	public String empty_search() {
		sb.click();
		return txt.getText();
		//There is no product that matches the search criteria.
	}

}
