import java.util.Scanner;

public class Swapnumbers {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Plaese enter x and y values");
		
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		//With out 3rd variable
		/*
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("swap value of x : "+x);
		System.out.println("swap value of y : "+y);
		*/
		
		//With third variable
		int c=x;
		x=y;
		y=c;
		System.out.println("swap second method value of x : "+x);
		System.out.println("swap Second method value of y : "+y);
		
		
		
		
		
		
		
		
		
		
		
	}

}
