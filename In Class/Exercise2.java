
/**
 * October 12th, 2017 3:58 PM
 * @author hmann11
 * This program take a positive 3 digit number and breaks it down to its individual places,
 *  showing what power of 10 each digit in the number possesses.
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit number:");
		int num = input.nextInt();
		int quotient;
		int rem;
		int quotient2;
		input.close();
		if (num > 99) {
			quotient = (int) num / 100;
			rem = (num / 10) - (quotient * 10);
			quotient2 = num % 10;
			System.out.println("The number is: " + quotient + "*10^2 + " + rem + "*10^1 + " + quotient2 + "*10^0");
		} else
			System.out.println("Error:please enter a three digit number");
	}

}
