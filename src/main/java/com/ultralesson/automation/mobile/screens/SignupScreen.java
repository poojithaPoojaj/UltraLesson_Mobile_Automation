package com.ultralesson.automation.mobile.screens;

import com.ultralesson.automation.mobile.models.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SignupScreen {
        private AppiumDriver appiumDriver;
        By email = By.xpath("//*[@text()='id:email']");
        By password = By.xpath("//*[@text()='id:password']");
        By fullName = By.xpath("//*[@text()='id:fullname']");
        By signupBtn = By.xpath("//*[@text='SIGNUP']");
        public SignupScreen(AppiumDriver appiumDriver) {
                this.appiumDriver = appiumDriver;
        }


        public HomeScreen signup(User client) {
                appiumDriver.findElement(email).sendKeys(client.getEmail());
                appiumDriver.findElement(password).sendKeys(client.getPassword());
                appiumDriver.findElement(fullName).sendKeys(client.getFullName());
                appiumDriver.findElement(signupBtn).click();

                return new HomeScreen(appiumDriver);
        }
        }
