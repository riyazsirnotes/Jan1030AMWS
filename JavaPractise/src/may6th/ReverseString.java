package may6th;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		

		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		reverseAString(str);
		
	}

	private static void reverseAString(String str) {
	
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			
			rev=rev+c;
		}
		
		System.out.println("Reverse of String is \n"+rev);
	}
	

}
