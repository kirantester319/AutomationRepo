package Giftcard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Baby {
	
	@Test
	public void Initialization() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Maven\\Drivers\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.giftcardsindia.com/#/");
		
		Thread.sleep(20000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		driver.findElement(By.name("searchKeyword")).sendKeys("Baby");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(10000);
		
		
		WebElement WelComeBaby=	driver.findElement(By.cssSelector("#app > div > section > div > div:nth-child(2) > div > div > div:nth-child(2) > div.container.card-ui-wrapper > div:nth-child(1) > div > div > div.card-box > div > img"));
		
		act.moveToElement(WelComeBaby).build().perform();
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(WelComeBaby));
		
		WelComeBaby.click();
	}
	

}
