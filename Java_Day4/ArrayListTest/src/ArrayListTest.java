
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class ArrayListTest {
    
    public static void main(String[] args){
        
        Books book1 = new Books(1,"The Sky", 8);
        Books book2 = new Books(2,"Necklace", 3);
        Books book3 = new Books(3,"Milk", 2); 
        Books book4 = new Books(4,"Journey", 3); 
        Books book5 = new Books(5,"Wonderer", 4);
        
        //to store in collection
        ArrayList<Books> library = new ArrayList<Books>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        
        System.out.println("No. of Books: " + library.size());
        
        library.add(2, new Books(10, "Pacific", 9));
        
        
        Collections.sort(library, new bookTitleComparator());
        Collections.sort(library, new bookRatingComparator());
        
        
        for(Books bk: library){
            bk.displayInfo();
        }
        
        library.forEach(bk -> {
//            bk.displayInfo();
        });
        
        
        
        
        // For Student Class
        Student s1 = new Student("Sonal", 11, 65.76);
        Student s2 = new Student("Ankur", 12, 78.76);
        Student s3 = new Student("Lizza", 13, 98.76);
        Student s4 = new Student("Ankita", 14, 34.76);
        Student s5 = new Student("Aken", 15, 45.76);
        
        
        
        //to store in collection
        ArrayList<Student> record = new ArrayList<Student>();
        record.add(s1);
        record.add(s2);
        record.add(s3);
        record.add(s4);
        record.add(s5);
        
        System.out.println("No. of Students: " + record.size());
        
        record.add(3, new Student("Anil", 9,100));
        
        Collections.sort(record, new studentNameComparator());
        Collections.sort(record, new studentPercentComparator());
        
        for(Student s: record){
            s.displayStudent();
        }
        
          
        
        
          
          
          
        
    }
    
}
