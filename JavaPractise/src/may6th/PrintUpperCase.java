package may6th;

import java.util.Scanner;

public class PrintUpperCase {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		printUpperCase(str);
		
	}

	private static void printUpperCase(String str) {
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(Character.isUpperCase(c))
			{
				System.out.println(c);
			}
		}
		
	}
	
	

}
