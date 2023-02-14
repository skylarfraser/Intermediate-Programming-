import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Game1 {
    // Fields
    int minimum;
    int maximum;
    Random rand;
    ArrayList<Integer> userguess;
    Scanner sc;
    int response;

    // Constructor
    Game1(int minimum, int maximum, Random rand, Scanner sc) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.rand = rand;
        this.userguess = new ArrayList<Integer>();
        this.sc = sc;
        

    }

    public void mainGame(Scanner sc, int rand) {
        int guess = errorChecking(sc, minimum, maximum);



        // If the user guesses a number that they have guessed before, the attempt is
        // not counted
        // and the user is notified.
        // The game continues and that specific attempt is not stroed.
        if (userguess.contains(guess)) {
            System.out.println("You have already tried this. Please try again");
            mainGame(sc, rand);
        }

        // If the user guesses the number, they are notified about their win and
        // they are given the amount of tries that they took.
        else if (guess == rand) {
            userguess.add(guess);
            System.out.println("Congratulations! You have guessed the number!");
            int attempts = userguess.size();
            System.out.println("You had " + attempts + " attempt(s).");
            //return;

        }

        // If the guess is higher than the designated number, the user is notified and
        // is told to go lower.
        // The guess is also added to the count that tracks the attempts.
        else if (guess > rand) {
            userguess.add(guess);
            System.out.println("Go lower!");
            mainGame(sc, rand);

        }

        // If the guess is lower than the designated number, the user is notified and is
        // told to go higher.
        // The guess is also added to the count (that tracks the attempts).

        else if (guess < rand) {
            userguess.add(guess);
            System.out.println("Go higher!");
            mainGame(sc, rand);
        }

        else if (rand - guess >= 30 || guess - rand >= 30 ) {
            System.out.println("You are more than 30 numbers away. Please try something closer");

        }


    }


    public int errorChecking(Scanner sc, int minimum, int maximum) {
        if (!sc.hasNextInt()) {
            sc.next(); // This will throw away the incorrect input

            System.out.println("The input is not a number. Please type in a valid number!");
            return errorChecking(sc, minimum, maximum);
        }
        int response = sc.nextInt();

        if (response > maximum || response < minimum) {
            System.out.println(
                    "The input cannot be recieved. It is not within the given range. Please type in a vaild input.");
            return errorChecking(sc, minimum, maximum);
        } else {
            return response;
        }
    }






}
