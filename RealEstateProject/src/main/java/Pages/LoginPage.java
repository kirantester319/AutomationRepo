package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage()
	{
		this.driver= driver;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginButton;
	
	
	
	public void login()
	{
		
		Username.sendKeys("knjkk319@gmail.com");
		password.sendKeys("nagajyothi319");
		loginButton.sendKeys(Keys.ENTER);
	}
	
	
	

}
