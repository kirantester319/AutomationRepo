package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseTest {
	
	
	
	WebDriver driver;
	@BeforeSuite
	public void Initializer()
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Maven\\Drivers\\chromedriver2.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com");
	
	
}
	
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.close();
	}
	
	
}