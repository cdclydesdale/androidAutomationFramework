package com.practice.android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest3 {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	File f = new File("C:\\Users\\cdcly\\OneDrive\\EclipseWorkspace\\android\\src\\test\\java\\com\\practice\\android");
	File fs = new File(f,"ApiDemos-debug.apk");
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ClydeEmulator");//Emulator
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());//Path to where we have kept apk file
	//cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.1");
	//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//cap.setCapability(MobileCapabilityType., value);
	
	AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.findElementByAccessibilityId("Animation").click();
	driver.findElementByAccessibilityId("Cloning").click();
	//driver.findElementById("android:id/text1").click();
	driver.findElementById("io.appium.android.apis:id/startButton").click();
	driver.quit();
	}
}
