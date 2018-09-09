package com.practice.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest2  {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
		cap.setCapability("appPackage", "com.android.settings");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
		driver.launchApp();
		
	}

}
