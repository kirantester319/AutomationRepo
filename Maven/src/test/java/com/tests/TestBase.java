package com.tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
	WebDriver driver ;
	
	@BeforeSuite
	public void BrowserInitialization(String url)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Maven\\Drivers\\chromedriver2.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
	}
	
	@AfterSuite
	public void teaardown()
	{
		driver.close();
		
	}
	
	
}
