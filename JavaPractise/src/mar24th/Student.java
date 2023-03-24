package mar24th;

public class Student {
	
	int rollNo;
	String sNa;
	
	//setter
	
	public void setDetails(int rollNo,String sNa)
	{
		this.rollNo=rollNo;
		this.sNa=sNa;
	}
	
	//getter
	
	public void getDetails()
	{
		System.out.println("Roll No : \t"+rollNo+"\tStudent Name : "+sNa);
	}

}
