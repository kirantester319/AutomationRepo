package ThisKeyword;

public class ThisDemoCase6 {
	
	
	
	//THis KeyWord is used to return the current class instance from the method
	
	
	ThisDemoCase6 m1()
	{
		return this;
	}
	
	
	public static void main(String[] args) {
		
		ThisDemoCase6 t= new ThisDemoCase6();
		t.m1();
		
	}

}
