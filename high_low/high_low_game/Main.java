package high_low_game;
import java.util.Scanner;




public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String playAgain = "";
        do {
            // Create the number to guess.
            int randNumber = (int) (Math.random() * 1000 + 1);
            // System.out.println(randNumber);
            int userGuess = 0;
            int guesses = 0;
            while (userGuess != randNumber) {
                System.out.println("Guess a number between 1 and 1000");
                userGuess = userInput.nextInt();
                guesses ++;
                if (userGuess < randNumber) {
                    System.out.println(userGuess + " is too low. Try again");
                } else if (userGuess > randNumber) {
                    System.out.println(userGuess + " is too high, try again.");
                } else if (userGuess == randNumber) {
                    System.out.println(userGuess + " is right! I GUESS you won in " + guesses + " tries!");
                    guesses = 0;
                }
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = userInput.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing. Bye Bye now.");
        userInput.close();
    }
}
