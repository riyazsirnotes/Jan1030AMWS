package apr26th;

public class Sum {
	
	
	
	public void add(int...a)
	{
		System.out.println("no of values inputed : "+a.length);
		int res=0;
		
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		
		System.out.println("Sum is "+res);
	}

}
