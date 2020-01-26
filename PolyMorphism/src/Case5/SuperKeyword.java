package Case5;



class parent3

{
	void show()
	{
		System.out.println("Parent3 class");
	}
}

class child3 extends parent3
{
	void show()
	{
		//Invoking over ridden method from sub class call parent class methods in overriding method using SUPER  keyword 
		super.show();
		System.out.println("child3 class");
	}
}




public class SuperKeyword {

	
	public static void main(String[] args) {
		
		child3 c3 = new child3();
		c3.show();
		
		
		
	}

	}
	

