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

	@FindBy(xpath = "//a[normalize-space()='blue sinner ripped knee high waist skinny jeans']")
	private WebElement btnpilihPakaian;

	@FindBy(xpath = "//div[@class='yith-wcwl-wishlistexistsbrowse']")
	private WebElement addWishList1;

	public void search(String cariPakaian) {
		btnSearch.click();
		this.cariPakaian.sendKeys(cariPakaian + "\n");
		btnpilihPakaian.click();
		addWishList1.click();

	}

//	public void wishList() {
//		addWishList1.click();
//		addWishList2.click();
//		btnShowWishList.click();
//	}

//	public String getTxtResult() {
//		return txtResultText.getText();
//	}

}
