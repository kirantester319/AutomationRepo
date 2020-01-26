import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter odd number");
		Scanner scan = new Scanner(System.in);
		
		int line = scan.nextInt();
		
		scan.close();
		
		for(int i=line;i>=1;i--)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
						
			System.out.println();
			
		}
		
	}

}
