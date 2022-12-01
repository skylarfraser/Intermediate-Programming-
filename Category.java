public class Category {
    //Fields
    String label;       //this variable "label" is used to hold the name of each possible
                        //answer for each category 

    String description; //this variable "description" will output some sort
                        //sort of description of the category after the user
                        //recieves their category (after it is outputted)
    
    int points = 0;     //this variable "points" will serve as a "count" that stores
                        //the amount of points one will recieve for each possible answer 

    String cat;         //this variable "cat" will store the name for each of the three 
                        //individual categories 



    
    Category(String c, String description) {
        this.cat = c;
        this.description = description;
   

        //the period in this.cat and this.description allows us to call a field 
        //the "this" part is specifically used when accessing a field that it is 
        //not within a general code block; so typically fields with solely local scope
    }

}
