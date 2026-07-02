package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.Search;
import testBase.BaseClass;

public class Search_Test extends BaseClass {
	Search s = new Search(driver);

	@Test
	public void TC_011_Empty_Search() {
		Login_Page lp=new Login_Page(driver);
		lp.Log_In();
		Assert.assertEquals(s.empty_search(), "There is no product that matches the search criteria.");
	}
	
}
