import java.util.Random;
import java.util.ArrayList;


public class Item {

//Fields
String label; 
Long price; 
int count;
int sale;
int index;
Random rand;

//Constructor
//NOTE: MAYBE ADD A NUMBER FIELD THAT NUMBERS THE ITEM BASED ON ITS INDEX
//EX: [0] Bag
Item(int index, String label, Long price, int count){
    this.label = label;
    this.price = price;
    this.count = count;
    this.index = index;
}

public void addSale (){
    Random rand = new Random ();

    rand.nextInt(0,2);

    if (rand.nextInt() == 0){
        fashdisc();
    }
    else if (rand.nextInt() == 1){
        estatedisc();

    }
    else if (rand.nextInt() == 2){
        miscdisc();
    }

}



public void fashdisc(){
    Random rand = new Random ();

    int fashmin = 1200000;
    int fashmax = 1800000;
    int fashsale = rand.nextInt(fashmin, fashmax);
    for (int i = 0; i < 3;  i++){
        this.price -= fashsale;
    }
}

public void estatedisc(){
    int estatemin = 8000000;
    int estatemax = 9000000;
    int estatesale = rand.nextInt(estatemin, estatemax);
    for (int i = 3; i < 6; i++){
        this.price -= estatesale;
    }
}

public void miscdisc(){
    int miscmin = 75000000;
    int miscmax = 100000000;
    int miscsale = rand.nextInt(miscmin, miscmax);
    for (int i = 6; i < 11;  i++){
        this.price -= miscsale;
    }
}


 public void blackFridaySale(ArrayList <Item> fashion, ArrayList <Item> realestate, ArrayList <Item> misc){
    for (int i = 0; i < 3; i++){
        long fhalf = fashion.get(i).price ;
        this.price -= fhalf;
    }

    for (int i = 3; i < 6; i++){
        long rhalf = realestate.get(i).price;
        this.price -= rhalf;
    }

    for(int i = 6; i < 11; i++){
        long mhalf = misc.get(i).price;
        this.price -= mhalf;
    }
}


}












