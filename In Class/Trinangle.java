import java.util.Scanner;

public class Trinangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("num of stars: ");
		int stars = input.nextInt();
		for (int row = 0; row < stars; row++) {
			for (int i = 0; i<=row ; i++) {
				System.out.print("*");
			}
			System.out.println();
			

		}
	}
}

