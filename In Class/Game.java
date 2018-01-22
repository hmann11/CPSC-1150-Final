import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s ="";
		int Comp = (int) (Math.random() * 3);
		if (Comp != 0) {
			if (Comp == 1)
				s = "Paper";
			else
				s = "Scissors";
		} else
			s = "Rock";
		System.out.print("Let's play a game. Choose Rock, Paper or Scissors and enter your selection :");
		String Player = input.next();
		input.close();
		System.out.print("\nSkynet choose " + s + ". ");

		if (Player.equals(s))
			System.out.print("It is a tie.");
		else {
			if ((Player.equals("Scissors")) && (s.equals("Rock")))
				System.out.print("Skynet has won.");
			else {
				if ((Player.equals("Rock")) && (s.equals("Paper")))
					System.out.println("Skynet has won.");
				else {
					if ((Player.equals("Paper")) && (s.equals("Scissors")))
						System.out.println("Skynet has won.");
					else
						System.out.println("You win this time.");
				}

			}

		}
	}
}
