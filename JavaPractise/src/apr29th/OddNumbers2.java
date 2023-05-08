package apr29th;

import java.util.Scanner;

public class OddNumbers2 {

	public static void main(String[] args) {

		System.out.println("Enter how many odd numbers to print");

		Scanner input=new Scanner(System.in);

		int num=input.nextInt();

		printFirstnOddNumbers(num);

	}

	private static void printFirstnOddNumbers(int num) {

		int count=0;
		
		int x=0;
		
		while(count<num)
		{
			 if(x%2==1)
			 {
				 System.out.print(x +" ");
				 count++;
			 }
			 
			 x++;
		}
		
		
	}

}
