//to check given number is prime
package apr29th;

import java.util.Scanner;

public class PrimeNumbers1 {

	public static void main(String[] args) {
		
		System.out.println("Enter number to check prime or not ");

		Scanner input=new Scanner(System.in);

		int num=input.nextInt();
		
		isGivenNumberIsPrime(num);

	}

	private static void isGivenNumberIsPrime(int num) {
		
		int count=0;
		for(int x=2;x<num;x++)
		{
			if(num%x==0)
			{
				count++;
				System.out.println(num+ " is not a prime number");
				break;
			}
		}
		if(count==0)
		{
			System.out.println(num+" is a prime number");
		}
		
	}

}
