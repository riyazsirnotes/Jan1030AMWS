//to find given number is odd or not

package apr29th;

import java.util.Scanner;

public class OddNumbers1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number to check it is odd or not ");
		
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		toCheckGivenNumberIsOddorNot(num);
	}

	private static void toCheckGivenNumberIsOddorNot(int num) {
		
		if(num%2==1)
		{
			System.out.println(num+" is an odd number");
		}
		else
		{
			System.out.println(num+" is not an odd number");
		}
	}

}
