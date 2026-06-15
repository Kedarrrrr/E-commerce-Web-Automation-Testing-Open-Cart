package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import testBase.BaseClass;

public class Login_Test extends BaseClass {


	@Test
	public void TC_02() {
		Login_Page lt = new Login_Page(driver);
		lt.start();
		lt.setMail("gadhaelectronics@gmail.com");
		lt.setPwd("tapukepapa");
		lt.logintn.click();
		
		Assert.assertEquals("My Account", lt.compare_txt());
	}
}
