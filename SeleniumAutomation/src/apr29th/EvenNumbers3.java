//Count the number of even numbers from 1 to 100
package apr29th;

import java.util.Scanner;

public class EvenNumbers3 {

	public static void main(String[] args) {

		System.out.println("Enter starting number");

		Scanner input=new Scanner(System.in);

		int num1=input.nextInt();
		
		System.out.println("Enter end number");

		int num2=input.nextInt();
		
		System.out.println("No of even Numbers is " + printCountOfEvenNumbers(num1,num2));

	}

	private static int printCountOfEvenNumbers(int num1,int num2) {

		int count=0;
		
		
		
		for(;num1<=num2;num1++)
		{
			 if(num1%2==0)
			 {
				 count++;
			 }
			 
			
		}
		
		return count;
	}

}
