package com.ultralesson.automation.mobile.screens;

import com.ultralesson.automation.mobile.models.User;
import io.appium.java_client.AppiumDriver;

public class ProfileScreen extends MobileScreen {
    public ProfileScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public User getProfileDetails() {
        return new User();
    }

}
