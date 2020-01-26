package Case2;


//Methods cannot be OVERRIDE in Private modifier
class parrot
{
	private void barking()
	{
		System.out.println("Dog is barking Bow Bow");
	}
}

class sparrow extends parrot
{
	private void barking()
	{
		System.out.println("Cat is barking ");
	}
}

public class privateAccess {
	
	
	public static void main(String[] args) {
		//Method declare as private it cannot be ovverridden
		parrot d = new parrot();
		d.barking();
		
		sparrow c = new sparrow();
		c.barking();
		
		
	}
	

}
