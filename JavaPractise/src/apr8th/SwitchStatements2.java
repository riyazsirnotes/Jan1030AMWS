package apr8th;

import java.util.Scanner;

public class SwitchStatements2 {

	public static void main(String[] args) {
	
		int dt,mon,year;
		String month;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter date ");
		dt=input.nextInt();
		
		System.out.println("Enter month ");
		mon=input.nextInt();
		
		if(mon==1)
		{
			month="JAN";
		}
		else if(mon==2)
		{
			month="FEB";
		}
		else if(mon==3)
		{
			month="MAR";
		}
		else if(mon==4)
		{
			month="APR";
		}
		else if(mon==5)
		{
			month="MAY";
		}
		else if(mon==6)
		{
			month="JUN";
		}
		else if(mon==7)
		{
			month="JUL";
		}
		else if(mon==8)
		{
			month="AUG";
		}
		else if(mon==9)
		{
			month="SEP";
		}
		else
		{
			month="null";
		}
		
		
		System.out.println("Enter year ");
		year=input.nextInt();
		
		System.out.format("%02d-%02d-%04d",dt,mon,year);
		System.out.println();
		System.out.format("%02d-%s-%04d",dt,month,year);

	}

}
