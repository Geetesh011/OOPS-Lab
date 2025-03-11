import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = 7, guess;
        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            }
        } while (guess != secret);
        System.out.println("Correct! You guessed it.");
        scanner.close();
    }
}