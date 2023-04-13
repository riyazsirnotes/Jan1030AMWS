package apr13th;

import java.util.Scanner;

public class VoterApp {
	
	public static void main(String[] args) throws InvalidAgeException {
		
		System.out.println("Enter your age : ");
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age >=18 )
		{
			System.out.println("Welcome for voting");
		}
		else
		{
			//throw new RuntimeException("Not eligble for voting");
			throw new InvalidAgeException();
		}
		
	}

}
