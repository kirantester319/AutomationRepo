package com.testPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {

	WebDriver driver;
	
	@BeforeSuite
	
	public void instilization()
	{
	          
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Project\\Drivers\\chromedriver2.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.automationpractice.com");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/*@AfterSuite
	public void TearDownQuit()
	{
		driver.quit();
	}*/
}