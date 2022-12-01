import java.util.Scanner; 

public class Question {
    //Fields (variables)
    String label; //this variable "label" is used to hold the name of each possible
                  //answer for each question 

    Answer[] possibleAnswers = new Answer[3]; //this is an array of class Answer
                                              //and each possible answers variable 
                                              //will hold 3 "new Answers"


    Question(String label) {
        this.label = label;
    }

    // Within this class of Category, here is the function labeled 
    //"ask" which will then be used to ask the user a question in 
    //the main class.

    Category ask (Scanner sc) {
              // This for-loop goes through ecah index  
              System.out.println(this.label);
              for(int i = 0; i<possibleAnswers.length; i++) {
                  String choice = Integer.toString(i+1);
                  System.out.println("[" + choice + "]:" +
                      this.possibleAnswers[i].label);
              }

              //The code below is used for error checking.
              if (!sc.hasNextInt() ) {
                sc.next(); // This will throw away the incorrect input
                
                System.out.println("The input is not a number. Please type in a valid number between 1 and 3!");
                ask(sc);
              }
              int response = sc.nextInt();

              //The code below is used for error checking.
              //If the user puts in a value that it is greater than 3 (which is more
              //than the number of possible answers to choose from),then the game will 
              //restart 

              if (response > 3 || response < 1){
                System.out.println("The input cannot be recieved. Please type in a vaild input between 1 and 3.");
              }


    
            
            //This returns the possible answers 
            //it is written as "response-1" because the first 
            //possible answer corresponds to the number 1, but
            //with arrays we start at the index of 0
            
            return possibleAnswers[response - 1].cat;
        }

}


    
    
    







