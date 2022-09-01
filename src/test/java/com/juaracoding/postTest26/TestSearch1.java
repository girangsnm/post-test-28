package com.juaracoding.postTest26;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.shop.SearchPage1;
import com.juaracoding.pageobject.utils.ShopConstans;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearch1 {
	
	public static WebDriver driver;
	private static ExtentTest extentest;
	private SearchPage1 searchpage1 = new SearchPage1();
	
	public TestSearch1() {
		driver = PostTestHooks.driver;
		extentest = PostTestHooks.extentest;
	}
	
	@When("User go to web shoptools")
	public void user_go_to_web_shoptools() {
		driver = DriverSingleton.getDriver();
		driver.get(ShopConstans.URL);
		extentest.log(LogStatus.PASS, "User go to web shoptools");
	}
	
	@And("User click button search")
	public void user_click_button_search() {
		searchpage1.clickBtnSearch();
		extentest.log(LogStatus.PASS, "User click button search");
	}
	
	@And("User enter type of clothes1")
	public void user_enter_type_of_clothes1() {
		searchpage1.typeClothes("jeans");
		extentest.log(LogStatus.PASS, "User enter type of clothes1");
	}
	
	@And("User click clothes")
	public void user_click_clothes() {
		searchpage1.clickTypeClothes();
		extentest.log(LogStatus.PASS, "User click clothes");
	}
	
	@And("User choose colour")
	public void user_choose_colour() {
		searchpage1 = new SearchPage1();
		extentest.log(LogStatus.PASS, "User choose colour");
	}
	
	@And("User choose size")
	public void user_choose_size() {
		searchpage1 = new SearchPage1();
		extentest.log(LogStatus.PASS, "User choose size");
	}
	
	@And("User click add to cart")
	public void user_click_add_to_cart() {
		searchpage1.clickAddtoCart();
		extentest.log(LogStatus.PASS, "User click add to cart");
	}
	@Then("User success select")
	public void user_success_select() {
		assertEquals(searchpage1.getTxtSuccessAddToCart(), "“blue sinner ripped knee high waist skinny jeans” has been added to your cart.");
		extentest.log(LogStatus.PASS, "User success select");
	}
	
	
	
	
}
