//Skylar Fraser 10
//Number Guess Game
//B Period
//1.20.22

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class SkylarNumberGuessGame {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // This array list is used to store each attempt made by the user.
        ArrayList<Integer> userguess = new ArrayList();

        // This is the count for the user's attempts. It calculates the size of the
        // array list
        // which is made up of the different attempts.
        int attempts = userguess.size();

        // This will select the random number (only 1) each time the game is played
        Random rand = new Random();
        int[] arr = new int[1];

        // This sets out the intro for the game.
        // The user sets the range by typing in a minimum and a maximum.

        System.out.println("Type in a minimum.");
        int minimum = secondErrorChecking(sc);
        System.out.println("Now type in a maximum.");
        int maximum = secondErrorChecking(sc);

        // For loop: A random number is chosen within the given range (which was
        // previously set by the user)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(minimum, maximum);
            int guess = arr[i];
            System.out.println(
                    "You will have to choose a random number between " + minimum + "and " + maximum + ". Good luck!");
            System.out.println("Please type in your first guess.");

        }
        mainGame(sc, arr[0], userguess, minimum, maximum);

    }

    // Main function for the game
    public static void mainGame(Scanner sc, int rand, ArrayList<Integer> userguess, int minimum, int maximum) {
        int guess = errorChecking(sc, minimum, maximum);

        // If the user guesses a number that they have guessed before, the attempt is
        // not counted
        // and the user is notified.
        // The game continues and that specific attempt is not stroed.
        if (userguess.contains(guess)) {
            System.out.println("You have already tried this. Please try again");
            mainGame(sc, rand, userguess, minimum, maximum);
        }

        // If the user guesses the number, they are notified about their win and
        // they are given the amount of tries that they took.
        if (guess == rand) {
            userguess.add(guess);
            System.out.println("Congratulations! You have guessed the number!");
            int attempts = userguess.size();
            System.out.println("You had " + attempts + " attempt(s).");
            mainGame(sc, rand, userguess, minimum, maximum);

        }

        // If the guess is higher than the designated number, the user is notified and
        // is told to go lower.
        // The guess is also added to the count that tracks the attempts.
        if (guess > rand) {
            userguess.add(guess);
            System.out.println("Go lower!");
            mainGame(sc, rand, userguess, minimum, maximum);

        }

        // If the guess is lower than the designated number, the user is notified and is
        // told to go higher.
        // The guess is also added to the count (that tracks the attempts).

        if (guess < rand) {
            userguess.add(guess);
            System.out.println("Go higher!");
            mainGame(sc, rand, userguess, minimum, maximum);
        }

    }

    // Function for error checking.
    // It checks to see if the input is a valid integer (meaning that it is within
    // the set range)
    // and it checks to see if the input is an integer at all (just in case a string
    // is put in).
    public static int errorChecking(Scanner sc, int minimum, int maximum) {

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


    //this is the second error checking function for the main function
    //(not the main game function, but just the overall main function)
    public static int secondErrorChecking(Scanner sc) {
        if (!sc.hasNextInt()) {
            sc.next(); // This will throw away the incorrect input

            System.out.println("The input is not a number. Please type in a valid number!");
            return secondErrorChecking(sc);
        } else {
            return sc.nextInt();
        }

    }

    // Function that checks to see if the user has repeated one of their original
    // attempts.
    // This function is used in the main game function, but the initialization for
    // the specific
    // variables occur here.
    public static void addtoCount(ArrayList<Integer> userguess, int guess, int rand, Scanner sc, int minimum,
            int maximum) {
        userguess.add(guess);

        if (userguess.contains(guess)) {
            userguess.remove(guess);
            System.out.println("You have already tried this. Please try again");
            mainGame(sc, rand, userguess, minimum, maximum);
        }
    }

}
