
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Books {
    int bookID;
    String bookTitle;
    int bookRating;
    
    Books(){
        this.bookID = 0;
        this.bookTitle = "Unknown";
        this.bookRating = 0;
    }
    
     Books(int bookID, String bookTitle, int bookRating){
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    }
     
     void setID(int ID){
         this.bookID = ID;
     }
     
     int getID(){
         return this.bookID;
     }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookRating() {
        return bookRating;
    }

    public void setBookRating(int bookRating) {
        this.bookRating = bookRating;
    }
    
    void displayInfo(){
        System.out.println("BookID: " + this.bookID + "\n Book Title: " + this.bookTitle + "\n Book Rating: " + this.bookRating);
    }
    
}

//to change to decreasing one just change the order of the object
class bookTitleComparator implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
    }
    
}
class bookRatingComparator implements Comparator<Books>{

    @Override
    public int compare(Books o1, Books o2) {
        if(o1.bookRating == o2.bookRating)
            return 0;
        else if(o1.bookRating > o2.bookRating)
            return 1;
        else
            return -1;
    }
    
}
