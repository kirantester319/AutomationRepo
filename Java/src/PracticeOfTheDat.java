import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfTheDat
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Set<WebElement> list = driver.findElement(By.xpath(""));
	}
	
	
	
	

}
