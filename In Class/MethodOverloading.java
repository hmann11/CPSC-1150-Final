import java.util.Scanner;

public class MethodOverloading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the numbers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.print(average(a, b));
		System.out.println(average(a, b, c));
	}

	private static int average(int i, int j, int k) {
		return ((i + j + k) / 3);
	}

	private static float average(int i, int j) {
		return (float) ((i + j) / 2.0);
	}
}
