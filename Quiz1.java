
/**
 * September 21st 2017
 * @author hmann11
 * This program take the height of a male or female and displays the Ideal weight for their respective gender.
 */
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in feet as a whole number.");
		int feet = input.nextInt();
		System.out.println("Please enter the remainder of your height in inches.");
		int inch = input.nextInt();
		int male = (((feet-5)* 12 + inch) * 6) + 106;// Multiplying the remainder with 12 to convert the value into inch
													// scale and then the result multiply by 6 and adding 106 to it
		double m1= male - (male*0.15);
		double m2= male + (male*0.15);
		System.out.println("Ideal Male Weight is " + male + " or it could be between the range of "+m1+" and " +m2);
		int female = (((feet-5) * 12 + inch) * 5) + 100;//Doing the same for the female weight
		double f1= female - (female*0.15);
		double f2= female + (female*0.15);
		System.out.println("Ideal Female Weight is " + female+ " or it could be between the range of "+f1+" and "+f2);
	}

}
