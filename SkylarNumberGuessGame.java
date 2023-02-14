//Skylar Fraser 10
//Number Guess Game
//B Period
//1.20.23

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class SkylarNumberGuessGame {
    public static void main(String[] args) throws Exception {
        ArrayList <Game1> games =  new ArrayList <Game1> ();

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






            boolean i = true;
            while(i == true){
                Game1 g = new Game1(minimum, maximum, rand, sc);
                System.out.println(
                    "You will have to choose a random number between " + minimum + "and " + maximum + ". Good luck!");
            System.out.println("Please type in your first guess.");
        
                g.mainGame(sc);
    
    
            }
 
    }

       
   
        public static int secondErrorChecking(Scanner sc) {
            if (!sc.hasNextInt()) {
                sc.next(); // This will throw away the incorrect input
     
     
                System.out.println("The input is not a number. Please type in a valid number!");
                return secondErrorChecking(sc);
            } else {
                return sc.nextInt();
            }
     
     
        }
    }





