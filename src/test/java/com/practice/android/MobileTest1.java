package com.practice.android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest1 {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("C:\\Users\\cdcly\\OneDrive\\EclipseWorkspace\\android\\src\\test\\java\\com\\practice\\android");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ClydeEmulator");//Emulator
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());//Path to where we have kept apk file
		
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"));");
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//Using Page Object Model to click on an Element
		apiDemoViewFactory viewFactory = new apiDemoViewFactory(driver);
		viewFactory.clickOnAnimation();
		viewFactory.clickOnPush();
		
		//driver.pressKeyCode(AndroidKeyCode.HOME);
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		
		//driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"People Names\")").click();//Will only show the list when clicked; not the sub-menu
		
		/*TouchAction t = new TouchAction(driver);
		t.longPress(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).perform();
		*/
		
	}

}
