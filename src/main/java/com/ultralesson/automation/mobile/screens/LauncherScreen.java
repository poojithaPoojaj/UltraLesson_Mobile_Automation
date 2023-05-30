package com.ultralesson.automation.mobile.screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LauncherScreen {
    private AppiumDriver appiumDriver;
    By createClientAccountBtn = By.xpath("//*[@text='CREATE CLIENT ACCOUNT']");

    public LauncherScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public SignupScreen navToClientSignup() {
        appiumDriver.findElement(createClientAccountBtn).click();
        return new SignupScreen(appiumDriver);
    }
}
