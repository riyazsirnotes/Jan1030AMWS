//Count the number of odd numbers from 1 to 100
package apr29th;

import java.util.Scanner;

public class OddNumbers3 {

	public static void main(String[] args) {

		System.out.println("Enter starting number");

		Scanner input=new Scanner(System.in);

		int num1=input.nextInt();
		
		System.out.println("Enter end number");

		int num2=input.nextInt();
		
		System.out.println("No of odd Numbers is " + printFirstnOddNumbers(num1,num2));

	}

	private static int printFirstnOddNumbers(int num1,int num2) {

		int count=0;
		
		
		
		for(;num1<=num2;num1++)
		{
			 if(num1%2==1)
			 {
				 count++;
			 }
			 
			
		}
		
		return count;
	}

}
