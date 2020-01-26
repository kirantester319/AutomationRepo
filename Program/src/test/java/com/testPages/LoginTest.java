package com.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends TestBase {
	
	WebDriver driver;
	
	@Test
	public void init() throws Exception
	{
		
		{
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		
		homepage.SignInbutton();
		
		
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		login.LoginCredientials("jetblue@grr.la","jetblue");
		
	}
	
	
	
	
	
	}
}
