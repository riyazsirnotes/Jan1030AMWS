package apr29th;

import java.util.Scanner;

public class EvenNumbers2 {

	public static void main(String[] args) {

		System.out.println("Enter how many even numbers to print");

		Scanner input=new Scanner(System.in);

		int num=input.nextInt();

		printFirstnEvenNumbers(num);

	}

	private static void printFirstnEvenNumbers(int num) {

		int count=0;
		
		int x=0;
		
		while(count<num)
		{
			 if(x%2==0)
			 {
				 System.out.print(x +" ");
				 count++;
			 }
			 
			 x++;
		}
		
		
	}

}
