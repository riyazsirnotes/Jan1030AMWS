package may6th;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
		
		

		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		isPalindrome(str);
		
	}

	private static void isPalindrome(String str) {
	
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			
			rev=rev+c;
		}
		
		System.out.println("Reverse of String is \n"+rev);
		
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}
