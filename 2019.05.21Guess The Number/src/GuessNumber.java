import java.util.Scanner;

public class GuessNumber {
	

    private static Scanner scanner = new Scanner(System.in);
    
	
	private int secretNumber;
	private int attempts;
	public GuessNumber(int secretNumber, int attempts) {
		this.secretNumber = secretNumber;
		this.attempts = attempts;
	}
	
	
	public void play() {
		System.out.println("Enter number");
		while(attempts > 0) {
			int nextInt= scanner.nextInt();
			if(nextInt == secretNumber) {
				System.out.println("You won!");
				break;
			}
			attempts--;
			System.out.println("Wrong number, attemptsleft: "+attempts);
		}
	}
	
	public static void main(String[] args) {
		GuessNumber game = new GuessNumber(3,  3);
		game.play();
	}
}
