package NumSubFolder;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import Game.*;


public class NumberGuessGame implements GameWriteable {
    Game1 g;

    @Override
    public String getGameName() {
        return getClass().getSimpleName();
    }

    
    @Override
    public void play(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.println("Type in a minimum.");
        int minimum = secondErrorChecking(sc);
        System.out.println("Now type in a maximum.");
        int maximum = secondErrorChecking(sc);


            boolean i = true;
                g = new Game1(minimum, maximum, rand, sc);
                System.out.println(
                    "You will have to choose a random number between " + minimum + "and " + maximum + ". Good luck!");
            System.out.println("Please type in your first guess.");
        
                g.mainGame(sc);
    
            
    }

    @Override
    public String getScore(){
        int attempts = g.userguess.size();
        System.out.println("Congratulations! You have guessed the number!");
        System.out.println("You had " + attempts + " attempt(s).");  

        return Integer.toString(attempts);
        //after returning attempts
        //return the main interface (Games)
    
    }

    @Override
    public boolean isHighScore(String score, String highscore, File f) {
        try {
        if (Integer.parseInt(score) < Integer.parseInt(highscore)){
            return true;
        }
        else{
            return false;
        }       }
        catch(Exception e) {
            return true;
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








    

