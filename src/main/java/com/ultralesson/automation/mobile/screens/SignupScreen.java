package com.ultralesson.automation.mobile.screens;

import com.ultralesson.automation.mobile.models.User;
import io.appium.java_client.AppiumDriver;

public class SignupScreen {
        private AppiumDriver appiumDriver;

        public SignupScreen(AppiumDriver appiumDriver) {
                this.appiumDriver = appiumDriver;
        }


        public HomeScreen signup(User client) {
                return new HomeScreen(appiumDriver);
        }
        }
