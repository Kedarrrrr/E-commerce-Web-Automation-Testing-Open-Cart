package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Wishlist;
import testBase.BaseClass;

public class Wishlist_Test extends BaseClass{

	@Test(priority=1)
	public void TC_005_add_wish() throws InterruptedException {
		Wishlist wl=new Wishlist(driver);
		Login_Page lt = new Login_Page(driver);
		lt.start();
		lt.setMail("gadhaelectronics@gmail.com");
		lt.setPwd("tapukepapa");
		lt.logintn.click();
		wl.search("MacBook");
		wl.wishlist_item();
		Assert.assertEquals(" Success: You have added MacBook to your wish list!",wl.check_item() );
	}
	
	@Test(priority=2)
	public void TC_006_remove_wish() {
		Wishlist wl=new Wishlist(driver);
		String msg=wl.wish_list();
		Assert.assertEquals(msg, "Your wish list is empty.");
	}
}
