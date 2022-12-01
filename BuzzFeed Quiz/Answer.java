public class Answer {
    //Fields
    String label; //this variable "label" is used to hold the name of each possible
                  //answer for each question

    Category cat; //this variable "cat" will store the name for each of the three 
                  //individual categories 

    Answer(String label, Category cat) {
        this.label = label;
        this.cat = cat;


        //the period in this.label and this.cat allows us to call a field 
        //the "this" part is specifically used when accessing a field that it is 
        //not within a general code block; so typically fields with solely local scope

    }

}
