package com.ram.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ram.base.BaseTest;
import com.ram.pages.LoginPage;

public class LoginTest extends BaseTest {
	@DataProvider(name="loginData")
	public Object[][] getData(){
		return new Object[][]
				{ {"Admin", "admin123"},
            {"Admin", "wrongPass"}
				};
		
		
	}
	@Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        LoginPage loginPage = new LoginPage(driver);

        // Perform login
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        
        String url = loginPage.getCurrentURL();
        

        
        System.out.println("URL: " + url);

        // Validation logic
        if (username.equals("Admin") && password.equals("admin123")) {

            Assert.assertTrue(url.contains("dashboard"));
            
        } else {
              String error =loginPage.getErrorMessage();
            Assert.assertEquals(error, "Invalid credentials");
           // System.out.println(driver.getPageSource());
          

        }
    }
}