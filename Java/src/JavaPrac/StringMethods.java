package JavaPrac;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		
		String str = new String("   This is java String Program   ");
		
		String str2=null;
		
		
		System.out.println(str);
		
		
		//Java Methods
		//LowerCase
		
		str2 = str.toLowerCase();
		
		
		System.out.println(str2);
		
		
		//Change the aString to Upper Case
		
		str2 = str.toUpperCase();
		System.out.println(str2);
		
		//Find String Length
		
		int	str3= str.length();
		
		System.out.println(str3);
		
		
		//Find Index of String
		
		System.out.println(str.indexOf("j"));
		
		
		
		//Find CharAt
		
		System.out.println(str.charAt(26));
		
		//Replace for remove spaces
		
		str2= str.replace(" java", " Selenium");
		System.out.println(str2);
		
		
		str2=str.replace(" ", "");
		System.out.println(str2);
		
		
		//Trim for removing space of both ends of a sentence
		
		str2=str.trim();
		
		System.out.println(str2);
		
		//Compare of sentence 
		
		String str4 = "Hello World";
		
		String str5 = "Hello world";
		
		int str6= str4.compareTo(str5);
		System.out.println(str6);
		
		//COncat
		
		str2= str.concat(str5);
		System.out.println(str2);
		
	}

}
