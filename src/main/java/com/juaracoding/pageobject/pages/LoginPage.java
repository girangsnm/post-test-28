package com.juaracoding.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement msgError;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtDashboard;
	
	//scenario
//	public void login() {
//		username.sendKeys("Admin"); //step
//		password.sendKeys("admin1234");
//		btnLogin.click();
	
	//jika mengisi lebih dari satu data
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public String msgInvalid() {
		return msgError.getText();
	}
	
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	

}
