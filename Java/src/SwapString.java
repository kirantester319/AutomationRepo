
public class SwapString {

	
	
	public static void main(String[] args) {
		
		
		String a ="Hello";
		String b ="world";
		
		System.out.println("THis is before swam of string");
		
		System.out.println("THis value of a " +a);
		System.out.println("THis value of b "+b);
		
		
		a=a+b;
		//a=helloworld
		
		b=a.substring(0,a.length()-b.length());
		
		
		a=a.substring(b.length());
		
		System.out.println();
		
System.out.println("THis is after swam of string");
		
		System.out.println("THis value of a after swap : " +a);
		System.out.println("THis value of b after swap : "+b);
		
		
		
	}
	
	
	
}
