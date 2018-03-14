/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String firstName;
    String lastName;
    int age;
    
    //declaring default constructor
    Person(){
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 1;
    }
    
    //parameterized constructor
    Person(String fNm, String lNm, int age){
        this.firstName = fNm;
        this.lastName = lNm;
        this.age = age;
        
    }
    
    //copy constructor
    Person(Person object){
        this.firstName = object.firstName;
        this.lastName = object.lastName;
        this.age = object.age;
    }
    
    void read(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first Name : ");
        this.firstName = input.nextLine();
        
        System.out.println("Enter last Name : ");
        this.lastName = input.nextLine();
        
        System.out.println("Enter age : ");
        this.age = input.nextInt();
    }
    
    void display(){
        
        System.out.println("FirstName : " + this.firstName);
        System.out.println("LastName : " + this.lastName);
        System.out.println("Age : " + this.age);
    }
}
