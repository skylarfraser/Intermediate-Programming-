//Skylar Fraser 
//Intermediate Programming
//Ms. Feng- B Period
//5/26/23

import java.util.*;


public class Main {
    static List <String> arrbev = new ArrayList<String>();  //beverages in an array list
    static List <String> linkbev = new LinkedList <String>();   //beverages in a linked list

    static long addALFinal;
    static long addLLFinal;
    static long removeALFinal;
    static long removeLLFinal;
    static long sizeALFinal;
    static long sizeLLFinal;
    static long containsALFinal;
    static long containsLLFinal;
    static long getALFinal;
    static long getLLFinal;
    

    


    public static void main(String[] args) throws Exception {
        addALFinal = addAL();
        addLLFinal = addLL();
        removeALFinal = removeAL();
        removeLLFinal = removeLL();
        sizeALFinal = sizeAL();
        sizeLLFinal = sizeLL();
        containsALFinal = containsAL();
        containsLLFinal = containsLL();
        getALFinal = getAL();
        getLLFinal = getLL();;

        results(addALFinal, addLLFinal, removeALFinal, removeLLFinal, sizeALFinal,  sizeLLFinal,  containsALFinal, containsLLFinal, getALFinal, getLLFinal);
    
    }

    public static long getTime(){
        Long start = System.currentTimeMillis();
        Long end = System.currentTimeMillis();
        Long time = end-start;
        return time;

        }


    //Add methods
    public static long addAL(){
        int i;
        Long start = System.currentTimeMillis();

        for (i = 0; i <1000; i++){
            arrbev.add("Espresso");
            arrbev.add("Latte");
            arrbev.add("Cappucino");
            arrbev.add( "Macchiato");
            arrbev.add("Cold Brew");
            arrbev.add( "Black Coffee");
            arrbev.add("Frappucino");
            arrbev.add("Hot Brew");

        }

        long end = System.currentTimeMillis();
        long addALFinal = end - start;

        return addALFinal;
    }  
    public static long addLL(){
        int i;
        Long start = System.currentTimeMillis();

        for (i = 0; i <1000; i++ ){
            linkbev.add("Espresso");
            linkbev.add("Latte");
            linkbev.add("Cappucino");
            linkbev.add("Macchiato");
            linkbev.add("Cold Brew");
            linkbev.add("Black Coffee");
            linkbev.add("Frappucino");
            linkbev.add("Hot Brew");

        }

        long end = System.currentTimeMillis();
        addLLFinal = end - start;

        return addLLFinal;
    }

    //Remove methods
    public static long removeAL(){
        int i;
        Long start = System.currentTimeMillis();
        for (i = 0; i <500; i++){
            arrbev.remove(0);    //examining time to remove an element from the beginning
            arrbev.remove(1);    //examining time to remove an element from the middle
            arrbev.remove(2);    //examining time to remove an element from the middle
            arrbev.remove(3);    //examining time to remove an element from the end

        }

        long end = System.currentTimeMillis();
         removeALFinal = end - start;

        return removeALFinal;
    } 
    public static long removeLL(){
        int i;
        //remove method
        Long start = System.currentTimeMillis();

        for (i = 0; i < 500; i++){
            linkbev.remove(0);    //examining time to remove an element from the beginning
            linkbev.remove(1);    //examining time to remove an element from the middle
            linkbev.remove(2);    //examining time to remove an element from the middle
            linkbev.remove(3);    //examining time to remove an element from the end

        }
        long end = System.currentTimeMillis();
         removeLLFinal = end - start;

        return removeLLFinal;
    }


    //Size methods
    public static long sizeAL(){
        int i;
        Long start = System.currentTimeMillis();

        for (i = 0; i<1000; i++){
            arrbev.size();
        }

        long end = System.currentTimeMillis();
        long sizeALFinal = end-start;
        return sizeALFinal;

    }
    public static long sizeLL(){
        int i;
        Long start = System.currentTimeMillis();
        for (i = 0; i <1000; i++){
            linkbev.size();
        }

        long end = System.currentTimeMillis();
        long sizeLLFinal = end -start;
        return sizeLLFinal;
    } 

    //Contains methods
    public static long containsAL(){
        int i;
        Long start = System.currentTimeMillis();

        for (i = 0; i <1000; i++){
            arrbev.contains("Espresso");     
            arrbev.contains("Macchiato");    
            arrbev.contains("Hot Brew");     
            arrbev.contains("Stawberry Refresher"); 
        }
        long end = System.currentTimeMillis();
        long containsALFinal = end -start;

        return containsALFinal;

    }
    public static long containsLL(){
        int i;
        //contains (check) method
       Long start = System.currentTimeMillis();

       for (i = 0; i <1000; i++){
        linkbev.contains("Espresso");    
        linkbev.contains("Macchiato"); 
        linkbev.contains("Hot Brew"); 
        linkbev.contains("Stawberry Refresher"); 
       }
       long end = System.currentTimeMillis();
       long containsLLFinal = end -start;

       return containsLLFinal;
       }

    //get methods
    public static long getAL(){
        int i;
        Long start = System.currentTimeMillis();
        for (i = 0; i<800; i++){
            arrbev.get(0);
            int size = arrbev.size() -1;
            arrbev.get(size);

        }
        long end = System.currentTimeMillis();
        long getALFinal = end -start;

        return getALFinal;

       }

    public static long getLL(){
        int i;
        Long start = System.currentTimeMillis();
        for (i = 0; i<800; i++){
            linkbev.get(0);
            int size = linkbev.size() -1;
            linkbev.get(size);

        }
        long end = System.currentTimeMillis();
        long getLLFinal = end -start;

        return getLLFinal;
    }

    

    public static void results(long addALFinal, long addLLFinal, long removeALFinal, long removeLLFinal, long sizeALFinal, long sizeLLFinal, long containsALFinal, long containsLLFinal, long getALFinal, long getLLFinal){
        System.out.println("Final Array List 'add' Time: " + addALFinal + " millisecond(s)");
        System.out.println("Final Linked List 'add' Time: " + addLLFinal + " millisecond(s)");
        System.out.println();

        System.out.println("Final Array List 'remove' Time: " + removeALFinal + " millisecond(s)");
        System.out.println("Final Linked List 'remove' Time: " + removeLLFinal + " millisecond(s)");
        System.out.println();

        System.out.println("Final Array List 'size' Time: " + sizeALFinal + " millisecond(s)");
        System.out.println("Final Linked List 'size' Time: " + sizeLLFinal + " millisecond(s)");
        System.out.println();

        System.out.println("Final Array List 'contains' Time: " + containsALFinal + " millisecond(s)");
        System.out.println("Final Linked List 'contains' Time: " + containsLLFinal + " millisecond(s)");
        System.out.println();

        System.out.println("Final Array List 'get' Time: " + getALFinal + " millisecond(s)");
        System.out.println("Final Linked List 'get' Time: " + getLLFinal + " millisecond(s)");
        System.out.println();


    }

    

    }

       


    

