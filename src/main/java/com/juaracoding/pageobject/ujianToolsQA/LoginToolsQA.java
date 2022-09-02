package com.juaracoding.pageobject.ujianToolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class LoginToolsQA {

	public WebDriver driver;

	public LoginToolsQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='username']")
	private WebElement inputUsername;
	
	@FindBy(xpath ="//input[@id='password']")
	private WebElement inputPassword;
	
	@FindBy(xpath ="//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath ="//h1[@class='page-title']")
	private WebElement getTxtMyAccount;
	
	
	public void inputToLogin(String username, String password){
		this.inputUsername.sendKeys(username);
		this.inputPassword.sendKeys(password);		
	}
	
	public void buttonLogin() {
		btnLogin.click();
	}
	
	public String txtMyAccount() {
		return getTxtMyAccount.getText();
	}

}
