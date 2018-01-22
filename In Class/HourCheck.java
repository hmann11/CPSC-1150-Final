import java.util.Scanner;
public class HourCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day = 24;
		System.out.print("Please enter an hour in military format:");
		int user = input.nextInt();
		String phrase;
		phrase =(user <= day)?"is a valid hour":"is a invalid hour";
		System.out.println(user+" "+phrase);
	}

}
