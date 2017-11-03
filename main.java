import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int zahlx = 0;
		int zahly = 0;
		boolean running = true;
		while (running) {
			System.out.println("Please enter x");

			Scanner x = new Scanner(System.in);
			String input = x.next();
			if (input.contentEquals("q")) {
				break;
			}
			try {
				zahlx = Integer.parseInt(input);
			} catch (NumberFormatException numberFormatException) {
				System.out.println("Failure! wrong input value");
				continue;
			}
			System.out.println("Please enter y");
			String input2 = x.next();
			try {
				zahly = Integer.parseInt(input2);
			} catch (NumberFormatException numberFormatException) {
				System.out.println("Failure! wrong input value");

			}
			float result = recursion(zahlx, zahly);
			System.out.println(result);

		}
	}

	public static float recursion(int x, int y) {
		if (y < 0) {
			y = y * -1;
			return 1 / (x * recursion(x, y - 1));
		}
		if (y == 0) {
			return 1;
		}
		if (y == 1) {
			return x;
		}
		return x * recursion(x, y - 1);

	}
}
