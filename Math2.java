import java.util.Scanner;

public class Math2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 4 integers");
		int x = input.nextInt();
		int x2 = input.nextInt();
		int y = input.nextInt();
		int y2 = input.nextInt();
		int X = (int) Math.pow(x - x2, 2);
		int Y = (int) Math.pow(y - y2, 2);
		double result = Math.sqrt(X + Y);
		System.out.println(result);
		System.out.println("Enter the float and press enter");
		double num= input.nextDouble();
		System.out.println("Round up is: "+Math.ceil(num));
		System.out.println("Round down is: "+Math.floor(num));
		input.close();

	}
}