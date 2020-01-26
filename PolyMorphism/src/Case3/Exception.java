package Case3;

class parent1
{
	 void show() throws ArithmeticException
	{
		System.out.println(" parent1 method");
	}
}

class child1 extends parent1
{
	void show() throws ArithmeticException
	{
		System.out.println("Child1 method");
		
		
	}
}


public class Exception {
	
	public static void main(String[] args) {
		
		parent1 p1= new parent1();
		
		p1.show();
		
		
		child1 c1 = new child1();
		c1.show();
		
	}
	

}
