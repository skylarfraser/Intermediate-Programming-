import java.util.Scanner;

//Skylar Fraser 10
//Super Store Game
//B Period


public class SkylarSuperStore{
    static long wallet = 700000000;
    static int trials;
    static Scanner sc = new Scanner(System.in);
    static int index = sc.nextInt();


    public static void main(String[] args) throws Exception {

        System.out.println("After being the only one in London to survive the apocalypse (since you hid in the underground bunker of a bank), you now have access to the vault storing hundreds of millionaires’ money and it is up to you to spend all of the money before the state authorities find you.");
        System.out.println("Below you will find a selection of finely-picked items from a very legal company in a very legal market!");
    
        Store.createItems();
        Store.displaystore();

        mainGame(sc);
        buyItem(sc, trials);

     
    }
 

    public static void mainGame(Scanner sc){
        System.out.println("In order to purchase an item, please type in its corresponding number on the list.");
        buyItem (sc, trials);

    }


        public static void buyItem(Scanner sc, int trials){

            if (sc.hasNextInt()){
                trials++;

                //Item = desired purchase of user (which corresponds to a specific number on the list)
                Item item = Store.getItemWithIndex(index);
                
                wallet -= item.price;
                item.count --; 
                System.out.println("Wallet: " + wallet);
                System.out.println();
                Store.displaystore();




                if (trials == 10 && wallet > 525000000){
                    System.out.println("Unfortunately, you have only spent" + wallet + "dollars. You ran out of time and have been caught, meaning you lost the game. Feel free to try again!");
                    mainGame(sc);;
                }
        
                //once the size of the array list is 10, but the user has spent more than
                //the majority or greater than it, then the user has techincally not lost the game
                else if (trials == 10 && wallet <= 525000000){
                    System.out.println("Although you have run out of time, you successfuly spent the bare majoirity of the money so you were able to escape! Feel free to try again!");
                    mainGame(sc);
                }
        
                //if the user spent all of the money in 10 or fewer turns, then they have won the game
                else if (trials >= 10 && wallet <= 0){
                    System.out.println("Congratulations! You were successfully able to spend all of the money! You won and you don't have to go to jail!");
                    System.exit(0);




         
            }

            else if (index < 0 || index >= 10){
                System.out.println("This is an unidentable item. Please type in an valid number.");
                mainGame(sc);
            }
    
            
            else {
                sc.next(); 
                System.out.println("The input is not a number. Please type in a valid number!");
                mainGame(sc);
            }

        }
     

    

}

}

