
/**
 * October 12th 3:42 PM
 * @author hmann11 
 * This program takes a properly formated full name(i.e. with spaces in all the right places) and 
 * then prints out the capitalized initials of that name.
 */
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your full name, seperated by spaces:");
		String name = input.nextLine();
		name = name.toUpperCase();
		char fname = name.charAt(0);
		System.out.print(fname);
		int mname = (name.indexOf(" ")) + 1;
		System.out.print(name.charAt(mname));
		int lname = (name.lastIndexOf(" ")) + 1;
		System.out.print(name.charAt(lname));
		input.close();
	}

}
