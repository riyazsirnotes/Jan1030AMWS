package may6th;

import java.util.Scanner;

public class PrintAfterRemovingSpaces {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		printAfterRemovingSpaces(str);
		
	}

	private static void printAfterRemovingSpaces(String str) {
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			/*
			 * if(!Character.isWhitespace(c)) { System.out.println(c); }
			 */
			
			if(!((int)c==32))
			{
				System.out.print(c);
			}
		}
		
	}
	
	

}
