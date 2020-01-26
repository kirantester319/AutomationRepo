package Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import jxl.common.LengthConverter;


public class TestUtil {
	
	WebDriver driver;
	
	public TestUtil()
	{
		this.driver=driver;
	}
	
	
	public void Actiosmethod(WebElement element)
	{
	
	Actions act = new Actions(driver);
	act.moveToElement(element).build().perform();
	
	}
	
	
	//To Takes Screen Shots
	public void takesscreenshot(String Filename)
	{
		try
		{
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\RealEstateProject\\FailedTests-ScreenShots"+ Filename+".png"));
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	//To Capture The the alert
	public void alert()
	{
		Alert al = driver.switchTo().alert();
	}
	
	//To select DropDown Elements
	
	public void Select(WebElement selElement)
	{
		Select sel = new Select(selElement);
		
	}
	
	public void WinDowHandles()
	{
		String ParentWindow = driver.getWindowHandle();
		
		Set<String> WindowHandles = driver.getWindowHandles();
	
		int windowlength = WindowHandles.size();
		ArrayList<String> tab = new ArrayList<>(WindowHandles);
		
		for(int i=0;i<windowlength;i++)
		{
			driver.switchTo().window(tab.get(i));
			System.out.println(driver.getTitle());
		}
		
		
	}

}
