package may6th;

import java.util.Scanner;

public class PrintSpecialChars {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		printSpecialChars(str);
		
	}

	private static void printSpecialChars(String str) {
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(!Character.isLetterOrDigit(c))
			{
				System.out.println(c);
			}
		}
		
	}
	
	

}
