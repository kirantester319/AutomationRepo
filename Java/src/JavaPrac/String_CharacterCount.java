package JavaPrac;

import java.util.HashMap;
import java.util.Map;

public class String_CharacterCount {
	
	public static void main(String[] args) {
	
		
		String str = "This is java program java program";
		
		String str2[] = str.split(" ");
		
		Map<String, Integer> hmap= new HashMap<>();
		
		for(String s:str2)
		{
			
			if(hmap.get(s)!=null)
			{
				hmap.put(s, hmap.get(s)+1);
			}
			
			else
			{
				
				hmap.put(s, 1);
			}
			
			
			
		}
			System.out.println(hmap);
		
		
		
	}
	
}
