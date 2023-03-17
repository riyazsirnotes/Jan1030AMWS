package mar17th;

public class Clock {
	
	int hr,min,sec;
	
	public void setClock(int h,int m,int s)
	{
		hr=h;
		min=m;
		sec=s;
	}
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		
		System.out.format("%02d:%02d:%02d",hr,min,sec);
		
	}

}
