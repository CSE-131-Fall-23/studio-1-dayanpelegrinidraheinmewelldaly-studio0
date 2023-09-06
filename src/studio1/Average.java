package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("First integer: ");
		int n1 = in.nextInt();
		System.out.print("Second integer: ");
		int n2 = in.nextInt();
		double sum = n1 + n2;
		double average = sum / 2;
		System.out.print("The average of " + n1 + " and " + n2 + " is " + average);

	}

}
