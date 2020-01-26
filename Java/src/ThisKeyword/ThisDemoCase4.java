package ThisKeyword;

//This keyword is used to pass as an argument in the method call


class ThisDemoCase4 {
	
	
	
	void m1(ThisDemoCase4 td)
	
	{
		System.out.println("This is m1 methos");
	}
	
	void m2()
	{
		m1(this);
	}
	
	
	public static void main(String[] args) {
		
		
		ThisDemoCase4 td = new ThisDemoCase4();
		td.m2();
		
		
		
	}
	
	

}
