package mar14th;

public class MethodsDemo4 {
	
	public static void main(String[] args) {
		
		//int sum=MethodsDemo4.natSum(5);
		
		System.out.println(MethodsDemo4.natSum(5));
		System.out.println(MethodsDemo4.natSum(10));
		System.out.println(MethodsDemo4.natSum(100));
		System.out.println(MethodsDemo4.natSum(1000));
	}

	private static int natSum(int num) {
		
		int res=0;
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		
		return res;
		
		
		
	}

}
