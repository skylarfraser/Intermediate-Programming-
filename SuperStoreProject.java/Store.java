import java.util.ArrayList;

public class Store {
    static ArrayList <Item> items = new ArrayList();


    public static void createItems(){
        items.add(new Item(0, "The Himalayan Birkin", 500000l, 10));
        items.add(new Item(1, "Solid Gold OVO x Air Jordans", 2000000l, 20));
        items.add(new Item(2, "Gold Cartier Crash", 6000000l, 5));

        items.add(new Item(3, "Kanye West's Former Wyoming Ranch", 20000000l, 1));
        items.add(new Item(4, "20 Acre Plot of Land in a Rural Town in Indiana", 100000l, 50));
        items.add(new Item(5, "40 Acre Plot w/  Farm in Oregon",2000000l, 50 ));

        items.add(new Item(6, "The Persistence of Memory", 100000000l, 1));
        items.add(new Item(7, "Apple Macbook Air",2000l, 100));
        items.add(new Item(8, "Ream of Paper", 15l, 100));
        items.add(new Item(9, "The Death of Marat", 500000000l, 1));
    }

    public static ArrayList<Item> getFashItems() {
        ArrayList<Item> fash = new ArrayList<Item>();
        for (int i = 7; i < 10; i++) {
            Item fashitem = items.get(i); 
            fash.add(fashitem);
        }
        return fash;
    }

    public static ArrayList<Item> getRealItems() {
        ArrayList<Item> real = new ArrayList<Item>();
        for (int i = 7; i < 10; i++) {
            Item realitem = items.get(i); 
            real.add(realitem);
        }
        return real;
    }

    

    public static ArrayList<Item> getMiscItems() {
        ArrayList<Item> miscs = new ArrayList<Item>();
        for (int i = 7; i < 10; i++) {
            Item miscitem = items.get(i); 
            miscs.add(miscitem);
        }
        return miscs;
    }


    public static Item getItemWithIndex(int index) {
        for (int i = 0; i < 3; i++) {
            Item fashitem = items.get(i); 
            if (fashitem.index == index) {
                return fashitem;
            }
        }
        for (int i = 3; i < 6; i++) {
            Item realitem = items.get(i); 
            if (realitem.index == index) {
                return realitem;
            }
        }
        for (int i = 7; i < 11; i++) {
            Item miscitem = items.get(i); 
            if (miscitem.index == index) {
                return miscitem;
            }
        }
        return null;
    }


    public static void displaystore(){

        System.out.println("Below you will find a selection of items to purchae! Spend your money wisely!");
        System.out.println();

        System.out.println("Designer Fashion:");
        for (int i= 0; i < 3; i++){
            System.out.println(items.get(i).index + " " + items.get(i).label + ", price: " + items.get(i).price + ", count: " + items.get(i).count);

        }
        System.out.println();
        System.out.println("Western Real Estate:");
        for (int i= 3; i <6; i++){
            System.out.println(items.get(i).index + " " + items.get(i).label + ", price: " + items.get(i).price + ", count: " + items.get(i).count);
           
        }

        System.out.println();
        System.out.println("Miscellaneous:");  
        for (int i = 7; i< 11; i++){
            System.out.println(items.get(i).index + " " + items.get(i).label + ", price: " + items.get(i).price + ", count: " + items.get(i).count);


        }
        System.out.println();
    }



}
 








    

