import java.util.Scanner;

public class CodingChallenge1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number between 20 and 200: ");
		int number;

		number = scan.nextInt();

		if (number >= 20 && number <= 200) {

			if (number % 15 == 0) {
				System.out.println("Your number is divisible by 15.");
			}
			if (number % 5 == 0) {
				System.out.println("Your number is divisible by 5.");
			}
			if (number % 3 == 0) {
				System.out.println("Your number is divisible by 3.");
				
			} else {
				System.out.println("Your number is not divisible by 3, 5, or 15");
			}

		} else {
			System.out.println("Your number is not between 20 and 200");
		}

		scan.close();

	}

}
