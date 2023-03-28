package mar21st;

public class Sum {
	
	//constructor
	  Sum()
	{
		System.out.println(" In Constructor .....");
	}
	
	public void add(int x,int y)
	{
		System.out.println("sum is "+ (x+y));
	}
	
	public void add(int x,int y,int z)
	{
		System.out.println("Sum is "+(x+y+z));
	}
	
	//public void addDouble(double x, double  y)
	public void add(double x, double  y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	//public void addLong(long x,long y)
	public void add(long x,long y)
	{
		System.out.println("Sum is "+(x+y));
	}
	
	//to add 3 double values
	
	public void add(double x,double y,double z)
	{
		System.out.println("Sum is "+(x+y+z));
	}

}
