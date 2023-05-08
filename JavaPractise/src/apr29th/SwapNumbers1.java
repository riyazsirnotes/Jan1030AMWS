package apr29th;

import java.util.Scanner;

public class SwapNumbers1 {

	public static void main(String[] args) {
		
		System.out.println("Enter first number");

		Scanner input=new Scanner(System.in);

		int x=input.nextInt();
		
		System.out.println("Enter Second number");

		int y=input.nextInt();
		
		System.out.println("Before swapping ");
		
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		
		swapTwoNumbers(x,y);

	}

	private static void swapTwoNumbers(int x, int y) {
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		
	}

}
