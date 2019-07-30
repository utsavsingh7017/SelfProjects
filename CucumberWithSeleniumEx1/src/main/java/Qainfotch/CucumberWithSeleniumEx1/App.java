package Qainfotch.CucumberWithSeleniumEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	 String baseUrl =  "https://www.gmail.com";
	 public WebDriver driver;
	 
	 @BeforeTest
	 public void setBaseURL()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\utsavsingh\\Downloads\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get(baseUrl);
	 }
	 
	 @Test
	 public void verifyUserEmail() throws InterruptedException
	 {
		  WebElement email=driver.findElement(By.id("identifierId"));
	      email.sendKeys("utsavsingh7017@gmail.com");
	      WebElement nextButton=driver.findElement(By.cssSelector("span.RveJvd.snByac"));
	      nextButton.click();
	      Thread.sleep(1000);
	      
	 }
	 
	 @Test 
	 public void verifyUserPassword() throws InterruptedException
	 {
		 WebElement password=driver.findElement(By.name("password"));
	      password.sendKeys("........");
	      WebElement nextButton=driver.findElement(By.cssSelector("span.RveJvd.snByac"));
	      nextButton.click();
	      Thread.sleep(4000);

	 }
	 @AfterTest
	 public void endSession()
	 {
		// driver.close();
	 }

}
