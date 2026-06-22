package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Shopping_Cart;
import testBase.BaseClass;

public class Shopping_Cart_Test extends BaseClass {
	Shopping_Cart sc=new Shopping_Cart(driver);
	@Test()
	public void TC_008_add_Item_Cart() {
		sc.add_cart();
		Assert.assertEquals(true, sc.Table());
	}
	
	@Test()
	public void TC_009_Remove_Item_Cart() {
		Assert.assertEquals(sc.remove_item(),"Your shopping cart is empty!");
	}
}
