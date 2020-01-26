package Case4;


abstract class parent2
{
	abstract void display();
	
	void show()
	{
		System.out.println("Parent abstract class");
	}
}

class child2 extends parent2

{
	void display()
	{
		System.out.println("This is abstract method extension");
	}
	void show()
	{
		System.out.println("This is derived child class");
	}
}


public  class abstractclassesOverridden {

	public static void main(String[] args) {
		
		/*parent2 p2 = new parent2();
		p2.show();
		*/
		child2 c2 = new child2();
		c2.show();
		c2.display();		
		
	}
}
