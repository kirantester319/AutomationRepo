package JavaP;

import java.util.HashMap;
import java.util.Map;

public class occuranceOfChar {
	
	public static void main(String[] args) {
		
		
		String str= "This is java Program";
		
		
		Map<Character,Integer> hmap = new HashMap<>();
		
		char c[] = str.toCharArray();
		
		for(Character a:c)
		
		{
			
			if(hmap.get(a)!=null)
			{
				hmap.put(a, hmap.get(a)+1);
			}
			else
			{
				hmap.put(a, 1);
				
			}
			
			
		}
		System.out.println(hmap);
		
		
		
		
		
	}

}
