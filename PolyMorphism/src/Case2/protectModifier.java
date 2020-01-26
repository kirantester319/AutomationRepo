package Case2;

//Overridden program for using protected access modifier


class donkey
{
	protected void barking()
	{
		System.out.println("donkey is barking");
	}
}

class monkey extends donkey
{
	protected void barking()
	{
		System.out.println("monkey is barking");
	}
}

public class protectModifier
{
	
public static void main(String[] args) 
{
	
	donkey d = new donkey();
	d.barking();
	
	
	monkey c = new monkey();
	c.barking();
		
}
}
