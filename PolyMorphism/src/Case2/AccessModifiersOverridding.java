package Case2;

class Dog
{
	
	public  void barking()
	{
		System.out.println("Dog Barking ");
	}
}

class cat extends Dog

{
	public void barking ()
	{
		System.out.println("cat Barking");
	}
}



public class AccessModifiersOverridding
{
		
public static void main(String[] args)
{
	Dog d = new Dog();
	d.barking();
	
	cat c = new cat();
	c.barking();
	
	
}
}
