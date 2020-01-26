package JavaP;

import java.util.HashMap;
import java.util.Map;

public class occuranceString {

	public static void main(String[] args) {
		
		
		
		String str ="This is java java program program selenium selenium is is are and and";
		
		String str2 []=str.split(" ");
		
		Map<String, Integer> hm = new HashMap<>();
		
		
		for(String s: str2)
		{
			
			if(hm.get(s)!=null)
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s,1);
			}
		}
		System.out.println(hm);
		
		
		
		
		
	}

}
