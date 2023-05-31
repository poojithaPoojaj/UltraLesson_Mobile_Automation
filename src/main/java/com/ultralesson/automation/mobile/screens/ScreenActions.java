package com.ultralesson.automation.mobile.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenActions {
    private AppiumDriver appiumDriver;
    private ScreenWaits waits;

    public ScreenActions(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
        this.waits = new ScreenWaits(appiumDriver);
    }

    public void click(By by) {
        waits.waitForElementToBeVisible(by).click();
    }

    public void type(By by, String value) {
        waits.waitForElementToBeVisible(by).sendKeys(value);
    }
    public void takeScreenshot(String fileName) {
        File screenshotFile = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);
        String screenshotDirectory = "path/to/directory";
        try {
            org.apache.commons.io.FileUtils.copyFile(screenshotFile, new File(screenshotDirectory, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
