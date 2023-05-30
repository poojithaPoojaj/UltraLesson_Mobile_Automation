package com.ultralesson.automation.mobile.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

public class AndroidDriverManager implements DriverManager<AppiumDriver> {
    @Override
    public AppiumDriver create(DesiredCapabilities desiredCapabilities) {
        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
