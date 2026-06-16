package testCases;

import testBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Registration;

public class TC_003_Registration extends BaseClass{
	//this test case checks weather system allows duplicate registration details or not.
	//div[@class='alert alert-danger alert-dismissible']
	Registration r= new Registration(driver);
	Login_Page lp=new Login_Page(driver);
	
	@Test(priority=1)
	public void TC_001() {
		r.register();
		r.setName("jethal", "Gadha");
		r.setEmail("gadhaelectronics@gmail.com");
		r.setTelephone("2020202020");
		r.setPassword("tapukepapa");
		r.final_Reg();
		Assert.assertEquals(" Warning: E-Mail Address is already registered!", r.getArltMsg());
	}
	
	public void TC_004() {
		
		r.register();
		r.setName("Ankit", "Bayanpuriya");
		r.setEmail("ankitbayanpuriya@gmail.com");
		r.setTelephone("2020202020");
		r.setPassword("tapukepapa");
		r.final_Reg();
		Assert.assertEquals("Your Account Has Been Created!", r.getMsg());
	}		
	
}
