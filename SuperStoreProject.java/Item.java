import java.util.Random;


public class Item {
//Fields
String label; 
Long price; 
int count;
int sale;
int index;



Item(int index, String label, Long price, int count){
    this.label = label;
    this.price = price;
    this.count = count;
    this.index = index;

}
 

//The standard discount (which does not do anything except return the price for now because
//each subclass can override this function.)
public Long mainDiscount(Random rand) {
    return price;
}



/* public void blackFridaySale(ArrayList <Item> items){
    for (int i = 0; i < 3; i++){
        long fhalf = items.get(i).price ;
        this.price -= fhalf;
    }

    for (int i = 3; i < 6; i++){
        long rhalf = items.get(i).price;
        this.price -= rhalf;
    }

    for(int i = 6; i < 10; i++){
        long mhalf = items.get(i).price;
        this.price -= mhalf;
    }
} */


}



class Fashion extends Item{
    public Fashion (int index, String label, Long price, int count){
        super(index, label, price, count);
    }

    @Override 
    public Long mainDiscount (Random rand){
        Long fashmin = 1200000l;
        Long fashmax = 1800000l;
        long fashsale = rand.nextLong(fashmin, fashmax);
        for (int i = 0; i < 3;  i++){
            this.price -= fashsale;
        }
        return price;
    }
}




class RealEstate extends Item{
    public RealEstate (int index, String label, Long price, int count){
        super(index, label, price, count);

    }

    @Override 
    public Long mainDiscount (Random rand){
        Long estatemin = 8000000l;
        Long estatemax = 9000000l;
        long estatesale = rand.nextLong(estatemin, estatemax);
        for (int i = 3; i < 6; i++){
            this.price -= estatesale; 
        }
        return price;
    }
}


class Misc extends Item{

    public Misc (int index, String label, Long price, int count){
        super(index, label, price, count);
    }

    @Override 
    public Long mainDiscount (Random rand){
        Long miscmin = 75000000l;
        Long miscmax = 100000000l;
        long miscsale = rand.nextLong(miscmin, miscmax);
        for (int i = 6; i < 10;  i++){
            this.price -= miscsale;
        }
        return price;
    }
}




















