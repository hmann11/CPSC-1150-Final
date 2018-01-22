import java.util.Scanner;

public class PrintExercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Y = 0;
		int y;
		int c = 0;
		int d = input.nextInt();
		int m = input.nextInt();
		int yyyy = input.nextInt();
		if (m <= 2) {
			Y = yyyy - 1;
		}else y =yyyy;
		y = yyyy % 100;
		System.out.println(y);
		int div = (int) Math.pow(10, 2);
		while (yyyy / div > 0) {
			c = yyyy /= 10;
		}
		int w = (d+(13*(m+1/5))+Y+(y/4)+(c/4)-(2*c))%7;
		String day="";
		switch(w) {
		case 0:
		day="Saturday";
		break;
		case 1:
		day="Sunday";
		break;
		case 2:
		day="Monday";
		break;
		case 3:
		day="Tuesday";
		break;
		case 4:
		day="Wednesday";
		break;
		case 5:
		day="Thursday";
		break;
		case 6:
		day="Friday";
		break;
		}
		System.out.println(day);
	}

}
