package com.ram.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ram.base.BaseTest;
import com.ram.pages.DashboardPage;
import com.ram.pages.LoginPage;

public class LogoutTest extends BaseTest{
	@Test
	public void logoutTest()
	{
		LoginPage loginpage =new LoginPage(driver);
		loginpage.enterUsername("Admin");
		loginpage.enterPassword("admin123");
		loginpage.clickLogin();
		
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.logout();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		System.out.println(driver.getCurrentUrl());
	}
	

}
