package com.ultralesson.automation.mobile.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomeScreen extends MobileScreen {
    private By profile = By.xpath("//*[@text='Profile']");
    public HomeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public ProfileScreen navToProfile() {
        actions.click(profile);
        return new ProfileScreen(appiumDriver);
    }
}
