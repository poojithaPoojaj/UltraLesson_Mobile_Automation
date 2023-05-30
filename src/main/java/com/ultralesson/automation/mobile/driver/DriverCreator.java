package com.ultralesson.automation.mobile.driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class DriverCreator {
    public AppiumDriver createDriverContext(DesiredCapabilities desiredCapabilities) {
    Platform platform = desiredCapabilities.getPlatformName();
    DriverManager<AppiumDriver> mobileDriverManager = getDeviceManagers().get(platform);
        return new MobileDriverContext(mobileDriverManager).create(desiredCapabilities);
}
   

    // Build a Browser Managers Map
    public Map<Platform, DriverManager<AppiumDriver>> getDeviceManagers() {
        Map<Platform,DriverManager<AppiumDriver>> driverManagerMap = new HashMap<>();
        driverManagerMap.put(Platform.ANDROID, new AndroidDriverManager());
//        driverManagerMap.put(Platform.IOS, new IOSDriverManager());
        return driverManagerMap;
    }
}
