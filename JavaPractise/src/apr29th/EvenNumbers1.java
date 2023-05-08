//to find given number is odd or not

package apr29th;

import java.util.Scanner;

public class EvenNumbers1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number to check it is even or not ");
		
		Scanner input=new Scanner(System.in);
		
		int num=input.nextInt();
		
		toCheckGivenNumberIsEvenorNot(num);
	}

	private static void toCheckGivenNumberIsEvenorNot(int num) {
		
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" is not a even number");
		}
	}

}
