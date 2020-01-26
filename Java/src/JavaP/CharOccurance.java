package JavaP;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {
	
	
	
	
	public static void main(String[] args) {
		
		/*String str ="This is java program";
		
		char cha [] = str.toCharArray();
		
		Map<Character, Integer> hmap = new HashMap<>();
		
		
		for(Character c:cha )
		{
			if(hmap.get(c)!=null)
			{
				hmap.put(c, hmap.get(c)+1);
			
			}
			else
			{
				hmap.put(c, 1);
			}
			
		}
		System.out.println(hmap);
		
		*/
		
		
		
		String reverse="";
		
		String str = " Selenium";
		
		for(int i=str.length()-1;i>0;i--)
		{
			reverse= reverse+str.charAt(i);
		}
		System.out.println(reverse);
}
}