package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class BaseTest {

	WebDriver driver;
	Actions act = new Actions(driver);
	
	@BeforeTest
	public void initializing()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.in");
		
	}
	
	
	@Test
	public void signIn()
	{
		WebElement Account =driver.findElement(By.className("nav-line-1"));
		
		act.moveToElement(Account).build().perform();
		
		act.click().build().perform();
		
		
		/*driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));*/
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	
}

