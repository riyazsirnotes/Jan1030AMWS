package apr13th;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException()
	{
		System.out.println("Not valid age for voting");
	}

}
