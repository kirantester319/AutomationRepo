package ThisKeyword;

class ThisKeyword {
	
	
	    int a=10;
	    
	    void display()
	    {
	    	int a = 20;
	    	
	    	System.out.println(a);
	    	System.out.println(this.a);
	    }
	    
	    
	    
	    public static void main(String[] args) {
			
	    	ThisKeyword k   =new ThisKeyword();
	    	
	    	k.display();
	    	
		}
	}


