package ThisKeyword;



// This keyword is user to invoke CURRENT CLASS CONSTRUCTOR METHODS

class ThisDemoCase3 {
	
	ThisDemoCase3()
	{
		this(1);
	}
	
	ThisDemoCase3(int x)
	{
		this(1,"hello");
		System.out.println("This is second constructor method");
	}
	
	ThisDemoCase3(int x , String y)
	{
		System.out.println("This is third class constructor");
	}
	
	public static void main(String[] args) {
		ThisDemoCase3 td = new ThisDemoCase3();
		System.out.println("This is main class");
	}
	
}
