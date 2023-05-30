package com.ultralesson.automation.mobile.driver;

import org.openqa.selenium.remote.DesiredCapabilities;

public interface DriverManager<Driver> {


        Driver create(DesiredCapabilities desiredCapabilities);

}
