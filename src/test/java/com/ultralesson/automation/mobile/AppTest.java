package com.ultralesson.automation.mobile;

import com.ultralesson.automation.mobile.models.User;
import com.ultralesson.automation.mobile.screens.HomeScreen;
import com.ultralesson.automation.mobile.screens.LauncherScreen;
import com.ultralesson.automation.mobile.screens.ProfileScreen;
import com.ultralesson.automation.mobile.screens.SignupScreen;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AppTest {
    @Test
    public void clientShouldBeAbleToSignupSuccessfully() {
        AppiumDriver mobileDriver=null;
        LauncherScreen launcherScreen = new LauncherScreen(mobileDriver);
        launcherScreen.navToClientSignup();
        User client = new User("randomclient@gmail.com",
                "password",
                "Automation Client",
                "1234567890");

        SignupScreen signupScreen = new SignupScreen(mobileDriver);
        HomeScreen homeScreen = signupScreen.signup(client);

        ProfileScreen profileScreen = homeScreen.navToProfile();
        User clientProfile = profileScreen.getProfileDetails();

        Assert.assertEquals(clientProfile.getEmail(), client.getEmail());
        Assert.assertEquals(clientProfile.getFullName(), client.getFullName());
        Assert.assertEquals(clientProfile.getMobile(), client.getMobile());

        Assert.assertEquals(clientProfile.getMembershipStartDate(), "<Today's Date>");
    }

}