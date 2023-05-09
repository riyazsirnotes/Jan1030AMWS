package may9th;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfEachCharacter {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a String : ");
		Scanner input=new Scanner(System.in);
		
		String str=input.nextLine();
		
		toFindCountofEachCharacterInaString(str);
		
		
	}

	private static void toFindCountofEachCharacterInaString(String str) {
		
		char[]  allChars=str.toCharArray();
		
		HashMap<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<allChars.length;i++)
		{
			
			char ch=allChars[i];
			
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch, 1);
			}
			
		}
		
		System.out.println(hMap);
		
		
	}
	

}
