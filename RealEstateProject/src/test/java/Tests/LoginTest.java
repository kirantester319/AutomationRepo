package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.TestUtil;

public class LoginTest extends BaseTest
{
	
	WebDriver driver;
	
	@Test
	public void init()
	{
		
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		TestUtil tu = PageFactory.initElements(driver, TestUtil.class);
		tu.WinDowHandles();
		
		loginpage.login();
		
	}
	
	
	
	

}
