package assignments;

public class Date {
	
	int date,year;
	
	String mon;
	
	//setters 
	
	public void setDate(int date,String mon,int year)
	{
		this.date=date;
		this.mon=mon;
		this.year=year;
		
	}
	
	//getter
	public void getDate()
	{
		System.out.format("%02d-%s-%04d",date,mon,year);
	}

}
