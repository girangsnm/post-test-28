package com.juaracoding.pageobject;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.pages.ShopSearch;

public class TestSearch {

	public static WebDriver driver;
	private ShopSearch shopsearch;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstance("Chrome");
		driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);
		
	}

	@BeforeMethod
	public void pageObject() {
		shopsearch = new ShopSearch();
	}

	@Test
	public void testValidSearch() {
		shopsearch.search("Jeans");
		
	}
	
//	@Test
//	public void addWishlist() {
//		shopsearch.wishList();
//		assertEquals(shopsearch.getTxtResult(), "WISHLIST");
//	}

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}