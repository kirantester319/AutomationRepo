package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
	
	
	public static void main(String[] args) {
		
		String str = "This is Java Program Java Program";
		
		
		Map<Integer,String> hmap= new HashMap();
		
		
		
		
		hmap.put(2,"abc");
		
		hmap.put(1, "lmn");
		
		
		hmap.put(1, "def");
		hmap.put(1, "ghi");
		
		hmap.put(1, "opq");
		
		hmap.put(1, "uvw");
		hmap.put(1, "xyz");
		
		hmap.put(1, "jkl");
		hmap.put(1, "rst");
		System.out.println(hmap.get(1));
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
