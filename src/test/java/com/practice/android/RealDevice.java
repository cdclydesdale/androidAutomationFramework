package com.practice.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RealDevice {

	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		cap.setCapability("appPackage", "com.google.android.youtube");
		cap.setCapability("appActivity", "com.google.android.apps.youtube.app.application.Shell$HomeActivity");
		//cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android.settings");
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
		System.out.println(driver.getOrientation());
	}

}
