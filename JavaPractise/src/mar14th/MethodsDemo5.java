package mar14th;

import java.util.Scanner;

public class MethodsDemo5 {

	public static void main(String[] args) {
		
		MethodsDemo5 obj1=new MethodsDemo5();
		
		//message to user 
		
		System.out.println("Enter the natural Number for which Sum to be calculated : ");
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		System.out.println(obj1.natSum(x));

	}

	private  int natSum(int num) {
		
		int res=0;
		
		for(int i=1;i<=num;i++)
		{
			res=res+i;
		}
		return res;
		
		
	}

}
