package com.ultralesson.automation.mobile.screens;

import com.ultralesson.automation.mobile.models.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SignupScreen extends MobileScreen{

        By signupBtn = By.xpath("//*[@text='SIGNUP']");
        By clientSignUpButton = MobileBy.AndroidUIAutomator("text(\"Client Signup\")");
        By email=MobileBy.androidUIAutomator("text(\"id:email\")");
        By password=MobileBy.androidUIAutomator("text(\"id:password\")");
        By fullName=MobileBy.androidUIAutomator("text(\"id:fullname\")");
        public SignupScreen(AppiumDriver appiumDriver) {

                super(appiumDriver);
        }


        public HomeScreen signup(User client) {

                waits.waitForElementToBeVisible(clientSignUpButton);
                actions.type(email,client.getEmail());
                actions.type(password,client.getPassword());
                actions.type(fullName,client.getFullName());
                actions.click(signupBtn);

                return new HomeScreen(appiumDriver);
        }
        }
