package com.juaracoding.pageobject.ujianToolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class SearchToolsQA {
	
	public WebDriver driver;
	
	public SearchToolsQA() {
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
	
	@FindBy(xpath ="//a[normalize-space()='grey ribbed cut out popper bodycon mini dress']")
	private WebElement btnPickClothes;
	
	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement pilihColour2;

	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement pilihSize2;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddToCart2;
	
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement getTxtSuccesAddToCart;
	
	public void clickButtonSearch() {
		btnsearch.click();
	}
	
	public void enterTypeClothes(String jenis) {
		this.enterType.sendKeys(jenis + "\n");
	}
	
	public void clickClothes1() {
		btnclothes.click();
	}
	
	public void chooseColourAndSize1() {
		Select select1 = new Select(pilihColour);
		select1.selectByValue("Blue");
		Select select2 = new Select(pilihSize);
		select2.selectByValue("36");
	}
	
	public void clickAddToCart1() {
		btnAddToCart.click();
	}
	
	public void clickClothes2() {
		btnPickClothes.click();
	}
	
	public void chooseColourAndSize2() {
		Select select1 = new Select(pilihColour2);
		select1.selectByValue("Grey");
		Select select2 = new Select(pilihSize2);
		select2.selectByValue("Medium");
	}
	
	public void clickAddToCart2() {
		btnAddToCart2.click();
	}
	
	public String getTextSucces() {
		return getTxtSuccesAddToCart.getText();
	}

}
