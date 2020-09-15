import java.util.*;

public class GuessGame {

	public static void main(String[] args) {
		GuessGame m = new GuessGame();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int input = scan.nextInt();
		scan.close();
		int rN = (int)(Math.random()*10);
		if (input == rN) {
			System.out.println("Well done smarty!");
		} else {
			m.looser();
		}
	}

	public void looser() {
//		int looserNum = (int)(Math.random()*7);
		switch ((int) (Math.random() * 7)) {
		case 0:
			System.out.println("You are so stupid.");
			break;
		case 1:
			System.out.println("You are rediculous.");
			break;
		case 2:
			System.out.println("Why are you on earth!!! Go to the Venus!");
			break;
		case 3:
			System.out.println("You should be hanged out.");
			break;
		case 4:
			System.out.println("Do not dare to play it again.");
			break;
		default:
			System.out.println("Leave java, now!");

		}

	}

}
