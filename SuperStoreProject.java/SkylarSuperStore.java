import java.util.Scanner;
import java.util.Random;

//Skylar Fraser 10
//Super Store Game
//B Period


public class SkylarSuperStore {
    static long wallet = 700000000;
    static int trials = 0;
    static int index;
    private static Item fashitem;
    private static Item realitem;
    private static Item miscitem;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) throws Exception {
        System.out.println(
                "After being the only one in London to survive the apocalypse (since you hid in the underground bunker of a bank), you now have access to the vault storing hundreds of millionaires’ money and it is up to you to spend all of the money before the state authorities find you.");
        System.out.println(
                "Below you will find a selection of finely-picked items from a very legal company in a very legal market!");

        Store.createItems();
        Store.displaystore();

        addSale(rand);

        while (true) {
            buyItem(sc, trials, fashitem, realitem, miscitem);
        }

    }

    public static void buyItem(Scanner sc, int trials, Item fashitem, Item realitem, Item miscitem) {
        if (sc.hasNextInt()) {
            trials++;

            // Item = desired purchase of user (which corresponds to a specific number on
            // the list)
            index = sc.nextInt();
            Item item = Store.getItemWithIndex(index);
            if (index < 0 || index >= 10) {
                System.out.println("This is an unidentable item. Please type in an valid number.");
                buyItem(sc, trials, fashitem, realitem, miscitem);
            }

            wallet -= item.price;
            item.count--;

            System.out.println("Wallet: " + wallet);
            System.out.println();
            Store.displaystore();

            if (trials == 10 && wallet > 525000000) {
                System.out.println("Unfortunately, you have only spent" + wallet
                        + "dollars. You ran out of time and have been caught, meaning you lost the game. Feel free to try again!");
                buyItem(sc, trials, fashitem, realitem, miscitem);
                ;
            }

            // once the size of the array list is 10, but the user has spent more than
            // the majority or greater than it, then the user has techincally not lost the
            // game
            else if (trials == 10 && wallet <= 525000000) {
                System.out.println(
                        "Although you have run out of time, you successfuly spent the bare majoirity of the money so you were able to escape! Feel free to try again!");
                buyItem(sc, trials, fashitem, realitem, miscitem);
            }

            // if the user spent all of the money in 10 or fewer turns, then they have won
            // the game
            else if (trials <= 10 && wallet == 0) {
                System.out.println(
                        "Congratulations! You were successfully able to spend all of the money! You won and you don't have to go to jail!");
                System.exit(0);

            }

        } else {
            sc.next();
            System.out.println("The input is not a number. Please type in a valid number!");
            buyItem(sc, trials, fashitem, realitem, miscitem);
        }

    }

    public static void addSale(Random rand) {
        rand.nextInt(0, 3); // exclusive of max

        if (rand.nextInt() == 0) {
            // put all fashion items on sale
            for (Item i : Store.getFashItems()) {
                i.mainDiscount(rand);
            }


        } else if (rand.nextInt() == 1) {
            // put all realestate items on sale
            for (Item i : Store.getRealItems()) {
                i.mainDiscount(rand);
            }


        } else if (rand.nextInt() == 2) {
            // put all misc items on sale
            for (Item i : Store.getMiscItems()) {
                i.mainDiscount(rand);
            }
        }
    }

}
