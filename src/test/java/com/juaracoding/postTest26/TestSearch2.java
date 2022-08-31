package com.juaracoding.postTest26;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.shop.SearchPage2;
import com.juaracoding.pageobject.utils.ShopConstans;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearch2 {
	
	public static WebDriver driver;
	private SearchPage2 searchpage2 = new SearchPage2();
	
	public TestSearch2() {
		driver = PostTestHooks.driver;
	}
	
	@When("User go to web shoptools")
	public void user_go_to_web_shoptools() {
		driver = DriverSingleton.getDriver();
		driver.get(ShopConstans.URL);
	}
	
	@And("User click button search")
	public void user_click_button_search() {
		searchpage2.clickBtnSearch();
	}
	
	@And("User enter type of clothes2")
	public void user_enter_type_of_clothes2() {
		searchpage2.typeClothes("jeans");
	}
	
	@And("User click clothes")
	public void user_click_clothes() {
		searchpage2.clickTypeClothes();
	}
	
	@And("User choose colour")
	public void user_choose_colour() {
		searchpage2 = new SearchPage2();
	}
	
	@And("User choose size")
	public void user_choose_size() {
		searchpage2 = new SearchPage2();
	}
	
	@And("User click add to cart")
	public void user_click_add_to_cart() {
		searchpage2.clickAddtoCart();
	}
	@Then("User success select")
	public void user_success_select() {
		assertEquals(searchpage2.getTxtSuccessAddToCart2(), "“black vice high waisted coated skinny jeans” has been added to your cart.");
	}
	
	
	
	
}
