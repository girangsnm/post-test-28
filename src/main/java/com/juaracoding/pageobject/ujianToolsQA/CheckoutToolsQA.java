package com.juaracoding.pageobject.ujianToolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class CheckoutToolsQA {
	
	WebDriver driver;

	public CheckoutToolsQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='cart-name-and-total']")
	private WebElement btnCart;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement btnCheckout;

	@FindBy(xpath = "//*[@id=\"noo-site\"]/section/div/div/h1")
	private WebElement txtCheckout;

	public void clickBtnCart() {
		btnCart.click();
	}

	public void clickBtnCheckout() {
		btnCheckout.click();
	}

	public String getTxtCheckout() {
		return txtCheckout.getText();
	}


}
