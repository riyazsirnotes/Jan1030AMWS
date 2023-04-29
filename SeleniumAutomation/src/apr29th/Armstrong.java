package apr29th;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
	System.out.print("Enter the number to be check it's Amstrong or not ");
		
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		checkNumberisAmstrong(num);
		
	}

	private static void checkNumberisAmstrong(int num) {
		
		int res=0;
		int num1=num;
		
		while(num>0)
		{
			res=res+(num%10)*(num%10)*(num%10);
			num=num/10;
			
		}
		if(res==num1)
		{
			System.out.println(num1+" is an armstrong number");
		}
		else
		{
			System.out.println(num1+" is not an armstrong number");
		}
	}

}
