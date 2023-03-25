package mar25tha;

public class B extends A{
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}
	
	public void displayAll()
	{
		System.out.println(" x is "+super.x);
		System.out.println(" x is "+this.x);
	}

}
