package com.juaracoding.ujian.minggu.ke5;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.ujianToolsQA.LoginToolsQA;
import com.juaracoding.pageobject.utils.ShopConstans;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginToolsQA {

	public static WebDriver driver;
	private LoginToolsQA loginToolsQA;

	@Before
	public void setUp() {
		DriverSingleton.getInstance(ShopConstans.CHROME);
		loginToolsQA = new LoginToolsQA();
	}
		
	@AfterAll
	public static void closeBrowser() {
		delay(1);
		DriverSingleton.closeObjectInstance();
	}

	@When("User go to web toolsqa")
	public void user_go_to_web_toolsqa() {
		driver = DriverSingleton.getDriver();
		driver.get(ShopConstans.URL);
	}

	@And("User enter username password")
	public void user_enter_username_password() {
		loginToolsQA.inputToLogin("juaracoding123", "juaracoding123");
	}

	@And("User click button login")
	public void user_click_button_login() {
		loginToolsQA.buttonLogin();
	}

	@Then("User validated")
	public void user_validated() {
		assertEquals(loginToolsQA.txtMyAccount(), "MY ACCOUNT");
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
