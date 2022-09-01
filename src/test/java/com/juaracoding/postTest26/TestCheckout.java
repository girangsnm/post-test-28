package com.juaracoding.postTest26;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.shop.Checkout;
import com.juaracoding.pageobject.utils.ShopConstans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCheckout {
	
	public static WebDriver driver;
	private static ExtentTest extentest;
	private Checkout checkout = new Checkout();
	
	public TestCheckout() {
		driver = PostTestHooks.driver;
		extentest = PostTestHooks.extentest;
	}
	
	@When("User go to web shoptools")
	public void user_go_to_web_shoptools() {
		driver = DriverSingleton.getDriver();
		driver.get(ShopConstans.URL);
		extentest.log(LogStatus.PASS, "User go to web shoptools");
	}
	
	@And("User click view cart")
	public void user_click_view_cart() {
		checkout.clickBtnCart();
		extentest.log(LogStatus.PASS, "User click view cart");
	}
	
	@And("User click proceed to checkout")
	public void user_click_proceed_to_checkout() {
		checkout.clickBtnCheckout();
		extentest.log(LogStatus.PASS, "User click proceed to checkout");
	}	
	
	@Then("User place order")
	public void user_place_order() {
		assertEquals(checkout.getTxtCheckout(), "“blue sinner ripped knee high waist skinny jeans” has been added to your cart.");
		extentest.log(LogStatus.PASS, "User place order");
	}
	
	
	
	
}
