package orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

	WebDriver driver;
	public BaseClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath="http://localhost/Open%20Cart/")
	WebDriver web;*/
}
