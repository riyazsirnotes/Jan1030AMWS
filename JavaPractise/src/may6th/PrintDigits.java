package may6th;

import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		printDigits(str);
		
	}

	private static void printDigits(String str) {
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(Character.isDigit(c))
			{
				System.out.println(c);
			}
		}
		
	}
	
	

}
