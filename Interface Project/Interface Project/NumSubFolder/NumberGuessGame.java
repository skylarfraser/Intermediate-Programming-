package NumSubFolder;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.util.ArrayList;
import Game.GameWriteable;
import Games.java;


public class NumberGuessGame implements GameWriteable {
    ArrayList<Integer> userguess = new ArrayList();

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
            while(i == true){
                Game1 g = new Game1(minimum, maximum, rand, sc);
                System.out.println(
                    "You will have to choose a random number between " + minimum + "and " + maximum + ". Good luck!");
            System.out.println("Please type in your first guess.");
        
                g.mainGame(sc);
    
            }
    }

    @Override
    public String getScore(){
        int attempts = userguess.size();
        this.userguess = new ArrayList<Integer>();
        System.out.println("Congratulations! You have guessed the number!");
        System.out.println("You had " + attempts + " attempt(s).");  

        return Integer.toString(attempts);
        return Games.main();
    
    }

    @Override
    public boolean isHighScore(String score, String highscore, File f) {
        if (Integer.parseInt(score) < Integer.parseInt(highscore)){
            return true;
        }
        else{
            return false;
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








    

