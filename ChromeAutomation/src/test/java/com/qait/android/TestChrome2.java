package com.qait.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

//import io.appium.java_client.android.AndroidDriver;

public class TestChrome2 {
	
	public AndroidDriver driver;

	@Test
	public void launchGmail(){
		
		// Created object of DesiredCapabilities class.
				DesiredCapabilities capabilities = new DesiredCapabilities();
				// Set android deviceName desired capability. Set your device name.
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
				// Set BROWSER_NAME desired capability. It’s Android in our case here.
				//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
				// Set android VERSION desired capability. Set your mobile device’s OS version.
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
				// Set android platformName desired capability. It’s Android in our case here.
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				//capabilities.setCapability("adbExecTimeout", 500000);
				//capabilities.setCapability(MobileCapabilityType.APP, "com.google.android.youtube");
				// Set your application’s appPackage if you are using any other app.
				capabilities.setCapability("appPackage", "com.google.android.gm");
				capabilities.setCapability("appActivity", "com.google.android.gm.GmailActivity");
				// It will launch app in android device.
				//System.out.println(39);
				try {
					driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
					//driver.activateApp("com.google.android.youtube");
					//System.out.println(41);
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					//System.out.println(driver.getCapabilities());
					//driver.get("https://hris.qainfotech.com/login.php");
					//String actualTitle = driver.getTitle();
					//String expectedTitle = "HRIS Login";
					//Assert.assertEquals(expectedTitle, actualTitle, "Wrong title");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
