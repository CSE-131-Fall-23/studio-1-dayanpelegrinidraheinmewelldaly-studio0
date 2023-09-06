package studio1;

import java.util.Scanner;

public class LeapYear {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		boolean cond1 = (year % 4 == 0);
		boolean cond2 = (year % 100 == 0);
		boolean cond3 = (year % 400 == 0);
		boolean leap = ((cond1 && cond2 && cond3) || (cond1 == true && cond2 == false && cond3 == false));
		System.out.print(year + " is a leap year: " + leap);

	}

}
