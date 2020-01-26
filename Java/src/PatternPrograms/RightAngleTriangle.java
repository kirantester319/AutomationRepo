package PatternPrograms;

import java.util.Scanner;

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
*/


public class RightAngleTriangle {

	public static void main(String[] args) {
		
		System.out.println("Please enter no of lines required");
		Scanner scan = new Scanner(System.in);
		
		int line = scan.nextInt();
		scan.close();
		
		for(int i=1;i<=line;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
