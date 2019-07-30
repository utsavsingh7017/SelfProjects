package com.qait.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestChrome {
	private RemoteWebDriver driver;

	@Test
	public void launchHRISPortal(){
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "emulator-5554");
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		capabilities.setCapability(CapabilityType.VERSION, "9.0");
		
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		
		try {
			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://hris.qainfotech.com/login.php");
			driver.findElement(By.linkText("Access Payroll Online")).click();
			String expectedTitle = "HRIS Login";
			String actualTitle = driver.getTitle();
			AssertJUnit.assertEquals(actualTitle, expectedTitle); 
		} catch (MalformedURLException e) {
		
			e.printStackTrace();
		}
	}
}
