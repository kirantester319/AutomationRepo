package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorsPrac {
	
	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("Kiran");
		al.add("dinesh");
		al.add("somesh");
		al.add("Hanuma");
		
		
		ListIterator lstr = al.listIterator();
		
		
		
		while(lstr.hasNext())
		{
			
			String s= (String)lstr.next();
			
			System.out.println(s);
		}
		
		
		while(lstr.hasPrevious())
		{
			
			String s= (String)lstr.previous();
			
			System.out.println(s);
		}
	}

}
