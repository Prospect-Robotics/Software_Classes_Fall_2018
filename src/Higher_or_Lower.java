import java.util.Random;
import java.util.Scanner;

public class Higher_or_Lower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		
		System.out.println("Please enter a number between ");
		boolean hasNumberBeenGuessed = false;
		while(hasNumberBeenGuessed == false) {
			int input = scanner.nextInt();
			if (input == randomNumber) {
				hasNumberBeenGuessed = true;
			}
			else {
				if (input > randomNumber) {
					System.out.println("Too High!");
				}
				else {
					System.out.println("Too Low!");
				}
			}
		}
		System.out.println("Number Guessed");
		
	}
}
