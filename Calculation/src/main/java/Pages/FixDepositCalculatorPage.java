package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FixDepositCalculatorPage {
	
 static WebDriver driver;


		FixDepositCalculatorPage(WebDriver driver)
		{
	
			this.driver= driver;
		}
	
		//Principle Field
		@FindBy(how=How.XPATH,using="//div[@class='header_user_info']")
		@CacheLookup
		static
		
		WebElement principle;
		
		//FDTimePeriod
		@FindBy(how=How.XPATH,using="//input[contains(@id,'periodInputField')]")
		@CacheLookup
		static
		WebElement Timeperiod;
		//InterestInput
		
		@FindBy(how=How.XPATH,using="//input[contains(@id,'interestInputField')")
		@CacheLookup
		static
		WebElement InterestRate;
		
		
		
		//Compound Frequency
		@FindBy(how=How.XPATH,using="//*[@id=\"frequencySelectField\"]")
		@CacheLookup
		static
		WebElement compound;
		
		//Calculate Button
		@FindBy(how=How.XPATH,using="//*[@id=\"calculateButton\"]")
		@CacheLookup
		static
		WebElement CalculateButton;
		
		//click the see chart Button
		@FindBy(how=How.XPATH,using="//*[@id=\\\"chart-btn-wrapper\\\"]/a")
		@CacheLookup
		static
		WebElement chartButton;

public static void fixedDeposite()
{
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	
	//principle amount
	principle.sendKeys("100000");
	//FD Timeperiod
	Timeperiod.sendKeys("365");
	//Select Mode of period
	Select Period = new Select (Timeperiod);
	Period.selectByIndex(2);
	
	//Interest Rate
	InterestRate.sendKeys("8.5");
	//Compound Frequency
	Select comfreq = new Select (compound);
	comfreq.selectByVisibleText("Yearly");
	
	CalculateButton.click();
	
	chartButton.click();
				
				
	}
	
	
	

}
