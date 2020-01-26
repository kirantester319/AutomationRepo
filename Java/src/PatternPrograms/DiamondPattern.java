package PatternPrograms;

import java.util.Scanner;

public class DiamondPattern {
	
	/*

	   *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
       
*/
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter Number of Lines Required (Must Be Odd)");
		Scanner scan = new Scanner(System.in);

		int line = scan.nextInt();
		
		int mid = (line+1)/2;
		scan.close();
		
		System.out.println(mid);
		
		//Top triangle 
		
		for(int i=1;i<=mid;i++)
		{
			
			for(int s=1;s<=mid-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		//Bottom triangle to get diamond
		
		
		for(int i=1;i<=mid-1;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*(mid-i)-1;j++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}
