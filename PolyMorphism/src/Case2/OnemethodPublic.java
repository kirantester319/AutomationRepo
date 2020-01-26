package Case2;






class parent 
{
	 void show()
	{
		System.out.println("Parent class");
	}
}

class child extends parent
{
	public void show()
	{
		System.out.println("child class");
	}
}
public class OnemethodPublic {

	public static void main(String[] args) {
		
		parent p = new parent();
		p.show();
		
		child c = new child();
		c.show();
		
	}
}
