package com.juaracoding.ujian.minggu.ke5;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.shop.Checkout;
import com.juaracoding.pageobject.ujianToolsQA.CheckoutToolsQA;
import com.juaracoding.pageobject.utils.ShopConstans;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCheckoutToolsQA {

	public static WebDriver driver;
	private CheckoutToolsQA checkoutToolsQA = new CheckoutToolsQA();

	@When("User go to web shoptools1")
	public void user_go_to_web_shoptools() {
		driver = DriverSingleton.getDriver();
		driver.get(ShopConstans.URL);

	}

	@And("User click view cart")
	public void user_click_view_cart() {
		checkoutToolsQA.clickBtnCart();

	}

	@And("User click proceed to checkout")
	public void user_click_proceed_to_checkout() {
		checkoutToolsQA.clickBtnCheckout();

	}

	@Then("User place order")
	public void user_place_order() {
		assertEquals(checkoutToolsQA.getTxtCheckout(),
				"“blue sinner ripped knee high waist skinny jeans” has been added to your cart.");
	}

}
