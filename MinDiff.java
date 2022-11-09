/* 
This problem is in the PClassic 2019f Problem Set (https://pclassic.org/problems)
During lunch time, your friend tells you that there will
be a broomflying pop quiz this afternoon. In the
Magical Learning Gym, there are n consecutives stones
in a row and each with a different height. To pass the
quiz, you need to successfully (and gracefully) fly from
a stone to the consecutive one. Since the smaller the
height difference is, the higher chance of you passing
the quiz is, thus, as a newbie, you want to find the
minimum difference between two consecutive stones. 
Extra Challenge: 
Return the INDEX of the stone that you should 
stand by in a new function, minDiffStone(). 
*/
public class MinDiff {
    public static void main(String[] args) throws Exception {
        int[] intArray1 = { 1, 34, 4, 6, 14, 2 };
        int ans1 = minDiff(intArray1); // Should be 2 as |4 - 6| = 2;
        System.out.println("Min Diff of {1, 34, 4, 6, 14, 2} is: " + ans1);

        int[] intArray2 = { 23, 15, 46, 75, 6, 74, 100 };
        int ans2 = minDiff(intArray2); // Should be 8 as |23 - 15| = 8;
        System.out.println("Min Diff of {23, 15, 46, 75, 6, 74, 100} is: " + ans2);

    }

    // Do not modify above this line
    public static int minDiff(int[] stones) {
        int[] intArray1 = { 1, 34, 4, 6, 14, 2 };
        int minDiff = Integer.MAX_VALUE; // make it the biggest integer
       // return 0;

        for (int i = 0; i < intArray1.length ; i++) {
            int difference = Math.abs(intArray1[i+1] - intArray1[i]);
            //this takes the difference of the first value subtracted from the second value 
            //(meaning the first and second numbers in the array)
            int minimumDifference = minDiff(intArray1);

            System.out.println("The Min Diff of this is: " + minimumDifference);

        }

    //Pseudocode:
    //for each pair of consecutive numbers in Array1 calculate the difference 
    // (the absolute value)between each individual pair
    //for each difference between all the pairs in a certain array, 
    //determine the smallest difference within all of the given values.
    //Then, return the smallest value within the array (which is the smallest distance).


    //In other words, you want to go through each pair
    // of stones, take the absolute difference between them
    //and return the smallest difference (from the four pairs).


    //Side comment:
    //The one part that I am finding tricky is how to 
    //write in code "based on the smallest value, within all of the values
    //, return the smallest"
    }

}





