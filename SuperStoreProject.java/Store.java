import java.util.ArrayList;



public class Store {
    static ArrayList <Item> fashion = new ArrayList();
    static ArrayList <Item> realestate = new ArrayList();
    static ArrayList <Item> misc = new ArrayList();


    public static void createItems(){
        fashion.add(new Item(0, "The Himalayan Birkin", 500000l, 10));
        fashion.add(new Item(1, "Solid Gold OVO x Air Jordans", 2000000l, 20));
        fashion.add(new Item(2, "Gold Cartier Crash", 6000000l, 5));

        realestate.add(new Item(3, "Kanye West's Former Wyoming Ranch", 20000000l, 1));
        realestate.add(new Item(4, "20 Acre Plot of Land in a Rural Town in Indiana", 100000l, 50));
        realestate.add(new Item(5, "40 Acre Plot w/ a Farm in Oregon",2000000l, 50));

        misc.add(new Item(6, "The Persistence of Memory", 100000000l, 1));
        misc.add(new Item(7, "Apple Macbook Air",2000l, 100));
        misc.add(new Item(8, "Ream of Paper", 15l, 100));
        misc.add(new Item(9, "The Death of Marat", 500000000l, 1));




    }

    public static Item getItemWithIndex(int index) {
        for (int i = 0; i < fashion.size(); i++) {
            Item item = fashion.get(i); 
            if (item.index == index) {
                return item;
            }
        }
        for (int i = 0; i < realestate.size(); i++) {
            Item item = realestate.get(i); 
            if (item.index == index) {
                return item;
            }
        }
        for (int i = 0; i < misc.size(); i++) {
            Item item = misc.get(i); 
            if (item.index == index) {
                return item;
            }
        }
        return null;
    }


    public static void displaystore(){

        System.out.println("Below you will find a selection of items to purchae! Spend your money wisely!");
        System.out.println();

        System.out.println("Designer Fashion:");
        for (int i= 0; i <fashion.size(); i++){
            System.out.println(fashion.get(i).index + " " + fashion.get(i).label + ", price: " + fashion.get(i).price + ", count:" + fashion.get(i).count);

        }
        System.out.println();
        System.out.println("Western Real Estate:");
        for (int i= 0; i <realestate.size(); i++){
            System.out.println(realestate.get(i).index + " " + realestate.get(i).label + ", price: " + realestate.get(i).price + ", count: " + realestate.get(i).count);
        }

        System.out.println();
        System.out.println("Miscellaneous:");  
        for (int i= 0; i <misc.size(); i++){
            System.out.println(misc.get(i).index + " " + misc.get(i).label + ", price: " + misc.get(i).price + ", count: " + misc.get(i).count);

        }
        System.out.println();

 


    }








    
}
