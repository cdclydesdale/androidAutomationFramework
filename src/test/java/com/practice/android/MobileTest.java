package com.practice.android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest {

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
		driver.findElementByAccessibilityId("Preference").click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click(); //resourceId
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("B1C1FE");
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"WiFi settings\")").click();
		//driver.findElementByClassName("//android.widget.TextView");
		/*WebElement element = (WebElement) driver.findElementsByClassName("android.widget.Button").get(0);
		element.click();*/
		//boolean val = driver.findElementByAndroidUIAutomator("text(\"WiFi settings\")").isEnabled();
		//System.out.println(val);
		/*driver.findElement(By.xpath("//android.widget.TextView[@text='1. Preferences from XML']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();*/
		driver.findElementById("android:id/button1").click();
		//driver.close();
		driver.quit();
		/*driver.findElementByXPath("//android.widget.TextView[@text='welcome']");
		driver.findElementsByAccessibilityId("");*/
	}

}
