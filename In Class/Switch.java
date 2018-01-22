import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int rem = num % 2;
		input.close();
		switch (rem) {
		case 0:
			System.out.print(num + " is even");
			break;
		case 1:
			System.out.println(num + " is odd");
			break;
		default:
			System.out.println("Well thats new.");
			break;
		}
	}

}
