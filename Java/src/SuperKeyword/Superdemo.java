package SuperKeyword;

class test
{
	int a=10;
	test(int x)
	{
		System.out.println("THis is parent constr");
		System.out.println(" THe value of x"+x);
	}
	
	void dis()
	{
		System.out.println("THis is parent display");
		System.out.println("THe value of a "+a);
	}
}

class Display extends test
{
	int a=20;
	Display(int y)
	{
		super(y);
		System.out.println("THis is child constr");
		System.out.println("THe value of y "+y);
	}
	
	void dis()
	{
		super.dis();
		System.out.println("This is child ");
		
		System.out.println("The value of a"+a);
	}
}






 class Superdemo {
	 public static void main(String[] args) {
		
	 Display d1 = new Display(123);
	 d1.dis();
	 }
}
