import java.util.Scanner;
public class NumberGame {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int numberToGuess=36; 
    int numberOfTries=0; 
     while (true) {
      System.out.println("Guess a number between 1 and 100:");
      int guess=scanner.nextInt();
      numberOfTries++;
       if (guess==numberToGuess) {
        System.out.println("Congratulations..."); 
        System.out.println("You found the number in " + numberOfTries + " tries");
        break;
      } else if (guess<numberToGuess) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
  }
}
