package JavaP;



class a
{
	int count =10;
	void display()
	{
		count++;
	}
}



public class One {
	
	public static void main(String[] args) {
		
		
		a obj = new a();
		
		System.out.println(obj.count);
		
		obj.display();
		
		System.out.println(obj.count);
		
		a obj1 = new a();
		System.out.println(obj1.count);
		System.out.println(obj1.count);
		
		
		
		
	}
	
	
	
	

}
