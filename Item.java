import java.util.Random;
import java.util.ArrayList;


public class Item {

//Fields
String label; 
Long price; 
int count;
int sale;
Random rand;
ArrayList<Item> fashion;
ArrayList<Item> realestate;
ArrayList<Item> misc;

//Constructor
Item(String label, Long price, int count){
    this.label = label;
    this.price = price;
    this.count = count;

}

public void fashdisc(){
    Random rand = new Random ();

    int fashmin = 1200000;
    int fashmax = 1800000;
    int fashsale = rand.nextInt(fashmin, fashmax);
    for (int i = 0; i < 3;  i++){
        fashion.get(i).price -= fashsale;
    }
}

public void estatedisc(){
    int estatemin = 8000000;
    int estatemax = 9000000;
    int estatesale = rand.nextInt(estatemin, estatemax);
    for (int i = 3; i < 6; i++){
        realestate.get(i).price -= estatesale;
    }

}

public void miscdisc(){
    int miscmin = 75000000;
    int miscmax = 100000000;
    int miscsale = rand.nextInt(miscmin, miscmax);
    for (int i = 6; i < 11;  i++){
        misc.get(i).price -= miscsale;
    }

}

//public void  blackFridaySale(){
  
//}

 
//when this function is called (I'll try to make it random), it will take half off the 
//chosen item's value


}












