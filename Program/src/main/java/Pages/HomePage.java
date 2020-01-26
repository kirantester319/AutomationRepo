package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	WebDriver driver;
	public HomePage()
	
	{
	this.driver=driver;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//div[@class='header_user_info']")
	@CacheLookup
	WebElement signIn;
	
	
	public void SignInbutton() throws Exception
	{
		
		signIn.click();
	}

}
                 