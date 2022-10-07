import java.util.Scanner;

public class interviewScript {

   public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner (System.in);
    System.out.println("Hey fellow user! Please enter your name!");

    String name = sc.nextLine();
    System.out.println("Welcome " + name + "! What is your favorite subject in school?");
    
    String subject = sc.nextLine();
    System.out.println("Oh really? To be honest I am not a huge fan of " + subject + ", but that's cool!");
    System.out.println("Ok. To start off with something random, we need to make a banner filled with our favorite words! Please type in any word so that we can determine if it works with our program.");

    String word = sc.nextLine(); 
    boolean isTooLong = word.length() > 5;
   

    if (isTooLong) {
        System.out.println("Oh that's too long. That will unfortunately not work. ");
     } else {
        System.out.println("You word with " +  word.length() + " letters can fit on our banner. Thank you!");
     } 

    }
   }


   

   


