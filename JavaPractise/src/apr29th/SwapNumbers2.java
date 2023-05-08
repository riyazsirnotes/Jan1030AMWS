package apr29th;

import java.util.Scanner;

public class SwapNumbers2 {

	public static void main(String[] args) {
		
		System.out.println("Enter first number");

		Scanner input=new Scanner(System.in);

		int x=input.nextInt();
		
		System.out.println("Enter Second number");

		int y=input.nextInt();
		
		System.out.println("Before swapping ");
		
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		
		swapTwoNumbersWithoutThirdVariable(x,y);

	}

	private static void swapTwoNumbersWithoutThirdVariable(int x, int y) {
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		
	}

}
