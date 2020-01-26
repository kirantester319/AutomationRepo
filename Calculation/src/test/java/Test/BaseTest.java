package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.*;



public class BaseTest {
	
	WebDriver driver;
	@Parameters({"url"})
	@BeforeTest

	public void Initialization(String url)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
	
		
	}
	/*
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
*/

}
