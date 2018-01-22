import java.util.Scanner;

public class Alpha {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an Alphabet:");
		int a = 0;
		String str = input.nextLine();
		int length = str.length();
		for (int j = 0; j <= length; j++) {
			char sub = str.charAt(j);
			if (sub == 'a') {
				System.out.println("Its Alive!");
				a++;
			} else
				System.out.println("Still dead.");
		}
		System.out.println(a);
	}
}
