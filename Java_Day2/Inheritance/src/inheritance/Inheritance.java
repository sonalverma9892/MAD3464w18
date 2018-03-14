/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person obj1 = new Person();
//        obj1.readData();
        obj1.display();
        
        Person sonal = new Person("Sonal","Verma",56);
        sonal.display();
        
        Person ankur = new Person(sonal);
        ankur.display();
        
//        Employee e1 = new Employee(1234.89);
//        e1.display();
        
        Employee e2 = new Employee();
        e2.display();
        
        e2.firstName = "SV";
        e2.lastName = "AM";
        e2.age = 45;
        e2.salary = 3542;
        e2.display();
        e2.display();
       
        //method overriding
        //methods name are same in subclass and super class the priority is given to subclass method so it will override the method of super class
        Employee e3 = new Employee();
        e3.read();
        e3.display();
    }
    
}
        //difference between method overloading and method overriding.
        //final keyword used with class and used with property
        //diamond problem