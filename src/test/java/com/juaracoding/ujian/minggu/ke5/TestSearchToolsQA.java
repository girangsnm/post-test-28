package com.juaracoding.ujian.minggu.ke5;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.ujianToolsQA.SearchToolsQA;
import com.juaracoding.pageobject.utils.Constants;
import com.juaracoding.pageobject.utils.ShopConstans;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchToolsQA {

	public static WebDriver driver;
	private SearchToolsQA searchToolsQA;
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		searchToolsQA = new SearchToolsQA();
	}
	
	@When("User go to web toolsqa")
	public void user_go_to_web_toolsqa() {
		driver = DriverSingleton.getDriver();
		driver.get(ShopConstans.URL);
	}

	@And("User click button search")
	public void user_click_button_search() {
		searchToolsQA.clickButtonSearch();
	}

	@And("User enter type of clothes")
	public void user_enter_type_of_clothes() {
		searchToolsQA.enterTypeClothes("jeans");
	}

	@And("User pick and click clothes1")
	public void user_pick_and_click_clothes1() {
		searchToolsQA.clickClothes1();
	}

	@And("User choose colour and size1")
	public void user_choose_colour_and_size1() {
		searchToolsQA.chooseColourAndSize1();
	}

	@And("User click add to cart")
	public void user_click_add_to_cart() {
		searchToolsQA.clickAddToCart1();
	}

	@And("User pick and click another one clothes")
	public void user_pick_and_click_another_one_clothes() {
		searchToolsQA.clickClothes2();
	}

	@And("User choose colour and size2")
	public void user_choose_colour_and_size2() {
		searchToolsQA.chooseColourAndSize2();
	}

	@And("User click add to cart2")
	public void user_click_add_to_cart2() {
		searchToolsQA.clickAddToCart2();
	}

	@Then("User success select")
	public void user_success_select() {
		assertEquals(searchToolsQA.getTextSucces(), "GREY RIBBED CUT OUT POPPER BODYCON MINI DRESS");
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
