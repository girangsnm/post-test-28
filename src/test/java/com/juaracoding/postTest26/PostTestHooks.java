package com.juaracoding.postTest26;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.drivers.DriverSingleton;
import com.juaracoding.pageobject.utils.Constants;
import com.juaracoding.pageobject.utils.ShopUtils;
import com.juaracoding.pageobject.utils.TestScenarioShop;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class PostTestHooks {
	
	public static WebDriver driver;
	public static ExtentTest extentest;
	public static ExtentReports reports = new ExtentReports("target/extentshop-reports.html");
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		TestScenarioShop[] tests = TestScenarioShop.values();
		extentest = reports.startTest(tests[ShopUtils.testShopCount].getTestShopName());
		ShopUtils.testShopCount++;
	}
	
	@AfterAll
	public static void closeBrowser() {
		delay(2);
		DriverSingleton.closeObjectInstance();
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void scroll(int vertical) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,"+vertical+")");
	}
	
}
