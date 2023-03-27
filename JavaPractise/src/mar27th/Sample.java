package mar27th;

public abstract class Sample {
	
	public Sample()
	{
		System.out.println("Constructor is invoked ");
	}
	
	abstract void greet();
	
	abstract void wish();
	
	void bye()
	{
		System.out.println("bye ..bye..");
	}

}
