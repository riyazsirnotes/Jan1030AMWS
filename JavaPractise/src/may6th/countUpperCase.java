package may6th;

import java.util.Scanner;

public class countUpperCase {

	public static void main(String[] args) {
		
		System.out.println("Enter a String ");
		
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		countUpperCase(str);
		
	}

	private static void countUpperCase(String str) {
	
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(Character.isUpperCase(c))
			{
				count++;
			}
		}
		
		System.out.println("No of Uppercase chars are "+count);
		
	}
	
	

}
