import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailAutomation {

	public static void main(String[] args) throws InterruptedException   
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\utsavsingh\\Downloads\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String baseUrl =  "https://www.gmail.com";
	      driver.get(baseUrl);
	      WebElement email=driver.findElement(By.id("identifierId"));
	      email.sendKeys("utsavsingh7017@gmail.com");
	      WebElement next1=driver.findElement(By.cssSelector("span.RveJvd.snByac"));
	      next1.click();
	      Thread.sleep(3000);
	      WebElement password=driver.findElement(By.name("password"));
	      password.sendKeys("........");
	      WebElement next2=driver.findElement(By.cssSelector("span.RveJvd.snByac"));
	      next2.click();
	      Thread.sleep(4000);
	     // driver.close();
	   }
}
