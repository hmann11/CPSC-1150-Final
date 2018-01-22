import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h = 0;
		int m = 0;
		int s = 0;
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the hour, time and seconds in that respective order and press enter after entering every value");
		h = input.nextInt();
		m = input.nextInt();
		s = input.nextInt();
		input.close();
		h = h * 3600;
		m = m * 60;
		int total = 0;
		total = h + m + s;
		System.out.println(total + " Seconds");
	}

}
