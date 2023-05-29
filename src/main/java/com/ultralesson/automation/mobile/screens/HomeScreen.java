package com.ultralesson.automation.mobile.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeScreen {
    private AppiumDriver appiumDriver;
    private By profile = By.xpath("//*[@text='Profile']");
    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public ProfileScreen navToProfile() {
        appiumDriver.findElement(profile).click();
        return new ProfileScreen(appiumDriver);
    }
}
