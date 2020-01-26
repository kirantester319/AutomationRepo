package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPrac {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Kavya");
		al.add("surya");
		al.add("madhu");
		al.add("madhava");
		al.add("kumar");
		
		
		//Read the data By using Iterator:Non Generic
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			
			String s= (String)itr.next();
			System.out.println(s);
			
		}
		
		Iterator<String> itr1= al.iterator();
		
		while(itr1.hasNext())
		{
			String s1 = itr1.next();
			
			System.out.println(s1);
		}
		
		
	}

}
