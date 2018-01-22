
/**
 * @author hmann11 
 * This program checks if the amount of stationary bought is correct and gives the grand total cost of the stationary.
 */
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Langara Bookstore");
		// Taking the amount of the stationary bought.
		System.out.print("Number of notebook: ");
		int book = input.nextInt();
		System.out.print("Number of pens:");
		int pen = input.nextInt();
		System.out.print("Number of pencils: ");
		int pencil = input.nextInt();
		// The following statements check if the amount of stationary bought is correct and returns the appropriate response.
		if (pen >= book && pencil >= (2 * book)) {
			System.out.println("Order is OK");
		} else {
			if (pen <= book && pencil <= (2 * book)) {
				System.out.println("Check oreder: too few pens");
				System.out.println("Check order: too few pencils");
			} else {
				if (pencil<=(2*book))
					System.out.println("Check order: too few pencils");
				else
					System.out.println("Check order: too few pens");
			}
		}
		// Calculating total cost of the stationary and printing it out.
		float total = 5 * book + 3 * pen + pencil;
		System.out.println("Total cost: $" + total);

	}

}
