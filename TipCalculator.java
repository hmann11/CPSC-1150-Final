import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		float bill = 0;
		float tip = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the total amount on the bill.");
		bill = input.nextFloat();
		System.out.println("Please enter the desired percentage of tip.");
		tip = input.nextFloat();
		if (tip > 15) {
			System.out.println("WOW BIG TIPPER");
		}
		float ntip = 0;
		input.close();
		ntip = tip / 100 * bill;
		System.out.println("The amount of tip is $" + ntip+ ".");
		System.out.print("The total amount to be payed is $" + (bill+ntip) + ".");
	}
}
