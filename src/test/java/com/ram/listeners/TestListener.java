package com.ram.listeners;

import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ram.utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result) {

        WebDriver driver = null;

        try {

            Object currentClass = result.getInstance();

            Field field = result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver");

            field.setAccessible(true);

            driver = (WebDriver) field.get(currentClass);

        } catch (Exception e) {

            e.printStackTrace();

        }

        ScreenshotUtils.captureScreenshot(driver, result.getName());

    }

}
