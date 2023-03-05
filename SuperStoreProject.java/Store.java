import java.util.ArrayList;



public class Store {
    public static void displaystore(){
        ArrayList <Item> fashion = new ArrayList();
        ArrayList <Item> realestate = new ArrayList();
        ArrayList <Item> misc = new ArrayList();

        fashion.add(new Item("The Himalayan Birkin", 500000l, 10));
        fashion.add(new Item("Solid Gold OVO x Air Jordans", 2000000l, 20));
        fashion.add(new Item("Gold Cartier Crash", 6000000l, 5));

        realestate.add(new Item("Kanye West's Former Wyoming Ranch", 20000000l, 1));
        realestate.add(new Item("20 Acre Plot of Land in a Rural Town in Indiana", 100000l, 50));
        realestate.add(new Item("40 Acre Plot w/ a Farm in Oregon",2000000l, 50));

        misc.add(new Item("The Persistence of Memory", 100000000l, 1));
        misc.add(new Item("Apple Macbook Air",2000l, 100));
        misc.add(new Item("Ream of Paper", 15l, 100));
        misc.add(new Item("The Death of Marat", 500000000l, 1));


        //This is just the portion that should display the store (but for some reason when it prints, 
        //it does not actually print out any of the items)
        //It just looks like this- [Item@14dad5dc, Item@18b4aac2, Item@764c12b6]
        System.out.println("Below you will find a selection of items to purchae! Spend your money wisely!");

        System.out.println("Designer Fashion:");
        System.out.println(fashion);

        System.out.println("Western Real Estate:");
        System.out.println(realestate);

        System.out.println("Miscellaneous");  
        System.out.println(misc);


    }








    
}
