package com.ram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ram.utils.WaitUtils;

public class LoginPage {

	private WebDriver driver;
	private WaitUtils wait;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}

	// Locators
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By loginButton = By.cssSelector("button[type='submit']");
	private By errorMessage=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");


	// Actions
	public void enterUsername(String username) {
		wait.waitforElementvisible(usernameField);
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		wait.waitforElementClickable(loginButton);
		driver.findElement(loginButton).click();
	}
	
	public String getErrorMessage()
	{
		wait.waitforElementvisible(errorMessage);;
		return driver.findElement(errorMessage).getText();
	}

	public String getCurrentURL() {
	return driver.getCurrentUrl();
	}
}