package com.juaracoding.pageobject.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class SearchPage2 {
	
	WebDriver driver;
	
	public SearchPage2() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@class='noo-search']")
	private WebElement btnsearch;
	
	@FindBy(xpath ="//input[@name='s']")
	private WebElement enterType;
	
	@FindBy(xpath ="//a[normalize-space()='black vice high waisted coated skinny jeans']")
	private WebElement btnclothes;
	
	@FindBy(xpath ="//select[@id='pa_color']")
	private WebElement pilihColour2;
	
	@FindBy(xpath ="//select[@id='pa_size']")
	private WebElement pilihSize2;
	
	@FindBy(xpath ="//button[normalize-space()='Add to cart']")
	private WebElement btnAddToCart2;
	
	@FindBy(xpath ="//div[@role='alert']")
	private WebElement txtAddToCart2;
	
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
		Select select = new Select(pilihColour2);
		select.selectByValue("Black");		
	}
	
	public void pilihJumlahSize() {
		Select select = new Select(pilihSize2);
		select.selectByValue("36");	
	}
	
	public void clickAddtoCart() {
		btnAddToCart2.click();
	}
	
	public String getTxtSuccessAddToCart2() {
		return txtAddToCart2.getText();
	}
}
