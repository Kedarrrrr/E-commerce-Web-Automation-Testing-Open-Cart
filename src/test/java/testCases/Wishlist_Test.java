package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Wishlist;
import testBase.BaseClass;

public class Wishlist_Test extends BaseClass{

	@Test(priority=1)
	public void TC_005_add_wish() {
		Wishlist wl=new Wishlist(driver);
		wl.search("MacBook");
		wl.wishlist_item();
		Assert.assertEquals("MacBook",wl.check_item() );
	}
	
}
