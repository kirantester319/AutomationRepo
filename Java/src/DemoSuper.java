class test
{
	int a=10;
	test(int x)
	{
		System.out.println("This is x constructor");
		System.out.println("The value of x "+ x);
	}
	
	void dis()
	{
		System.out.println("THis is x display");
		System.out.println("the value of a"+ a);
	}
}

class display extends test
{
	
	int a=20;
	
	display(int y)
	{
		super(y);
		System.out.println("THis is constructor of y");
		System.out.println("The value of y"+y);
	}
	void dis()
	{
		super.dis();
		System.out.println("This is y display");
		System.out.println("The value of a "+ a);
	}
	
}	
	


 class DemoSuper {
	 
	 public static void main(String[] args) 
	 {
	
		 display d1 = new display(123);
		 d1.dis();
	}

}
