package mar14th;

public class MethodsDemo2 {

	public static void main(String[] args) {

		MethodsDemo2 obj1=new MethodsDemo2();
		
		//int sum=obj1.natSum(5);
		
		System.out.println(obj1.natSum(5));
		
		System.out.println(obj1.natSum(10));
		
		System.out.println(obj1.natSum(100));
		
		System.out.println(obj1.natSum(1000));
		
	}
	
	public int natSum(int num)
	{
		
		int res=0;
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		
		return res;
		
	}
}
