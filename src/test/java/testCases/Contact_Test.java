package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Contact_Page;
import pageObjects.Login_Page;
import testBase.BaseClass;
import utilities.DataProviders;

public class Contact_Test extends BaseClass {

	@Test(dataProvider="EnquiryData", dataProviderClass=DataProviders.class)
	public void TC_007(String enq, String val) {
		Login_Page lt = new Login_Page(driver);
		lt.start();
		lt.setMail("gadhaeletronis@gmail.com");
		lt.setPwd("tapukeppa");
		lt.logintn.click();
		Contact_Page cp=new Contact_Page(driver);
		cp.contact("Jethalal","gadhaelectronics@gmail.com");
		try {
			if(val.equals("valid")) {
				String txt=cp.enquiery_msg(enq);
				Assert.assertEquals("Your enquiry has been successfully sent to the store owner!",txt);
			}else if(val.equals("invalid")) {
				String txt= cp.danger_msg(enq);
				Assert.assertEquals("Enquiry must be between 10 and 3000 characters!", txt);
			}
		}catch(Exception e) {
			System.out.print("TC_007 got failed");
		}
		
	}
	
}
