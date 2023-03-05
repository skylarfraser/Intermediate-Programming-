import java.util.ArrayList;
import java.util.Scanner;

//Skylar Fraser 10
//Super Store Game
//B Period


public class SkylarSuperStore{
    public static void main(String[] args) throws Exception {
        System.out.println("After being the only one in London to survive the apocalypse (since you hid in the underground bunker of a bank), you now have access to the vault storing hundreds of millionaires’ money and it is up to you to spend all of the money before the state authorities find you.");
        System.out.println("Below you will find a selection of finely-picked items from a very legal company in a very legal market!");
        System.out.println("In order to purchase an item, please type in its corresponding number on the list.");
    
        Store.displaystore();

        
    }

    public void mainGame(long wallet, ArrayList <Integer> trials){
   

        Scanner sc = new Scanner(System.in);

        //for every attempt, add it to the array list that counts the trials
        int attempt = sc.nextInt();
        for (int i = 0; i <11; i++){
            trials.add(attempt);
        }

        //once the size of the array list is 10 (meaning that they have had 10 tries)
        //and the wallet is greater than 23480000 (meaning majority has been spent) 
        //then the user has lost the game
        if (trials.size() == 10 && wallet > 24580000){
            System.out.println("Unfortunately, you have only spent" + wallet +"dollars. You ran out of time and have been caught, meaning you lost the game. Feel free to try again!");
            //then return the main game 
        }

        //once the size of the array list is 10, but the user has spent more than
        //the majority or greater than it, then the user has techincally not lost the game
        else if (trials.size() == 10 && wallet <= 24580000){
            System.out.println("Although you have run out of time, you successfuly spent the bare majoirity of the money so you were able to escape! Feel free to try again!");
            //then return the main game
        }

        //if the user spent all of the money in 10 or fewer turns, then they have won the game

        else if (trials.size() >= 10 && wallet <= 0){
            System.out.println("Congratulations! You were successfully able to spend all of the money! You won and you don't have to go to jail!");
            //then return the main game
        }


    }





}