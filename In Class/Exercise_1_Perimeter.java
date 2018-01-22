import java.util.*;
import java.text.DecimalFormat;

public class Exercise_1_Perimeter {

	public static void main(String[] args) {

		displayMenu(); // displays the menu
		DecimalFormat f = new DecimalFormat("##.00");
		Scanner scan = new Scanner(System.in); // scanning for userInput
		int userOption = scan.nextInt();

		// repeatedly ask the user for a valid input if the errorCheck doesn't
		// go through
		// or it is less than 1 and greater than 3 (as of displayMenu method

		while (userOption < 3) {
			switch (userOption) {

			case 1:
				calculateTriangle();
				break;

			case 2:
				calculateCircle();
				break;

			case 3:
				System.out.println(" ");
			}

			displayMenu();
			userOption = scan.nextInt();

		}

	}

	/**
	 * A method that checks a number if it's positive of not. Parameter: double
	 * Returns false if it's greater than 0.0
	 * **/
	public static boolean errorCheck(double userInput) {

		if (userInput < 0.0) {
			System.out.println("Please enter a valid input.");

			return false;
		}

		return true;

	}

	/*
	 * A method of type double that calculates & returns the distance between
	 * two points Parameter : double, double, double, double
	 */

	public static double calculateDistance(double x1, double y1, double x2,
			double y2) {
		// the formula to calculate distance between two point is
		// sqrt[(x1-x2)^2 + (y1-y2)^2]
		double X = Math.pow((x1 - x2), 2); // (x1-x2)^2 = X
		double Y = Math.pow((y1 - y2), 2);// (y1-y2)^2 = Y
		double distance = Math.pow((X + Y), 0.5); // sqrt(X+Y)
		return distance;
	}

	/*
	 * A double method that calculates the perimeter of a triangle using
	 * calculateDistance method Parameter: void
	 */
	public static double calculateTriangle() {
		// useful string(s)
		String str = "Please enter ";

		Scanner scan = new Scanner(System.in);

		// **NOTE: The while loops below repeatedly check for positive/valid
		// inputs from the user using the errorCheck method

		System.out.print(str + "X1 :");
		int x1 = scan.nextInt();
		while (errorCheck(x1) == false) {
			System.out.print(str + " a valid X1 :");
			x1 = scan.nextInt();
		}
		System.out.print(str + "Y1 :");
		int y1 = scan.nextInt();
		while (errorCheck(y1) == false) {
			System.out.print(str + " a valid Y1 :");
			y1 = scan.nextInt();
		}
		System.out.print(str + "X2 :");
		int x2 = scan.nextInt();
		while (errorCheck(x2) == false) {
			System.out.print(str + " a valid X2 :");
			x2 = scan.nextInt();
		}
		System.out.print(str + "Y2 :");
		int y2 = scan.nextInt();
		while (errorCheck(y2) == false) {
			System.out.print(str + " a valid Y2 :");
			y2 = scan.nextInt();
		}
		System.out.print(str + "X3 :");
		int x3 = scan.nextInt();
		while (errorCheck(x3) == false) {
			System.out.print(str + " a valid X3 :");
			x3 = scan.nextInt();
		}
		System.out.print(str + "Y3 :");
		int y3 = scan.nextInt();
		while (errorCheck(y3) == false) {
			System.out.print(str + " a valid Y3 :");
			y3 = scan.nextInt();
		}
		scan.close();

		// calculating the perimeter using the calculateDistance method
		double side1 = calculateDistance(x1, y1, x2, y2);
		double side2 = calculateDistance(x2, y2, x3, y3);
		double side3 = calculateDistance(x3, y3, x1, y1);

		// perimeter of a triangle = sum of all sides
		double perimeter = side1 + side2 + side3;

		return perimeter;

	}

	/***/

	public static double calculateCircle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius : ");
		double radius = scan.nextDouble();

		while (errorCheck(radius) == false) {
			System.out.print("Please enter a valid radius :");
			radius = scan.nextDouble();
		}
		double circF = 2 * Math.PI * radius;
		scan.close();
		return circF;
	}

	/**
	 * A void method that prints out three options for the user to choose from
	 */
	public static void displayMenu() {

		System.out.println("Select one of the following options:");
		System.out.println(" 1. Triangle");
		System.out.println(" 2. Circle");
		System.out.println(" 3. Exit");

	}


}
