package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.FixDepositCalculatorPage;



class FixDepositecalculatorTest extends BaseTest
{

	WebDriver driver;
@Test
public void TestExecution()
{
	
	
	FixDepositCalculatorPage FD=PageFactory.initElements(driver, FixDepositCalculatorPage.class);
	
	FD.fixedDeposite();
	
	
	
}
}