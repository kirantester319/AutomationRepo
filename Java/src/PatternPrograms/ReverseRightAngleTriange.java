package PatternPrograms;

import java.util.Scanner;

public class ReverseRightAngleTriange {
	
/*	
	
	****************
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
	
	
	
	public static void main(String[] args) {
		
	System.out.println("Please Enter No of lines required");
		
		
		Scanner scan = new Scanner(System.in);
		
		int line=scan.nextInt();
		scan.close();
		for(int i=line;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
