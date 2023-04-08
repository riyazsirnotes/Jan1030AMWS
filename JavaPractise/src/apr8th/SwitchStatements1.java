package apr8th;

import java.util.Scanner;

public class SwitchStatements1 {

	public static void main(String[] args) {

		int dt, mon, year;
		String month;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter date ");
		dt = input.nextInt();

		System.out.println("Enter month ");
		mon = input.nextInt();

		switch (mon) {

		case 1:
			month = "JAN";
			break;
			
		case 2:
			month = "FEB";
			break;
		case 3:
			month = "MAR";
			break;
		case 4:
			month = "APR";
			break;
		case 5:
			month = "MAY";
			break;
		case 6:
			month = "JUN";
			break;
		case 7:
			month = "JUL";
			break;
		case 8:
			month = "AUG";
			break;
		default:
			month = null;
			System.out.println("Invalid Month is inputed");
		}

		System.out.println("Enter year ");
		year = input.nextInt();

		System.out.format("%02d-%02d-%04d", dt, mon, year);
		System.out.println();
		System.out.format("%02d-%s-%04d", dt, month, year);

	}

}
