package TryCatch;

import org.openqa.selenium.ElementNotVisibleException;

public class TryCatchClass1 {
		
	public static void main(String[] args) {
		
	try
	{
		int x=10;
		int y = 20/0;
		
		
		
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	catch(Exception f)
	{
		System.out.println(f);
	}
	catch(ArithmeticException a)

	{
		System.out.println(a);
	}

	
	
	
	
	
	}
}
