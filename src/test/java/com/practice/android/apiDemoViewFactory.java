package com.practice.android;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class apiDemoViewFactory {

	@FindBy(xpath="//android.widget.TextView[@text='Animation']")
	MobileElement animation; 
	
	@AndroidFindBy(uiAutomator="text(\"3D Transition\")")
	MobileElement push;
	
	/*@iOSXCUITFindBy(xpath="//option")
	MobileElement test;*/
	
	public void clickOnAnimation() {
		animation.click();
	}
	
	public void clickOnPush() {
		push.click();
	}
	
	public apiDemoViewFactory(AppiumDriver driver) {
		//used AppiumFieldDecorator which is a part of Page Factory
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
}
