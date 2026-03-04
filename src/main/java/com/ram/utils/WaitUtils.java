package com.ram.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	private WebDriver driver;
	private WebDriverWait wait;

	public WaitUtils(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	}
public void waitforElementvisible(By locater)
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
}
public void waitforElementClickable(By locator)
{
	wait.until(ExpectedConditions.elementToBeClickable(locator));
}
}
