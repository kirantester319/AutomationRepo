package ThisKeyword;


//This keyWord is used to pass an argument in the constructor call

class demo
{

	
	demo(ThisDemoCase5 t)
	{
		System.out.println("This is demmo class");
	}
	
	
}



 class ThisDemoCase5 {

	 void m1()
	 {
		 demo t = new demo(this);
	 }
	 
	 
	 public static void main(String[] args) {
		
		 ThisDemoCase5 t = new ThisDemoCase5();
		 t.m1();
		 
	}
}
