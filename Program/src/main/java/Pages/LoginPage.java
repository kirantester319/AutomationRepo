package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.testPages.TestBase;

public class LoginPage  {
	
	WebDriver driver;
	public LoginPage()
	{
		this.driver= driver;
	}
	
	//Username WebElement
	@FindBy(how=How.XPATH,using ="#email")
	@CacheLookup
	WebElement username;
	//Password WebElement
	@FindBy(how=How.XPATH,using ="#passwd")
	@CacheLookup
	WebElement password;
	//SignIn Button WebElement
	@FindBy(how=How.XPATH,using ="#SubmitLogin > span")
	@CacheLookup
	WebElement clickButton;
	
	public void LoginCredientials(String email,String passw)
	{
		try {
			username.clear();
			username.sendKeys(email);
			Thread.sleep(5000);
			password.clear();
			password.sendKeys(passw);
			Thread.sleep(5000);
			clickButton.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
