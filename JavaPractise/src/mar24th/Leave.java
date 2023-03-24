package mar24th;

public class Leave extends Marks{
	
	int sl,cl;
	
	public void setLeaves(int sl,int cl)
	{
		this.sl=sl;
		
		this.cl=cl;
	}
	
	
	public void getLeaves()
	{
		System.out.println("Total Leaves taken : "+(sl+cl));
	}
	
	//override
	
	public void getDetails()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Student Name : "+sNa);
	}
	
	

}
