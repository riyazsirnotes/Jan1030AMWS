package may6th;

import java.util.Scanner;

public class PrintASCII {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		printASIII(str);
		
	}

	private static void printASIII(String str) {
	
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			System.out.println((int)c);
		}
		
	}
	
	

}
