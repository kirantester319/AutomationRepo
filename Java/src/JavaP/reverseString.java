package JavaP;

import java.util.Scanner;

public class reverseString {
	
	public static void main(String[] args) 
		
	{
	/*
		String str = "Automation";
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		sb=sb.reverse();
		System.out.println(sb);
		
		
		
		String str2 = "Selenium";
		
		char[]c = str2.toCharArray();
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
			
		}
		
		//Method 3
		
		Scanner scan = new Scanner(System.in);
		
		String str3 = scan.nextLine();
		
		System.out.println("Please Enter String to reverse  ");
		
		char dw[] = str3.toCharArray();
		
		*/
		
		//Method 4 
		
		String original, reverse = "";
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		original = scan1.nextLine();
		
		for(int i=original.length()-1;i>0;i--)
		{
			reverse=reverse+original.charAt(i);
						
		}
		System.out.println(reverse);
	}
	
}