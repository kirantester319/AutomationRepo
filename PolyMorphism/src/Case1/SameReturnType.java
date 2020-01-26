package Case1;

//Methods using same return type
class car
{
	void started()
	{
		System.out.println("Car started ");
	}
}


class auto extends car
{
	void started()
	{
		System.out.println("Auto Started");
	}
}



public class SameReturnType {

	
	public static void main(String[] args) {
		
		car c = new car();
		c.started();
		
		auto a = new auto();
		a.started();
		
		
	}
	
}
