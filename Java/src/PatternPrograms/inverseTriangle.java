package PatternPrograms;

import java.util.Scanner;

public class inverseTriangle {

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

		public static void main(String args[])
		{
		
		System.out.println("Please enter no of lines required");
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		

			scan.close();

		for(int i=1;i<=line;i++)
		{

		for(int s=line-1;s>=i;s--)
		{
			System.out.print(" ");
		}

		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		}
		
		
}
