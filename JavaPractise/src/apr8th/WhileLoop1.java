package apr8th;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		char ch;
		while(true)
		{
			System.out.println("Enter some character ");
			ch=input.next().trim().charAt(0);
			if(ch == 'x' || ch == 'X')
			{
				break;
			}
			else
			{
				System.out.println("you have entered "+ch+" character ");
			}
		}

	}

}
