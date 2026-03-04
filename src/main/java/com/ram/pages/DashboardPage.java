package com.ram.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ram.utils.WaitUtils;

public class DashboardPage {
	private WebDriver driver;
	private WaitUtils wait;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitUtils(driver);
	}
	private By profileicon = By.xpath("//span[@class='oxd-userdropdown-tab']");
	private By logoutbtn = By.linkText("Logout");
	
	public void logout()
	{
		wait.waitforElementClickable(profileicon);
		driver.findElement(profileicon).click();
		
		wait.waitforElementClickable(logoutbtn);
		driver.findElement(logoutbtn).click();
	}
	

}
