package Encapsulation;

public class Encap {
	
	
	private int i;
	
	private int j;
	private String k;
	
	public void seti(int newi)
	{
		i=newi;
		
	}
	
	public int geti()
	{
		return i;
	}
	
	
	public void setj(int newj)
	{
		j=newj;
	}
	public int getj()
	{
		return j;
	}
	
	
	
	public void setk(String newk)
	{
		k= newk;
	}
	
	public String getk()
	{
		return k;
	}
	public static void main(String[] args) {
		
		
		Encap e =new Encap();
		e.seti(10);
		e.setj(20);
		e.setk("Kiran");
		
		
		System.out.println(e.geti());
		System.out.println(e.getj());
		System.out.println(e.getk());
		
		
	}

}
