//Skylar Fraser 10
//Intermediate Programming- B Period 
//11.30.22

import java.util.Scanner;

//This will be the main class where we are allowed
//to actually run the program (because the other classes will all be
//incoporated in this class in some kind of way)
//The main method is stored here

//In this class, you will be assigning and initializng the different categories,
// the different questions, and within the different questions you will be assigning
//different values (strings)to the possible answers.

//You will additionally assign values to the point system 

public class BuzfeedQuiz {
    public static void main(String[] args) throws Exception {

//Categories are created here 
Category sot = new Category  ("Sign of the Times/Falling!" , "People just think that you are emo and are sad all the time but you are simply misunderstood!" +
"You prefer being in your own company then in the presence of others, and that's totally ok!");

Category kiwi = new Category ("Kiwi!", "You are a hardcore person who enjoys listening to classic rock like the Rolling Stones and Fleetwood Mac in their free time." + 
"People may find you annoying because they think that you try too hard to be different. But, you just have a cool, old soul!");

Category golden = new Category ("Golden!", "You have an easygoing personality that everyone wants to be around!" +
"You are extremely kind to others and are defintely the peacemaker when it comes to disagreements. We need more 'goldens' like you in this world.");


//Questions are created here along with their possible answers

Question q1= new Question("It's a Friday night and you have no homework to do! What do you plan on doing?!");
q1.possibleAnswers[0]= new Answer ("Watch a sad movie at home by myself.", sot);
q1.possibleAnswers[1]= new Answer (" See a rock band with my friends.", kiwi);
q1.possibleAnswers[2]= new Answer ("Go to the beach and watch the sunset.", golden);


Question q2= new Question("You were invited to a barbecue last mintue and have to pick up food from the grocery store. However, you missed the holiday rush and all of the shelves are practically empty with only a few items avaiable. What are you choosing to bring?");
q2.possibleAnswers[0]= new Answer ("Asparagus", sot);
q2.possibleAnswers[1]= new Answer ("Onion", kiwi);
q2.possibleAnswers[2]= new Answer ("Lemonade", golden);


Question q3= new Question("How would you describe your music taste?");
q3.possibleAnswers[0]= new Answer ("I'm not that in to music.", sot);
q3.possibleAnswers[1]= new Answer ("I like to explore underground artists", kiwi);
q3.possibleAnswers[2] = new Answer ("I only listen to songs from tiktok.", golden);


Question q4= new Question("What is your absolute dream vacation spot?");
q4.possibleAnswers[0]= new Answer ("Scotland.", sot);
q4.possibleAnswers[1]= new Answer ("Ibiza.", kiwi);
q4.possibleAnswers[2]= new Answer ("The Italian Riviera.", golden);


Question q5= new Question("Congratulations! You just won the lottery! What are you going to do with your money?");
q5.possibleAnswers[0]= new Answer ("Pay someone to make me a personalized jetpack and fly away.", sot);
q5.possibleAnswers[1]= new Answer ("Quit my job and pursue my love for music by starting a heavy metal rock band with my friends.", kiwi);
q5.possibleAnswers[2]= new Answer ("Move near the ocean with all of my friends and never have to worry about anything ever again.", golden);



// Below is a for loop that allows us to loop through 
//all five questions. For each question, the code will
//ask the question (meaning it will ask for input [1-3]),
//it will read the input given, and it will store a certain 
//amount of points to whichever category is associated with 
//the chosen answer (the user input).


Scanner sc = new Scanner(System.in);


gameIntro(sc);
Question[] qList = { q1, q2, q3, q4, q5 };


for (Question q : qList) {      //for each question within the list of questions, 
                                //whichever category is chosen (depending on the answer)
                                //will recieve one point (hence the c.points++)
    Category c = q.ask(sc);
    c.points++;


}




// Below are two arrays (one that contains the categories and one that
//contains the variable that stores the points for each individual category
Category[] cList = { sot, golden, kiwi };
int[] counts = { sot.points, golden.points, kiwi.points };


int index = getMostPopularCatIndex(counts);
System.out.println("If you were a Harry Styles song, you would be " + cList[index].cat);
System.out.println(cList[index].description);

}

public static void gameIntro(Scanner sc) {
// requires 1 to keep going 
System.out.println("Which Harry Styles song are you?");
System.out.println("You get to choose numbers 1-3 for every question. Please enter '1' to play!");


//This is a type of error checking that checks to see if the user
//puts in the incorrect input. So, the first one checks to see if the 
//input is not 1 since you need 1 to start the game. It will let the 
//user know what is wrong and then restart the game so that
//they can type in the new correct input. The second part is for 
//possible inputs that may not even be an integer, so a string 
//for example. It will do the exact same thing as the first error check. 
if (sc.hasNextInt()){
     int play = sc.nextInt();
     if (play != 1) {
        System.out.println("Unidentifiable input. Please enter 'Y' to play");
        gameIntro(sc);
}

} else {
    System.out.println("The input cannot be recieved. The game will now restart. Please make sure to type 1 to start the game.");
     sc.next(); 
     gameIntro(sc);
}
}



//The for loop below gets the most common category from the questions asked
// and will then return whichever ctaegory has the most points (or is "most 
//common")

//If two categories have the same amount of points and there is a tiebreaker,
//the computer will return the tiebreaker that has the index that comes up first
//(so not necessarily 0, but whiciever index has the first of the two tiebreakers).

public static int getMostPopularCatIndex(int[] counts) {
// returns the index that is the max
int maxCount = 0;
int maxIndex = 0;
for (int i = 0; i < counts.length; i++) {
    if (counts[i] > maxCount) {
        maxCount = counts[i];
        maxIndex = i;
    }
}
return maxIndex;
}


}







   
    

