package JavaP;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new HashMap<>();
		
		
		String str= "This is java programme to solve solve program program ";
		
		String s[]=str.split(" ");
		
		for(String tempstring:s)
		{
		
			if(hmap.get(tempstring)!=null)
			{
				
				hmap.put(tempstring,hmap.get(tempstring)+1);
			}
			
			else
			{
				hmap.put(tempstring,1);
			}
		
		
		}
		
		System.out.println(hmap);
	}
	
	
	
}
