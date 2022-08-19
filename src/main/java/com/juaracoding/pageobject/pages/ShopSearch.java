package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class ShopSearch {

	private WebDriver driver;

	public ShopSearch() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='noo-search']//i[@class='icon_search']")
	private WebElement btnSearch;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement cariPakaian;

	@FindBy(xpath = "//div[@class='yith-wcwl-wishlistexistsbrowse']")
	private WebElement addWishList1;

	@FindBy(xpath = "//div[@class='yith-wcwl-add-to-wishlist add-to-wishlist-1400 exists wishlist-fragment on-first-load']//a[contains(text(),'Browse Wishlist')]")
	private WebElement addWishList2;

	@FindBy(xpath = "//a[normalize-space()='My Wishlist']")
	private WebElement btnShowWishList;

	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement txtResultText;

	public void search(String cariPakaian) {
		btnSearch.click();
		this.cariPakaian.sendKeys(cariPakaian + "\n");

	}

	public void wishList() {
		addWishList1.click();
		addWishList2.click();
		btnShowWishList.click();
	}

	public String getTxtResult() {
		return txtResultText.getText();
	}
	
}
