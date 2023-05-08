package apr29th;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter the number to be reveresed ");
		
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		System.out.println("reverse of given number is "+reverseOfNumber(num));

	}

	private static int reverseOfNumber(int num) {
		
		int res=0;
		
		while(num>0)
		{
			res=res*10+num%10;
			num=num/10;
		}
		
		return res;
		
	}

}
