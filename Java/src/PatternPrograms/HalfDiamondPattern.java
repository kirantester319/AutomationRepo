package PatternPrograms;

public class HalfDiamondPattern {
	
	/*
	 
*
**
***
****
*****
******
*******
********
*********
**********
***********
************
*************
**************
***************
***************
**************
*************
************
***********
**********
*********
********
*******
******
*****
****
***
**
*
	  
	 */
	
	
	
	public static void main(String args[])

	{
	for(int i=1;i<=15;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	for (int i=1;i<=15;i++)
	{
	for(int j=15;j>=i;j--)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	}
	}


