package JavaPrac;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter string to reverse");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String rev="";
		int length = str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		
		System.out.println(rev);
		
		
		
		
	}
	
}
