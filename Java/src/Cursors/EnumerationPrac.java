package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPrac {
	
public static void main(String[] args) {
	
	
	Vector<String> v= new Vector<String>();
	
	v.add("Kiran");
	v.add("Kumar");
	v.add("Ramu");
	v.add("Krishna");
	//Read the data by using Enumeration :Non Generic
	Enumeration e = v.elements();
	
	while(e.hasMoreElements())
	{
		String s =(String)e.nextElement();
		
		System.out.println(s);
		
	}
	
	//Read the data by using Enumeraion Generic
	
	Enumeration <String>e1 = v.elements();
	while(e1.hasMoreElements())
	{
		
		String s1 = e1.nextElement();
		
		System.out.println(s1);
		
	}
	
}
}
