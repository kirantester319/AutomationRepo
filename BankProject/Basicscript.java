package com.ranford.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basicscript {


	public static void main(String[] args) 
	
	{
	String Expval="Login";
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://192.168.1.4/ranford2");
	Sleeper.sleepTightInSeconds(4);
	String Actval=driver.findElement(By.xpath(".//*[@id='NRI']")).getText();	
			System.out.println(Actval);
	if (Expval.equalsIgnoreCase(Actval)) 
	{
	System.out.println("Application is launched");
	}
	else
	{
		System.out.println("Application not opened");
	}
	Expval="Welcome to Admin";
	driver.manage().window().maximize();
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	Actval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	System.out.println(Actval);
if (Expval.equalsIgnoreCase(Actval)) 
{
System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}
	
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	

	}

}
