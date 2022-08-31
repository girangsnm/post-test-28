package com.juaracoding.pageobject.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class SearchPage1 {

	private WebDriver driver;

	public SearchPage1() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnsearch;

	@FindBy(xpath = "//input[@name='s']")
	private WebElement enterType;

	@FindBy(xpath = "//a[normalize-space()='blue sinner ripped knee high waist skinny jeans']")
	private WebElement btnclothes;

	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement pilihColour;

	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement pilihSize;

	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement txtAddToCart;

	public void clickBtnSearch() {
		btnsearch.click();
	}

	public void typeClothes(String type) {
		this.enterType.sendKeys(type + "\n");
	}

	public void clickTypeClothes() {
		btnclothes.click();
	}

	public void pilihTypeColour() {
		Select select = new Select(pilihColour);
		select.selectByValue("Blue");
	}

	public void pilihJumlahSize() {
		Select select = new Select(pilihSize);
		select.selectByValue("36");
	}

	public void clickAddtoCart() {
		btnAddToCart.click();
	}

	public String getTxtSuccessAddToCart() {
		return txtAddToCart.getText();
	}
}
