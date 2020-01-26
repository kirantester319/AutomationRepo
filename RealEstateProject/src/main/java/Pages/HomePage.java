package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	
	
	WebDriver driver ;
	
	
	HomePage()
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[3]/div/a")
	@CacheLookup
	
	WebElement SignupButton;
	
	
	public void signup()
	{
		
		SignupButton.click();
	}
	
	
	
	
	
	
	
	
	
	

}
