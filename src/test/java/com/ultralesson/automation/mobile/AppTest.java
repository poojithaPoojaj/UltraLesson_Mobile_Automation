package com.ultralesson.automation.mobile;

import com.ultralesson.automation.mobile.driver.DriverCreator;
import com.ultralesson.automation.mobile.driver.MobileDriverContext;
import com.ultralesson.automation.mobile.models.User;
import com.ultralesson.automation.mobile.screens.HomeScreen;
import com.ultralesson.automation.mobile.screens.LauncherScreen;
import com.ultralesson.automation.mobile.screens.ProfileScreen;
import com.ultralesson.automation.mobile.screens.SignupScreen;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AppTest {
    @Test
    public void clientShouldBeAbleToSignupSuccessfully() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.ultralesson.coach");
        desiredCapabilities.setCapability("appActivity", "com.ultralesson.coach.MainActivity");
        desiredCapabilities.setCapability("platformVersion", "13");

        AppiumDriver mobileDriver = new DriverCreator().createDriverContext(desiredCapabilities);

        LauncherScreen launcherScreen = new LauncherScreen(mobileDriver); // Assume mobileDriver is created and handy.
        launcherScreen.navToClientSignup();
        User client = new User("randomclient@gmail.com",
                "password",
                "Automation Client",
                "1234567890");

        //Act
        SignupScreen signupScreen = new SignupScreen(mobileDriver);
        HomeScreen homeScreen = signupScreen.signup(client);

        ProfileScreen profileScreen = homeScreen.navToProfile();
        User clientProfile = profileScreen.getProfileDetails();

        // Assert
        Assert.assertEquals(clientProfile.getEmail(), client.getEmail());
        Assert.assertEquals(clientProfile.getFullName(), client.getFullName());
        Assert.assertEquals(clientProfile.getMobile(), client.getMobile());

        // Assume we have called a date utility to supply Today's Date
        Assert.assertEquals(clientProfile.getMembershipStartDate(), "<Today's Date>");

    }



}