package apr12th;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter value for x ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter value for y ");
		
		int y=input.nextInt();
		
		
		
		try
		{
		int z=x/y;
		
		System.out.println("Quotient is "+z);
		}
		catch(ArithmeticException ae)
		{
			//System.out.println(ae.getMessage());
			
			ae.printStackTrace();
			System.out.println("Please enter non-zero value for y");
		}
		catch(RuntimeException re)
		{
			
		}
		
		
		
		
		
		System.out.println("End of Program");

	}

}
