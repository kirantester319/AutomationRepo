package ThisKeyword;


//This KeyWord invokes the current CLASS METHODS


class ThisDemoCase2 {
	
	
	void display()
	{
		System.out.println("Hello");
	}
	void show()
	{
		this.display();//display()    We can declare both types . if we declare display(), JVM automatically declare as this.display()
	}

	
	public static void main(String[] args) {
		ThisDemoCase2 td = new ThisDemoCase2();
		td.show();
	}
}
