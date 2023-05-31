package com.ultralesson.automation.mobile.driver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public interface DriverManager<Driver> {


        Driver create(DesiredCapabilities desiredCapabilities);

}
