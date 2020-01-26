package ThisKeyword;

//This keyword is used to invoke current CLASS INSTANCE VARIABLES

class ThisDemoCase1 {

	int i;
	
	void m1(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		ThisDemoCase1 td = new ThisDemoCase1();
		td.m1(100);
		td.show();
				
		
	}
	
	
}
