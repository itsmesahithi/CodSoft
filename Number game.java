import java.util.Scanner;
public class NumberGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberToGuess = 42; // The number to guess
    int numberOfTries = 0; // Number of tries the user has made

    while (true) {
      System.out.println("Guess a number between 1 and 100:");
      int guess = scanner.nextInt();
      numberOfTries++;

      if (guess == numberToGuess) {
        System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
        break;
      } else if (guess < numberToGuess) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
  }
}