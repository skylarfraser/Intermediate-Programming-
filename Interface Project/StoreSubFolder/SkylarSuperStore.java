package StoreSubFolder;

import java.util.Scanner;
import java.io.File;
import java.util.Random;
import Game.GameWriteable;

//Skylar Fraser 10
//Super Store Game
//B Period

public class SkylarSuperStore implements GameWriteable {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static long wallet = 700000000;
    static int trials = 0;
    static int index;
    private static Item fashitem;
    private static Item realitem;
    private static Item miscitem;

    @Override
    public String getGameName() {
        return getClass().getSimpleName();
    }

    @Override
    public void play() {
        System.out.println(
                "After being the only one in London to survive the apocalypse (since you hid in the underground bunker of a bank), you now have access to the vault storing hundreds of millionaires’ money and it is up to you to spend all of the money before the state authorities find you.");
        System.out.println(
                "Below you will find a selection of finely-picked items from a very legal company in a very legal market!");
        Store.createItems();
        Store.displaystore();
        addSale(rand);
        getScore();

        while (true) {
            buyItem(sc, trials, fashitem, realitem, miscitem);
            // getScore();
        }
    }

    @Override
    public String getScore() {
        return Long.toString(wallet);
    }

    @Override
    public boolean isHighScore(String score, String highscore, File f) {
        if (wallet < Integer.parseInt(highscore)) {
            return true;
        } else {
            return false;
        }
    }

    // // // // // // // // // // // // // // // // // // // // // // // // // // //
    // // // // // // //

    public int buyItem(Scanner sc, int trials, Item fashitem, Item realitem, Item miscitem) {
        Item item = Store.getItemWithIndex(index);
        index = sc.nextInt();

        // while trials is less than 5, return the game.
        // when trials is greater than 5, then get the score

        if (sc.hasNextInt()) {
            trials++;

            if (trials > 5) {
                if (wallet > 525000000) {
                    System.out.println("Unfortunately, you have only spent" + wallet
                            + "dollars. You ran out of time and have been caught, meaning you lost the game. Feel free to try again!");

                    buyItem(sc, trials, fashitem, realitem, miscitem);

                } else if (wallet <= 525000000) {
                    System.out.println(
                            "Although you have run out of time, you successfuly spent the bare majoirity of the money so you were able to escape! Feel free to try again!");
                    buyItem(sc, trials, fashitem, realitem, miscitem);

                } else if (wallet == 0) {
                    System.out.println(
                            "Congratulations! You were successfully able to spend all of the money! You won and you don't have to go to jail!");

                }
            } else {
                buyItem(sc, trials, fashitem, realitem, miscitem);
                if (item.price >= wallet) {
                    System.out.println("You do not have enough money to buy this item. Please pick a different one.");
                    buyItem(sc, trials, fashitem, realitem, miscitem);
                }
                if (index < 0 || index >= 10) {
                    System.out.println("This is an unidentable item. Please type in an valid number.");
                    buyItem(sc, trials, fashitem, realitem, miscitem);
                }
            }

            wallet -= item.price;
            item.count--;

            System.out.println("Wallet: " + wallet);
            System.out.println("Trials: " + trials);
            System.out.println();
            Store.displaystore();
        } else {
            sc.next();
            System.out.println("The input is not a number. Please type in a valid number!");
            buyItem(sc, trials, fashitem, realitem, miscitem);
        }
        return trials;

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
