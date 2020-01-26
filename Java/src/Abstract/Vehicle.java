package Abstract;

 abstract class Vehicle {
	
	 void start()
	 {
		System.out.println("This is non abstract method");
	 }
	
}

 class scooter extends Vehicle
{
	
	void start()
	{
		System.out.println("Starts with kkick");
	}
}	
	
	class car extends Vehicle
	{

void start()
{
	System.out.println("Car stars with Key");
	
}


public static void main(String[] args) {
	
	
	scooter sc = new scooter();
	sc.start();
	
	car c = new car();
	c.start();
	
}

}